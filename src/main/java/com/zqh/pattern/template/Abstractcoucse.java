package com.zqh.pattern.template;

/**
 * @Author：zhengqh
 * @date 2020/3/18 22:33
 **/
public abstract class Abstractcoucse {

    public final void  createCourse(){
        // 预习资料
        PreviewMaterials();
        // 直播授课
        liveRadio();
        //布置作业
        homeWork();
        // 检查作业  交给子类自己实现
        if(needCheckHomeWrok()){
            CheckHomeWrok();
        }
    }

    protected abstract void CheckHomeWrok();

    // 钩子方法
    protected boolean needCheckHomeWrok(){return false;}

    protected  void homeWork(){
        System.out.println("布置作业");
    }
    protected  void liveRadio(){
        System.out.println("直播授课");
    }
    protected  void PreviewMaterials(){
        System.out.println("预习资料");
    }
}
