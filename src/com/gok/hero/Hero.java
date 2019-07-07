package com.gok.hero;

import com.gok.skill.ISkill;

/**
 * 英雄类
 */
public abstract class Hero {
    /**
     * 英雄姓名
     */
    private String name;

    /**
     * 召唤师技能
     */
    private ISkill skill;

    private int nomalAttractValue;

    /**
     * 英雄自我介绍
     */
    public abstract void display();

    /**
     * 普通攻击
     */
    public abstract void nomalAttract();

    public int getNomalAttractValue() {
        return nomalAttractValue;
    }

    public void setNomalAttractValue(int nomalAttractValue) {
        this.nomalAttractValue = nomalAttractValue;
    }

    /**
     * 使用召唤师技能
     */
    public void skill() {
        skill.useSkill();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ISkill getSkill() {
        return skill;
    }

    public void setSkill(ISkill skill) {
        this.skill = skill;
    }
}
