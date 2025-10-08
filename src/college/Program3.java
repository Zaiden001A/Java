package college;

public class Program3 {
    String noplate;
    String modelno;

    void displaydetails(){
        System.out.println(noplate);
        System.out.println(modelno);
    }

    public static void main(String[] args){
        Program3 p3=new Program3();
        p3.noplate=" UK 02 9999";
        p3.modelno="Spidey Mobile";
        // System.out.println(p2.rollno);

        p3.displaydetails();
    }
}
