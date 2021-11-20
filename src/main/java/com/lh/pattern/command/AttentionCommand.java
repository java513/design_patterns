package com.lh.pattern.command;

/**
 * @ClassName AttentionCommand
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 15:56
 */
public class AttentionCommand implements Command {
    Soldier soldier;
    public AttentionCommand(Soldier soldier){
        this.soldier=soldier;
    }
    @Override
    public void doCommand() {
        soldier.attention();
    }
}
