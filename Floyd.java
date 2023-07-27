import java.util.*;
public class Floyd {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.print(" Enter the no. of rows ");
            int n = sc.nextInt();
            sc.close();
            int i,j;
            int number =1;
            for (i=1;i<=n;i++){
                for(j=1;j<=i;j++){
                        System.out.print(number + " ");
                        number++;
                }
                System.out.println();
            }
        }
    }