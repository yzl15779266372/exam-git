package com.exam.domain;

/**
 * Created by shkstart on 2019/11/26
 */
public class Test {
    private Integer id;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private String ans5;
    private String ans6;
    private String ans7;
    private String ans8;
    private String ans9;
    private String ans10;
    private Integer userID;
    private Integer testID;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", ans1='" + ans1 + '\'' +
                ", ans2='" + ans2 + '\'' +
                ", ans3='" + ans3 + '\'' +
                ", ans4='" + ans4 + '\'' +
                ", ans5='" + ans5 + '\'' +
                ", ans6='" + ans6 + '\'' +
                ", ans7='" + ans7 + '\'' +
                ", ans8='" + ans8 + '\'' +
                ", ans9='" + ans9 + '\'' +
                ", ans10='" + ans10 + '\'' +
                ", userID=" + userID +
                ", testID=" + testID +
                '}';
    }

    public Test(String ans1, String ans2, String ans3, String ans4, String ans5, String ans6, String ans7, String ans8, String ans9, String ans10, Integer userID, Integer testID) {
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.ans5 = ans5;
        this.ans6 = ans6;
        this.ans7 = ans7;
        this.ans8 = ans8;
        this.ans9 = ans9;
        this.ans10 = ans10;
        this.userID = userID;
        this.testID = testID;
    }

    public Test(Integer id, String ans1, String ans2, String ans3, String ans4, String ans5, String ans6, String ans7, String ans8, String ans9, String ans10, Integer userID, Integer testID) {

        this.id = id;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.ans5 = ans5;
        this.ans6 = ans6;
        this.ans7 = ans7;
        this.ans8 = ans8;
        this.ans9 = ans9;
        this.ans10 = ans10;
        this.userID = userID;
        this.testID = testID;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public void setAns5(String ans5) {
        this.ans5 = ans5;
    }

    public void setAns6(String ans6) {
        this.ans6 = ans6;
    }

    public void setAns7(String ans7) {
        this.ans7 = ans7;
    }

    public void setAns8(String ans8) {
        this.ans8 = ans8;
    }

    public void setAns9(String ans9) {
        this.ans9 = ans9;
    }

    public void setAns10(String ans10) {
        this.ans10 = ans10;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setTestID(Integer testID) {
        this.testID = testID;
    }

    public Integer getId() {

        return id;
    }

    public String getAns1() {
        return ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public String getAns5() {
        return ans5;
    }

    public String getAns6() {
        return ans6;
    }

    public String getAns7() {
        return ans7;
    }

    public String getAns8() {
        return ans8;
    }

    public String getAns9() {
        return ans9;
    }

    public String getAns10() {
        return ans10;
    }

    public Integer getUserID() {
        return userID;
    }

    public Integer getTestID() {
        return testID;
    }
}
