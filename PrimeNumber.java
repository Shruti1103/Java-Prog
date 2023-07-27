import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no.");
        int n = sc.nextInt();
        sc.close();
        int i;
        int j;
        boolean isprime =true;
        for(i=2;i<=n;i++){
            for(j=2;j<=n/2;j++){
                if(i%j==0){
                   isprime =false;
                   break;
                }
                if(isprime){
                    if(n==1){
                        System.out.print("1 isneither prime nor composite");
                    }
                    else {
                        System.out.print("It is a prime no.");
                    }
                }
                else{
                    System.out.print("It is not a prime no.");
                }

            }
        }

    } 
}







