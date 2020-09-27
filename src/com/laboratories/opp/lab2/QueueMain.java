package com.laboratories.opp.lab2;

public class QueueMain {
    public static void main(String[] args) {
        Queue firstQueue = new Queue(4);
        Queue secondQueue = new Queue();
        firstQueue.push(20);
        firstQueue.push(30);
        firstQueue.push(40);
        firstQueue.printQueue();
        firstQueue.pop();
        firstQueue.printQueue();
        firstQueue.isFull();
        firstQueue.isEmpty();
        secondQueue.push(10);
        secondQueue.printQueue();
        secondQueue.push(100);
        secondQueue.printQueue();
        secondQueue.isEmpty();
        secondQueue.pop();
        secondQueue.isEmpty();
        secondQueue.printQueue();


    }
}
