import java.util.*;
public class Table {
    public static void name(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the no."); 
     int a = sc.nextInt();
     sc.close();
     int i;
     for(i=0;i<=10;i++){
         System.out.println(i*a);
     }
       
    } 
 }
 