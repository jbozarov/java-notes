package com.sequence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting here... ");

        Counter ctr = new Counter();
        AnyClass ancltr = new AnyClass(ctr);
        ancltr.start();

        AnyClass ancltr2 = new AnyClass(ctr);
        ancltr2.start();
    }
}



class AnyClass extends Thread{
    Counter counter = new Counter();

    public AnyClass (Counter counter) {
        this.counter = counter;
    }

    public void run(){
        for ( int i = 0; i<10; i++ ) {
            System.out.println("Runnig " + Thread.currentThread().getName() + ", " + counter.getNext());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

}

class Counter {
    private int value;

    public synchronized int getNext(){
        value++;
        System.out.println(value);
        return value;
    }
}
