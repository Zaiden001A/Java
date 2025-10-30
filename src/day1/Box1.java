package day1;

public class Box1 {
    int length;
    int width;
    int height;

    public void display(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
    public int volume() {
        return length * width * height;
    }

}
