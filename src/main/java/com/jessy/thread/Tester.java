package com.jessy.thread;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread:" + i);
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        //MyThread
        MyThread myThread = new MyThread();
        myThread.start();
        //Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable:" + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread r = new Thread(runnable);
        r.start();
        //Runnable - Lambda
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable lambda:" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("main end");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ":" + i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}