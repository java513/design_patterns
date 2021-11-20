package com.lh.pattern.command;

/**
 * @ClassName CommandPatternDemo
 * @Desc //命令模式测试类
 * @Author mi
 * @Date 2020/8/8 16:01
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Broker broker = new Broker();
        Soldier soldier = new Soldier();
        Command attentionCommand = new AttentionCommand(soldier);
        Command standAtEaseCommand = new StandAtEaseCommand(soldier);
        broker.addCommand(attentionCommand);
        broker.addCommand(standAtEaseCommand);
        broker.executeCommand();
    }
}
