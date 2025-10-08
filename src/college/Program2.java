package college;

public class Program2 {
    int rollno;
    String name;
    String course;

    void displaydetails(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(course);
    }

    public static void main(String[] args){
        Program2 p2=new Program2();
        p2.rollno=100;
        p2.name="John";
        p2.course="CSE";
       // System.out.println(p2.rollno);

        p2.displaydetails();
    }
}
