package com.lh.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Broker
 * @Desc //命令的调用类
 * @Author mi
 * @Date 2020/8/8 15:58
 */
public class Broker {
    private List<Command> commandList = new ArrayList<>();
    public void addCommand(Command command){
        commandList.add(command);
    }
    public void executeCommand(){
        for (Command command : commandList) {
            command.doCommand();
        }
    }
}
