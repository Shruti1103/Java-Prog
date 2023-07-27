import java.util.Scanner;

public class Hollow {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. of rows");
        int n = sc.nextInt();
        System.out.print("Enter the no. of column");
        int m = sc.nextInt();
        sc.close();

        int i,j;
        for (i=0;i<=n;i++){
            for(j=0;j<=m;j++){
                if(i==0 || j==0 || i==n|| j==m){
                     System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }

        
    }
    
}
