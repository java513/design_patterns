package com.lh.pattern.interpreter;

/**
 * @ClassName InterpreterPatternDemo
 * @Desc //解释器模式测试类
 * @Author mi
 * @Date 2020/8/8 16:14
 */
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression numercialExpression1 = new NumercialExpression(10, 8);
        Expression numercialExpression2 = new NumercialExpression(10, 20);
        Expression andExpressiokn = new AndExpressiokn(numercialExpression1, numercialExpression2);
        Expression orExpression = new OrExpression(numercialExpression1, numercialExpression2);
        System.out.println("10>8 && 10>20 ?"+andExpressiokn.interpret());
        System.out.println("10>8 || 10>20 ?"+orExpression.interpret());
    }
}
