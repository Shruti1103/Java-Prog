import java.util.*;
public class Invertednumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows");
        int n = sc.nextInt();
        sc.close();
        int i,j;   
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }         
            System.out.println();
        }
    }
    
}
