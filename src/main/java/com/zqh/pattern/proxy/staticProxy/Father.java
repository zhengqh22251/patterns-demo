package com.zqh.pattern.proxy.staticProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:19
 **/
public class Father implements Person {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("爸爸：不小了，该找个老婆了");
        son.findLove();
        System.out.println("爸爸：我给你买一个吧");
    }
}
