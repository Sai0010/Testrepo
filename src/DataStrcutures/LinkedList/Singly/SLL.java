package DataStrcutures.LinkedList.Singly;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SLL {
    Node head;

    SLL(){
        head=null;
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
      SLL sll = new SLL();
      sll.insertatHead(10);
      sll.insertatHead(20);
      sll.insertatHead(30);
      sll.insertatHead(40);
      sll.printll();
      sll.insertatTail(100);
      sll.printll();
      sll.insertatPos(50,0);
      sll.printll();
    }
}