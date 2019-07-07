package com.gok.hero;

/**
 * 英雄-鲁班七号
 */
public class LuBanSeven extends Hero {
    public LuBanSeven() {
        super.setName("鲁班七号");
        super.setNomalAttractValue(80);
    }

    @Override
    public void nomalAttract() {
        System.out.println("【鲁班七号】正在【普通攻击】，攻击力：" + this.getNomalAttractValue());
    }

    @Override
    public void display() {
        System.out.println("检测了对面的智商，嘿嘿嘿，看来无法发挥全部实力啦~");
    }

    @Override
    public void skill() {
        super.skill();
    }
}
