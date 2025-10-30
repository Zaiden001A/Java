package day1;

public class Box2 {
    public static void main(String args[]) {
        Box1 b1;
        b1=new Box1();
        b1.length=10;
        b1.width=20;
        b1.height=30;
        int vol=b1.volume();
        System.out.println("Volume is: "+vol);
    }
}
