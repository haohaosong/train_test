package com.gok.test;

import com.gok.hero.Zhuangzhou;
import com.gok.skill.impl.JiPao;
import com.gok.skill.impl.ZhiLiao;

/**
 * 测试类
 */
public class HeroTest {
    public static void main(String args[]) {
        //1.生成英雄
        Zhuangzhou zhuangzhou = new Zhuangzhou();
        //2.英雄自我介绍
        zhuangzhou.display();
        //3.选择英雄的召唤师技能
        zhuangzhou.setSkill(new ZhiLiao());
        //4.开始游戏
        System.out.println("游戏开始！");
        //5.使用普通技能攻击
        zhuangzhou.nomalAttract();
        //6.使用召唤师技能攻击
        zhuangzhou.skill();
    }
}
