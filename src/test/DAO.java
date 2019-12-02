package test;

import com.exam.db.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by shkstart on 2019/11/27
 */
public class DAO<T> {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtils.getDataSource());
    private Class<T> clazz;

    public DAO() {
        Type superClass = getClass().getGenericSuperclass();
        if (superClass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) superClass;
            Type[] typeArgs = parameterizedType.getActualTypeArguments();
            if (typeArgs != null && typeArgs.length > 0) {
                if (typeArgs[0] instanceof Class) {
                    clazz = (Class<T>) typeArgs[0];
                }
            }
        }
    }

    public <E> E getForValue(String sql,Object ... args){
        try {
            return (E)jdbcTemplate.queryForObject(sql,Object.class,args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<T> getForList(String sql,Object ... args){
        try {
            return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(clazz),args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public T get(String sql,Object ... args){
        try {
            List<T> all =getForList(sql,args);
            if (all.size()>0){
                return all.get(0);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void update(String sql,Object ... args){
        try {
            jdbcTemplate.update(sql,args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
