package com.jobready.threading;

public class Application {
    public static void main(String[] args) {

        // code inside a main doesn't wait thread, thread takes time to fire so that is why we see Hello there! first
        // it is like async function in JS 


        Task taskRunner = new Task();
        taskRunner.start();

        System.out.println("Hello there!");


    }
}


class Task extends Thread {
    public void run() {
        for ( int i = 0; i<10; i++ ) {
            System.out.println("Number is " + i);
        }
    }
}
