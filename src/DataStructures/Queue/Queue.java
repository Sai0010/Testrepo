package DataStructures.Queue;

public class Queue {
    int arr[];
    int front;
    int back;
    int size;

    Queue(int size){
        this.size=size;
        arr = new int[size];
        front = -1;
        back = 0;
    }

    void enqueue(int val){
        if(back == size-1){
            System.out.println("Overflow");
            return;
        }
        back++;
        arr[back]=val;
        if(front == 1){
            front++;
        }
    }

    void dequeue(){
        if(front == -1 || front>back){
            System.out.println("Underslow");
            return;
        }
        front++;
    }
    int peek(){
        if(front == -1 || front>back){
            System.out.println("Underslow");
            return -1;
        }
        return arr[front];
    }
}
