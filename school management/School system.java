import java.util.Scanner;

class SchoolSystem {
  public static void main(String[] args) {
    System.out.println("Do you want to see your ranking?");


    System.out.print("Your name?");
    String studentName = new Scanner(System.in).next();

    System.out.println("hello " + studentName);
    System.out.println("hello " + studentName +" again");

    System.out.print("Your score");
    Integer score = new Scanner(System.in).nextInt();

    System.out.println("math" + score);
  }
}