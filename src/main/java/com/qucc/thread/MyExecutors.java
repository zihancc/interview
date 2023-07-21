package com.qucc.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutors implements Runnable{
    @Override
    public void run() {
        System.out.println("MyExecutors..run...");

    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.submit(new MyExecutors());

        //关闭线程池
        threadPool.shutdown();
    }
}
