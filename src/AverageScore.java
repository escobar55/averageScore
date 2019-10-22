import java.util.Scanner;

public class AverageScore {
    public static void main(String [] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the 10 test scores: ");

        int test1 = key.nextInt();
        int test2 = key.nextInt();
        int test3 = key.nextInt();
        int test4 = key.nextInt();
        int test5 = key.nextInt();
        int test6 = key.nextInt();
        int test7 = key.nextInt();
        int test8 = key.nextInt();
        int test9 = key.nextInt();
        int test10 = key.nextInt();

        //compute the average
        int average = test1 + test2 + test3 + test4 + test5 + test6 + test7 + test8 + test9 + test10 / 10;

        //print the result to the console
        System.out.print("The average score is: " + average);
    }
}
