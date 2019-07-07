package com.gok.test;

import com.gok.base.Base;
import com.gok.hero.Hero;
import com.gok.hero.LuBanSeven;
import com.gok.hero.Zhuangzhou;

/**
 * 基地测试类
 */
public class BaseTest {
    public static void main(String args[]) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //1.创建英雄
                Hero hero = new Zhuangzhou();
                //2.获取基地，攻击基地
                Base base = Base.getBase();
                destoryBase(hero, base);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //1.创建英雄
                Hero hero = new LuBanSeven();
                //2.获取基地，攻击基地
                Base base = Base.getBase();
                destoryBase(hero, base);
            }
        }).start();
    }

    /**
     * 英雄摧毁基地方法
     * @param hero
     * @param base
     */
    public static void destoryBase(Hero hero, Base base) {
        System.out.println(hero.getName() + ":正在攻击基地，攻击力:" + hero.getNomalAttractValue());

        while (base.getLife() > 0) {
            synchronized (base) {
                if (!base.isDestroy()) {
                    base.setLife(base.getLife() - hero.getNomalAttractValue());

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (base.getLife() > 0) {
                        System.out.println("英雄:【" + hero.getName() + "】正在攻击基地，基地剩余生命值:" + base.getLife());
                    } else {
                        System.out.println("基地已经被【" + hero.getName() + "】摧毁");
                        base.setDestroy(true);
                    }
                }
            }
        }
    }
}
