import java.util.*;
public class Downhalfpyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows");
        int a = sc.nextInt();
       // System.out.print("Enter the no of columns");       
         //int b = sc.nextInt();
         sc.close();
        int i,j;
         for(i=a;i>=1;i--){
            for(j=i;j>=1;j--){
               System.out.print("*");
            }
            System.out.println();

         }



    }
}



