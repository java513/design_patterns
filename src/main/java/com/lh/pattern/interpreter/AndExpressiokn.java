package com.lh.pattern.interpreter;

/**
 * @ClassName AndExpressiokn
 * @Desc //与表达式
 * @Author mi
 * @Date 2020/8/8 16:11
 */
public class AndExpressiokn implements Expression {
    private Expression expression1;
    private Expression expression2;
    public AndExpressiokn(Expression expression1,Expression expression2){
        this.expression1=expression1;
        this.expression2=expression2;
    }

    @Override
    public boolean interpret() {
        return expression1.interpret()&&expression2.interpret();
    }
}
