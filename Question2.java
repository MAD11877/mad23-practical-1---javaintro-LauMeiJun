import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    System.out.println("Please enter your height");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    System.out.println("Height: " + height);
    in.close();
  }
}
