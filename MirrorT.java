import java.util.*;
 class MirrorT {
    public static void main (String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows");
    int a =  sc.nextInt();
    
    int i,j;
    for(  i=1;i<=a;i++)
    {
	 
    for(j=0;j<a-i;j++)
    {
         System.out.print(" ");
    }
	
    for(j=0;j<i;j++)
    {
       System.out.print("*");
    }
    System.out.println();
            
    }



    }

}

