package com.kazlovich.factory;

import com.kazlovich.command.Command;

public class CommandFactory {
    public static Command defineCommand(String command){
        return CommandType.valueOf(command).getCommand();
    }
}
