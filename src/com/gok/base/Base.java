package com.gok.base;

/**
 * 基地类
 */
public class Base {
    private static Base base;

    private Base() {
    }

    public synchronized static Base getBase() {
        if (base == null) {
            base = new Base();
        }

        return base;
    }

    /**
     * 基地生命值
     */
    private int life = 1000;

    /**
     * 是否被摧毁
     */
    private boolean isDestroy = false;

    public boolean isDestroy() {
        return isDestroy;
    }

    public void setDestroy(boolean isDestroy) {
        this.isDestroy = isDestroy;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
