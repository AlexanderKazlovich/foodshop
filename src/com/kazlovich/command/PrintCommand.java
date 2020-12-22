package com.kazlovich.command;

import com.kazlovich.pool.Pool;

public class PrintCommand implements Command{
    @Override
    public void execute() {
        System.out.println(Pool.getPool());
    }
}
