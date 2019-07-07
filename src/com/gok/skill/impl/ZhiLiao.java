package com.gok.skill.impl;

import com.gok.skill.ISkill;

/**
 * 治疗术
 */
public class ZhiLiao implements ISkill {

    @Override
    public void useSkill() {
        System.out.println("使用治疗术，回复30%血量");
    }
}
