package com.jobready.threading;

public class Application {
    public static void main(String[] args) {

        // code inside a main doesn't wait thread, thread takes time to fire so that is why we see Hello there! first
        // it is like async function in JS

        System.out.println("Starting thread 1");
        Thread t1 = new Thread(new Task("B"));
        t1.start();

        System.out.println("Starting thread 2");

//        taskRunner.start(); you san call start only once with same object, instead need to create new ojbect

        Thread t2 = new Thread(new Task("A"));
        t2.start();


    }
}


class Task extends Thread {
    String name;

    public Task(String name) {
        this.name = name;
    }



    public void run() {
        Thread.currentThread().setName(this.name);
        for ( int i = 0; i<10; i++ ) {
            System.out.println("Number is " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
