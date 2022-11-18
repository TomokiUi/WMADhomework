import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userScore1;
        int userScore2;
        int userScore3;
        int userScore4;
        int userScore5;
        String userName = "";
        double sum = 0;
        double average = 0;
        double nextScore = 0;



        System.out.println("enter your name");
        userName = sc.next();
        System.out.println("enter your math scores.");
        userScore1 = sc.nextInt();
        System.out.println("enter your English scores.");
        userScore2 = sc.nextInt();
        System.out.println("enter your science scores.");
        userScore3 = sc.nextInt();
        System.out.println("enter your society scores.");
        userScore4 = sc.nextInt();
        System.out.println("enter your Japanese scores.");
        userScore5 = sc.nextInt();

        sum = userScore1 + userScore2 + userScore3 + userScore4 + userScore5;
        average = sum / 5;
        double theGap = 0;


        char option;
        System.out.println("===========WELCOME TO WMAD SCHOOL==========");
        System.out.println("===============" + userName + "===================");


        System.out.println();


        do {
            System.out.println("=======================================");
            System.out.println("1. Check your total score");
            System.out.println("2. Check your average");
            System.out.println("3. Exit");

            System.out.println("Please enter a choice : ");
            option = sc.next().charAt(0);
            System.out.println();

            switch (option) {

                case '1':
                    System.out.println("=================================");

                    System.out.println("your total score is " + sum);
                    System.out.println("=================================");
                    System.out.println("Your next target score?");
                    nextScore = sc.nextDouble();
                    theGap = nextScore - sum;

                    System.out.println("The gap between your current score and your target score is " + theGap);
                    System.out.println();
                    break;

                case '2':
                    System.out.println("=================================");
                    System.out.println("Your average score is " + average);
//                        System.out.println("The gap between your scores and class average " + gap );
                    System.out.println("=================================");
                    System.out.println();
                    break;

                case '3':
                    System.out.println("=================================");
                    sc.close();

                    break;

                default:
                    System.out.println("Invaild Option, Please enter a vaild input");
            }
        } while (option != '3');
        System.out.println();
        System.out.println("Good luck!");
    }
    }

//        =============================================================
//        String[] array = userScore.split(",");
//        List intArray = new ArrayList<Integer>();

//        System.out.println(userName);
//        System.out.println("your total score is " + sum);
//        System.out.println("your average score is " + sum / 5);

//        System.out.println(array[0] + array[1]);
//        for(int i = 0; i < array.length; i++){
//            intArray.add(Integer.parseInt(array[i]));
//        }

//        System.out.println(intArray.get(0) + intArray.get(1));
//    ===================================================================
//
//  class App{
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        String userName = "";
//        String userSubject = "";
//        int sum = 0;
//        double subjectNum = 0;
//        try {
//            System.out.println("Your name: ");
//            userName = sc.next();
//            System.out.print("subject score math,English,science,society,Japanese (ex. 20,30,40,50,60)");
//
//            String[] eachSubject = userSubject.split(",");
//            for (int i = 0; i < eachSubject.length; i++) {
//                sum += Integer.parseInt(eachSubject[i]);
//            }
//            subjectNum = eachSubject.length;
//
//            System.out.println(userName);
//
//            System.out.println("subject total score: " + sum);
//            System.out.println("subject average: " + (sum / subjectNum));
//
//        } catch (NumberFormatException e) {
//            System.out.println("subject score should be number");
//        } catch(Exception e) {
//            System.out.println("Sorry, something is wrong");
//
//        }finally {
//            sc.close();
//        }
//    }
//}