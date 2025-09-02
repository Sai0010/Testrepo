package OOPs;

public class Student {
    String name;
    int usn;
    static String college;

     Student(String name, int usn){
        this.name=name;
        this.usn=usn;
        college="JIT";
    }

    void Printdetails(){
        System.out.println("name: " + this.name);
        System.out.println("usn: " + this.usn);
        System.out.println("college: " + college);
    }

    public static void main(String[] args) {
        Student s1= new Student("sai",128);
        Student s2 = new Student("subramanya",345);
        s1.Printdetails();
        s2.Printdetails();
    }
}

