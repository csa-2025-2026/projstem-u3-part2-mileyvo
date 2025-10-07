import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    // Problem 1
    double target = 12.345;
    System.out.println("Enter a number that is a double");
    double input = scan.nextDouble();

    if (input == target)
    {
      System.out.println("YES!");
    }
    else
    {
      System.out.println("NO");
    }

    // Problem 2
    int target2 = 48;
    System.out.println("Enter a number that is an int");
    int input2 = scan.nextInt();

    if (input2 == target2)
    {
      System.out.println("YES!!)");
    }
    else
    {
      System.out.println("NO!!");
    }

    // Problem 4
    

    



    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
