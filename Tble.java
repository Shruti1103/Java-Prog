import java.util.*;
public class Tble {
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int number = sc.nextInt();
        System.out.println("Table of the no. ");
        
        sc.close();

        int result;
        int i;
        for(i=0;i<=10;i++){
                result= i*number;
               System.out.println(result);
        }

    }
}
