import java.util.*;
public class Solid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows");
    int n = sc.nextInt();
    System.out.println("Enter the no of column");
    int m = sc.nextInt();
    int i,j;
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
          System.out.print("*");
        }
        System.out.println();
    }

  }  
}
