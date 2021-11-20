package com.lh.pattern.command;

/**
 * @ClassName StandAtEase
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 15:57
 */
public class StandAtEaseCommand implements Command {
    Soldier soldier;
    public StandAtEaseCommand(Soldier soldier){
        this.soldier=soldier;
    }
    @Override
    public void doCommand() {
        soldier.standAtEase();
    }
}
