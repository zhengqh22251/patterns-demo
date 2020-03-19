package com.zqh.pattern.chainBuilder;


/**
 * @Author：zhengqh
 * @date 2020/3/19 11:42
 **/
public class CourseBuilder {
    private Course course =new Course();
    public CourseBuilder addName(String name){ course.setName(name);return this; }
    public CourseBuilder addVadio(String Vadio){ course.setVadio(Vadio);  return this;}
    public CourseBuilder addHomeWork(String HomeWork){ course.setHomework(HomeWork);  return this;}
    public Course builder(){
        return course;
    }
}
