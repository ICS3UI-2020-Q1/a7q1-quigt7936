import java.util.Scanner;
/**
 * tells user what their letter grade was
 * @author Thomas Quigley
 */
public class Main {
  // takes the percentage and gives the user their letter
  public static void examMark(int examPercent) {
      if (examPercent > 79) {
        System.out.println("You got an A");
      } else if (examPercent > 69) {
        System.out.println("You got a B");
      } else if (examPercent > 59) {
        System.out.println("You got a C");
      } else if (examPercent > 49) {
        System.out.println("You got a D");
      } else {
        System.out.println("You got an F");
      }     
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask what their percentage was
    System.out.println("What percentage did you get on your exam?");
    int examPercent = input.nextInt();

    // tell them their letter grade
    examMark(examPercent);
  }
}
