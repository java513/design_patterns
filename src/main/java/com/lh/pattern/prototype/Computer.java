package com.lh.pattern.prototype;

/**
 * @ClassName Computer
 * @Desc //原型模式
 * @Author mi
 * @Date 2020/8/8 9:32
 */
public abstract class Computer implements Cloneable{
    protected String type;

    void make(){};

    @Override
    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
