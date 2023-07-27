import java.util.*;
public class Down2 {
        public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows");
    int n = sc.nextInt();
    //System.out.print("Enter the no. of columns");
    //int b = sc.nextInt();
    sc.close();
    int i,j;
    for(i=n;i>=1;i--){
        for(j=n-i;j>=1;j--){
           System.out.print(" "); 
        }
        for(j=i ;j>=1;j--){
           System.out.print("*");
        }
        System.out.println();
    }




    
}
}
