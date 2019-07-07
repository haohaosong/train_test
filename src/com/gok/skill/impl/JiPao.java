package com.gok.skill.impl;

import com.gok.skill.ISkill;

/**
 * 召唤师技能-疾跑
 */
public class JiPao implements ISkill {
    @Override
    public void useSkill() {
        System.out.println("使用疾跑，加速30%移动速度");
    }
}
