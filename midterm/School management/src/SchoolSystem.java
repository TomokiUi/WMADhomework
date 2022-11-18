////import java.util.Scanner;
//import java.util.*;
//
//class SchoolSystem {
//
//     String studentName;
//     String gap;
//     int mathScore;
//     int englishScore;
//     int scienceScore;
//     int societyScore;
//     int japaneseScore;
//
//     int sum1;
//     int sum2;
//     int sum3;
//     int sum4;
//     int sum5;
//     int sum6;
//
//    int rank;
//
//     double average;
//
////     public  SchoolSystem() {
////
////     }
//
//     public  SchoolSystem(String n, int m, int e, int s1, int s2, int j) {
//         this.studentName = n;
//         this.mathScore = m;
//         this.englishScore = e;
//         this.scienceScore = s1;
//         this.societyScore = s2;
//         this.japaneseScore = j;
//     }
//
//
////     public SchoolSystem() {
////         this.studentName = studentName;
////     }
//
//
//
//
//     public String getStudentName() {
//         return this.studentName;
//     }
//
//     public double getAverage() {
//         this.average = (mathScore + englishScore + scienceScore + societyScore + japaneseScore) / 5;
//         return this.average;
//     }
//
//
//
////         public static int[] rank() {
////             int[] rank = new int[] {sum1,sum2,sum3,sum4,sum5,sum6};
////             Arrays.sort(rank);
////             for(int i = 0; i < rank.length; i++)
////                 return rank;
////         }
//
////     public void showMenu() {
////         Scanner sc = new Scanner(System.in);
////         char option;
////         System.out.println("===========WELCOME TO WMAD SCHOOL==========")
////         ;
////
////         System.out.println("enter your name and your scores(math, English, science, society, Japanese)");
////         String studentName = sc.next();
////
////         System.out.println();
////
////
////         do {
////             System.out.println("=======================================");
////             System.out.println("1. Check your rank in the class");
////             System.out.println("2. Check the class average");
////             System.out.println("3. Exit");
////
////             System.out.println("Please enter a choice : ");
////             option = sc.next().charAt(0);
////             System.out.println();
////
////             switch (option) {
////                 case '1' :
////                     System.out.println("=================================");
////
////                     System.out.println("Your rank is " + rank );
////                     System.out.println("The gap between your scores and class average " + gap );
////                     System.out.println("=================================");
////                     System.out.println();
////                     break;
////
////                 case '2' :
////                     System.out.println("=================================");
////                     System.out.println("The class average is : "+ average);
////                     System.out.println("The gap between your scores and class average " + gap );
////                     System.out.println("=================================");
////                     System.out.println();
////                     averageScore();
////                     break;
////
////                 case '3':
////                     System.out.println("=================================");
////                     sc.close();
////
////                     break;
////
////                 default:
////                     System.out.println("Invaild Option, Please enter a vaild input");
////         }
////         } while(option != '3');
////         System.out.println();
////         System.out.println("Good luck!");
////
////     }
//
//     public void averageScore() {
//        sum1 = (englishScore + mathScore + societyScore + scienceScore + japaneseScore) / 5;
//        sum2 = (englishScore + mathScore + societyScore + scienceScore + japaneseScore) / 5;
//        sum3 = (englishScore + mathScore + societyScore + scienceScore + japaneseScore) / 5;
//        sum4 = (englishScore + mathScore + societyScore + scienceScore + japaneseScore) / 5;
//        sum5 = (englishScore + mathScore + societyScore + scienceScore + japaneseScore) / 5;
//        System.out.println(sum1);
//        System.out.println(sum2);
//        System.out.println(sum3);
//        System.out.println(sum4);
//        System.out.println(sum5);
//    }
//
////            System.out.println("Do you want to see your ranking?");
////
////
////            System.out.print("Your name?");
////            String sc = new Scanner(System.in).next();
////
////            String studentName = sc.next;
////
////            System.out.println("hello " + studentName);
////
////            System.out.print("Your score");
////            Integer score = new Scanner(System.in).nextInt();
////
////            System.out.println("math" + score);
//        }
