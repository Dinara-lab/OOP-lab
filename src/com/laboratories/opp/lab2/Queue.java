package com.laboratories.opp.lab2;

public class Queue {
    int front;
    int rear;
    int capacity;
    int queue[];
    boolean isFixedSized;


    public Queue(int maxSize) {
        this.front = this.rear = 0;
        this.isFixedSized =true;
        this.capacity = maxSize;
        this.queue = new int[capacity];
    }

    public Queue() {
        this.front = this.rear= 0;
        this.queue = new int[20];
        this.isFixedSized = false;
    }


    public void push(int value) {

        if (isFixedSized) {
            queue[rear] = value;
            rear++;
        }else{
            if (queue.length==rear){
                int[] newArray = new int[queue.length*2];
                 for (int i =0; i<queue.length;i++){
                     newArray[i]=queue[i];
                 }
                 newArray[rear] = value;
                 queue = newArray;

            }else {
                queue[rear]=value;
            }
            rear++;
        }
    }

    public void pop() {
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }

    public void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);

        }
        System.out.println();
    }

    public void isFull() {
        if (!isFixedSized)
        {
            System.out.println("never empty");}

        else if (capacity == rear) {
            System.out.println("Queue is full");
        }else {
            System.out.println("not full");
        }
    }

    public void isEmpty() {


         if (front == rear) {
            System.out.println("Queue is empty");
        }else{
            System.out.println("not empty");
        }

    }
}

