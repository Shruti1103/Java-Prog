import java.util.*;
public class SolidRhombus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of rows");
    int n = sc.nextInt();
    System.out.print("Enter the no of columns");
    int m = sc.nextInt();
    int i,j;
    for(i=n;i>=1;i--){
        for(j=1;j<=i-1;j++){
          System.out.print(" ");
        }
        for(j=1;j<=m;j++){
          System.out.print("*");
        }
        System.out.println();
    }

  }  
}
