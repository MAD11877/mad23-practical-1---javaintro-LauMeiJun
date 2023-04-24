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
    //System.out.println("Please enter your height");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    //System.out.println("Height: " + height);
    //System.out.println("Please enter your weight");
    double weight = in.nextDouble();
    //System.out.println("Weight: " + weight);
    double BMI = (weight / (height * height));
    System.out.println(BMI);
    in.close();
  }
}
