package college;

public class Arr3dq {
    public static void main(String[] args){
        int arr[][][]={{{1,2,3},{4,5,6},{7,8,9}},
            {{10,11,12},{13,14,15},{16,17,18}},
            {{19,20,21},{22,23,24},{25,26,27}}
        };
        for (int i=0;i<3;i++){
            System.out.println("group:"+(i+1));
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
