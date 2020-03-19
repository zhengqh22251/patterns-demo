package com.zqh.pattern.chainBuilder;

/**
 * @Author：zhengqh
 * @date 2020/3/19 11:40
 **/
public class Course {
    private String name;
    private String vadio;
    private String homework;

    @Override
    public String toString() {
        return  "【name ="+name+"】,"+
                "【vadio ="+vadio+"】,"+
                "【homework ="+homework+"】";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVadio() {
        return vadio;
    }

    public void setVadio(String vadio) {
        this.vadio = vadio;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }
}
