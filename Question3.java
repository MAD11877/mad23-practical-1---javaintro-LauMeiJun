import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    System.out.println("Please enter a number");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int total = (num * num);
    System.out.println(total);
    in.close();
    
  }
}
