package com.gok.hero;

/**
 * 英雄-庄周
 */
public class Zhuangzhou extends Hero {

    public Zhuangzhou() {
        super.setName("庄周");
        super.setNomalAttractValue(50);
    }

    @Override
    public void skill() {
        super.skill();
    }

    @Override
    public void nomalAttract() {
        System.out.println("【庄周】正在【普通攻击】.攻击力：" + this.getNomalAttractValue());
    }

    @Override
    public void display() {
        System.out.println(this.getName() + ":" + "蝴蝶是我，我就是蝴蝶~");
    }
}
