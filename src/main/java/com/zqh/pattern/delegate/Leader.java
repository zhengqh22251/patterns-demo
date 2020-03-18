package com.zqh.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：zhengqh
 * @date 2020/3/18 21:45
 **/
public class Leader  implements Employee  {
    // 这里结合策略模式 简化 if else
    protected Map<String,Employee> map =new HashMap();

    public Leader() {
       map.put("java",new EmployeeA());
       map.put("python",new EmployeeB());
    }

    public void doing(String task) {
           if(!map.containsKey(task)){
               System.out.println("老子不会！");
               return;
           }
             map.get(task).doing(task);

            /* if("java".equals(task)){
                new EmployeeA().doing(task);
            }else if("python".equals(task)){
                new EmployeeB().doing(task);
            }else{
                System.out.println("老子不会！");
            }*/
    }
}
