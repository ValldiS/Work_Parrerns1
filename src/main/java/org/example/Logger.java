package org.example;

import java.time.LocalDateTime;

public class Logger {

    private static Logger log = null;

    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now() + "]" + "[" + num++ + "] " + msg);
    }

    private Logger() {

    }

    public static Logger getInstance() {
        if (log == null) log = new Logger();
        return log;
    }

}
