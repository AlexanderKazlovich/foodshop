package com.kazlovich.factory;

import com.kazlovich.command.Command;
import com.kazlovich.command.CreateCommand;
import com.kazlovich.command.PrintCommand;

public enum CommandType {
    PRINT_ALL(new PrintCommand()),
    CREATE (new CreateCommand());

    CommandType(Command command) {
        this.command = command;
    }

    private Command command;

    public Command getCommand() {
        return command;
    }
}
