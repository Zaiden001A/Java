package college;
import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args){
/*        int sales[]={123,234,156,167,145};
        int total_sales=0;

        for (int s:sales){
            System.out.println(s);
            total_sales+=s;
        }
        for (int i=0;i<sales.length;i++){
            System.out.println(sales[i]);
        }*/

        int weeklysales[][]=new int[2][5];


        for (int i=0;i<weeklysales.length;i++){
            System.out.println("Product:"+(i+1));
            for(int j=0;j<weeklysales[i].length;j++){
                System.out.println("week "+(j+1)+": "+weeklysales[i][j]);
            }
        }
    }
}

