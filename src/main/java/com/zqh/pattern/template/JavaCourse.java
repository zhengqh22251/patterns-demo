package com.zqh.pattern.template;

/**
 * @Author：zhengqh
 * @date 2020/3/18 22:36
 **/
public class JavaCourse extends Abstractcoucse{

    private boolean needCheck;

    public void setNeedCheck(boolean needCheck) {
        this.needCheck = needCheck;
    }

    @Override
    protected boolean needCheckHomeWrok() {
        return this.needCheck;
    }

    @Override
    protected void CheckHomeWrok() {
        System.out.println("检查java作业");
    }
}
