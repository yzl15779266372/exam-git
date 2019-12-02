package test;

import com.exam.db.JdbcUtils;
import com.exam.domain.One;
import com.exam.domain.Student;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by shkstart on 2019/11/26
 */
public class TestDemo {

    JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtils.getDataSource());

    public static void main(String[] args) throws SQLException {
        System.out.println(Void.class);
    }

    /**
     * 增加记录
     */
    @Test
    public void test(){
        String sql = "INSERT INTO student (name,password,username) VALUES(?,?,?)";
        int update = jdbcTemplate.update(sql, "蔡徐坤", "123", "cxk");
        System.out.println(update);
    }
    /**
     * 删除记录
     */
    @Test
    public void test1(){
        String sql = "DELETE FROM student WHERE id=?";
        int update = jdbcTemplate.update(sql, 4);
        System.out.println(update);
    }
    /**
     * 修改记录
     */
    @Test
    public void test2(){
        String sql = "UPDATE student set name = ? WHERE id = ?";
        int test = jdbcTemplate.update(sql, "宽面哥", 5);
        System.out.println(test);
    }
    /**
     * 查询一个Bean到Map
     */
    @Test
    public void test3(){
        String sql = "select * from student where id = ?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql,1);
        System.out.println(stringObjectMap);
    }
    /**
     * 查询所有对象到List<Map>中
     */
    @Test
    public void test4(){
        String sql = "SELECT * FROM student";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps);
    }
    /**
     * 查询所有记录到List<Bean>中
     */
    @Test
    public void test5(){
        String sql = "SELECT * FROM student ";
        List<Student> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        System.out.println(query);
    }
    /**
     * 查询单个值
     */
    @Test
    public void test6(){
        String sql = "SELECT * FROM student WHERE id = ?";
        Student student = jdbcTemplate.queryForObject(sql, Student.class,1);
        System.out.println(student);
    }
    @Test
    public void test7(){
        String sql = "SELECT * FROM one ";
        List<One> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<One>(One.class));
        for (One one : query){
            System.out.println(one);
        }
    }
    private OneDAO dao = new OneDAO();
    @Test
    public void test0(){
        String sql = "SELECT * FROM one WHERE id = ?";
        One one = dao.get(sql, 1);
        System.out.println(one);
    }
}
