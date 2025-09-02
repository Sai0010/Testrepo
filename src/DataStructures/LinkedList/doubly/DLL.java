package DataStructures.LinkedList.doubly;



class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev= null;
    }
}
public class DLL {
    Node head;

    DLL() {
        head = null;
    }
    void insertatHead(int val){
        Node n = new Node(val);
        n.next=head;
        head=n;
    }
    void insertatTail(int val){
        Node n = new Node(val);
        if (head==null){
            head=n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    int getSizeLL(){
        int size = 0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    void insertatPos(int val,int pos){
        Node n = new Node(val);
        int sizeLL=getSizeLL();
        if(pos<0 || pos>sizeLL){
            System.out.println("Invalid Size!");
            return;
        }else if(pos==0){
            n.next=head;
            head=n;
        }else {
            Node temp=head;
            while(--pos>0){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }
    void deleteATHead(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node todelete=head;
        head=head.next;
        todelete=null;
    }
    void deleteBYValue(int val){
        if(head==null) return;
        if(head.data==val){
            deleteATHead();
            return;
        }
        Node temp=head;
        while (temp.next!=null && temp.next.data!=val ){
            temp=temp.next;
        }if(temp.next==null){
            System.out.println("Value was not found to be deleted");
            return;
        }
        Node todelete=temp.next;
        temp.next=temp.next.next;
        todelete=null;
    }

    void printll(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
}


class Drivercode{
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertatHead(10);
        dll.insertatHead(20);
        dll.insertatHead(30);
        dll.insertatHead(40);
        dll.printll();
        dll.insertatTail(100);
        dll.printll();
        dll.insertatPos(50, 0);
        dll.printll();
        dll.deleteATHead();
        dll.printll();
        dll.deleteBYValue(50);
        dll.printll();
    }
}
