import java.util.*;
public class HalfpyramidReverse {
        public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows");
    int n = sc.nextInt();
    //System.out.print("Enter the no. of columns");
    //int b = sc.nextInt();
    sc.close();
    int i,j;
    for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
           System.out.print(" ");
        }
        for(j=1 ;j<=i;j++){
           System.out.print("*");
        }
        System.out.println();
    }




    
}
}
