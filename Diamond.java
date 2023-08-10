import java.util.*;
public class Diamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows");
        int n = sc.nextInt();
        sc.close();

        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i)-1;j++){
               System.out.print("*"); 
            }
            System.out.println( );
        }
        // lower half
        for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i)-1;j++){
               System.out.print("*"); 
            }
            System.out.println( );
        }
    }
}
