import java.util.*;
 class Reversenumber{
    public static void main (String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows");
    int a =  sc.nextInt();
    
    int i,j;
    for( i=1;i<=a;i++){
        for( j=1; j<= a-i+1; j++){ 
            
                System.out.print(j+" ");
            }
         System.out.println();   
            
    }



    }

}
