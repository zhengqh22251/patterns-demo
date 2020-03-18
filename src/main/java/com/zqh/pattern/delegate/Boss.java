package com.zqh.pattern.delegate;

/**
 * @Author：zhengqh
 * @date 2020/3/18 21:42
 **/
public class Boss {
     public void command(String task,Leader leader){
              leader.doing(task);
     }
}
