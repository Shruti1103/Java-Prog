import java.util.*;
public class HollowRect {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows");
    int a = sc.nextInt();
    System.out.print("Enter the no. of column");
    int  b= sc.nextInt();
    int i,j;
    for(i=1;i<=a;i++) {
        for(j=1;j<=b;j++) {
            if(i==1 || j==1 || i==a || j==b ) {
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        } 
        System.out.println();
    }
   
    
   }
}
