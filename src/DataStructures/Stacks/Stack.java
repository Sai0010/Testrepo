package DataStructures.Stacks;

public class Stack {
    int arr[];
    int top;
    int size;

    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    void push(int val){
        if(top == size-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top] = val;
    }
    void pop(){
        if(top == -1){
            System.out.println("Underflow");
            return;
        }
        top--;
    }
    int Top(){
        if(top == -1){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top == -1;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(20);
        st.push(30);
        System.out.println(st.Top());
        for(int i=0;i< st.size;i++){
            System.out.println("Stack: "+ st.arr[i]);
        }
    }
}
