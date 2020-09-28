package com.laboratories.opp.lab2;

public class QueueMain {
    public static void main(String[] args) {
        Queue firstQueue = new Queue(4);
        Queue secondQueue = new Queue();
        firstQueue.push(20);
        firstQueue.push(30);
        firstQueue.push(40);
        firstQueue.printQueue();
        firstQueue.isFull();
        firstQueue.isEmpty();
        firstQueue.pop();
        firstQueue.printQueue();
        firstQueue.pop();
        firstQueue.printQueue();
        firstQueue.pop();
        firstQueue.printQueue();
        firstQueue.isEmpty();

        secondQueue.push(10);
        secondQueue.push(100);
        secondQueue.push(1000);
        secondQueue.printQueue();
        secondQueue.isFull();
        secondQueue.isEmpty();
        secondQueue.pop();
        secondQueue.printQueue();
        secondQueue.pop();
        secondQueue.printQueue();
        secondQueue.pop();
        secondQueue.printQueue();
        secondQueue.isEmpty();

    }
}
