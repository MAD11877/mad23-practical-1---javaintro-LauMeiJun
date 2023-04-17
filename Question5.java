import java.util.Scanner;

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
    
    
    List<Integer> Numbers = new ArrayList<>();
    System.out.println("Please enter a number");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    while(num != 0){
      System.out.println("Number:");
      Scanner no = new Scanner(System.in);
      int Numb = in.nextInt();
      Numbers.add(Numb);
      num--;
    }
    for (int i = 0; i < num; i++) {
      System.out.println(Numbers.get(i));
    }
   int maxCount = 0;
    for (int i = 0; i < num; i++) {
      int value = Numbers.get(i);
        int count = 1;
        for (int j = 0; j < num; j++) {
            if (Numbers.get(j) == value)
                count++;
            if (count > maxCount) {
                int mode = value;
                maxCount = count;
              System.out.println(mode);
              break;
            }
        }
    }
    
    in.close();
    
  }
}
