import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    System.out.println("Please enter a number");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    while(num != 0){
      StringBuilder builder = new StringBuilder(num);
      for (int i = 0; i < num; i++) {
        builder.append("*");
      }
      String newString = builder.toString();
      System.out.println(newString);
      num--;
    }
    in.close();
  }
}
  }
}
}
