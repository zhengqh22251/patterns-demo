package com.zqh.pattern.Builder_simple;


/**
 * @Author：zhengqh
 * @date 2020/3/19 11:42
 **/
public class CourseBuilder {
    private Course course =new Course();
    public void addName(String name){ course.setName(name); }
    public void addVadio(String Vadio){ course.setVadio(Vadio); }
    public void addHomeWork(String HomeWork){ course.setHomework(HomeWork); }
    public Course builder(){
        return course;
    }
}
