package com.qucc.thread;

import com.qucc.utils.LoggerUtils;

import static com.qucc.utils.LoggerUtils.*;

public class WaitVsSleep {
    static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException{
//        illagalWait();
//        waiting();
        sleeping();
    }

    public static void illagalWait() throws InterruptedException{
        synchronized (LOCK) {
            LOCK.wait();
        }
    }

    private static void waiting() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                try {
                    LoggerUtils.get("t").debug("waiting...");
                    LOCK.wait(5000L);
                } catch (InterruptedException e) {
                    LoggerUtils.get("t").debug("interrupted...");
                    e.printStackTrace();
                }
            }
        }, "t1");
        t1.start();

        Thread.sleep(100);
        synchronized (LOCK) {
            main.debug("other...");
        }

    }

    private static void sleeping() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                try {
                    get("t").debug("sleeping...");
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    get("t").debug("interrupted...");
                    e.printStackTrace();
                }
            }
        }, "t1");
        t1.start();

        Thread.sleep(100);
        t1.interrupt();
        /*synchronized (LOCK) {
            main.debug("other...");
        }*/
    }
}
