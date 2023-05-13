import java.util.*;

public class Sum {
  public static void main(String[] args)  {
   
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n");
    int n = sc.nextInt();
    sc.close();
    int sum=0;
    int i;
    for(i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    System.out.println(sum);
   
  }
  
}
