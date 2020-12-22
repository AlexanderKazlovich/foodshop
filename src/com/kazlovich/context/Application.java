package com.kazlovich.context;

public enum Application {
    INSTANCE;
    public void start(){
        ApplicationMenu.getApplicationMenu().printAvailableOptions();
    }
}
