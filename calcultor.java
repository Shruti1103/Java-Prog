import java.util.*;
public class calcultor {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number");
      int a = sc.nextInt();
      System.out.println("Enter the second number");
      int b = sc.nextInt();
      System.out.print("Choose the operator");
      int operator = sc.nextInt();
      sc.close();
      switch(operator){
        case 1: 
        System.out.println(a+b);
        break;
        case 2: 
        System.out.println(a-b);
        break;
        case 3: 
        System.out.println(a*b);
        break;
        case 4: 
        System.out.println(a/b);
        break;
        case 5: 
        System.out.println(a%b);
        break;

        default:
        System.out.println("Invalid operation");

      }



    }
}
