package com.laboratories.opp.lab2;

public class Queue {
    private int front;
    private int rear;
    private int capacity;
    private int[] queue;
    private boolean isFixedSized;

    public Queue(int maxSize) {
        this.front = this.rear = 0;
        this.isFixedSized =true;
        this.capacity = maxSize;
        this.queue = new int[capacity];
    }

    public Queue() {
        this.front = this.rear= 0;
        this.queue = new int[32767];
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
        int i = 0;
        int elementToExtract;
        elementToExtract = queue[front];
        for (; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        System.out.println("The extracted element is:" + elementToExtract);
    }

    public void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " <-- ");
        }

        System.out.println();
    }

    public void isFull() {
        if (!isFixedSized)
        {
            System.out.println("never full");}
        else if (capacity == rear) {
            System.out.println("Queue is full");
        }else {
            System.out.println("not full");
        }
    }

    public boolean isEmpty() {
        if (front == rear) {
            System.out.println("queue is empty\n");
        }else{
            System.out.println("queue is not empty\n");
        }
        return false;
    }

    public String readString() {
        return null;
    }
}

