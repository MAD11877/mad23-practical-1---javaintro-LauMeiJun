import java.util.Scanner;

import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
    
    
    List<Integer> Numbers = new ArrayList<Integer>();  
    System.out.println("Please enter a number");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    while(num > 0){
      System.out.println("Number:");
      Scanner no = new Scanner(System.in);
      int Numb = no.nextInt();
      Numbers.add(Numb);
      
        num--;
      
    }

    //System.out.print(Numbers);
    
    int maxCount = 0;
    int mode = 0;
    for (int i = 0; i < Numbers.size(); i++) {
      int value = Numbers.get(i);
      int count = 1;
      for (int j = 0; j < Numbers.size(); j++) {
        if (Numbers.get(j) == value){
                count++;
            if (count > maxCount) {
                mode = value;
                maxCount = count;
            }
        }
    }
  } 
    
          System.out.println(mode);
  }
}
