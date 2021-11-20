package com.lh.pattern.interpreter;

/**
 * @ClassName NumercialExpression
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 16:09
 */
public class NumercialExpression implements Expression {
    private int value1;
    private int value2;
    public NumercialExpression(int value1,int value2){
        this.value1=value1;
        this.value2=value2;
    }

    @Override
    public boolean interpret() {
        return (value1-value2)>0;
    }
}
