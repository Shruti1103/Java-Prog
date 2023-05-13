import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no.");
        int a = sc.nextInt();
        System.out.print("Enter the second no.");
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
        System.out.println("invalid input");

}
}
}
