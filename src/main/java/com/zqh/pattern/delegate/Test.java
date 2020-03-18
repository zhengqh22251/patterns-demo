package com.zqh.pattern.delegate;

/**
 * @Author：zhengqh
 * @date 2020/3/18 21:49
 **/
//  BOSS 将任务委派给 leader leader找对应的员工做事
public class Test {
    public static void main(String[] args) {
          new Boss().command("java",new Leader());
          new Boss().command("python",new Leader());
          new Boss().command("c++",new Leader());
    }
}
