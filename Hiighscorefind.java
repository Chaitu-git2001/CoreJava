import java.util.Scanner;
class Hiighscorefind{
public static void main(String []args){
System.out.print("Enter score for Test 1: ");
        int test1 = sc.nextInt();

        System.out.print("Enter score for Test 2: ");
        int test2 = sc.nextInt();

        if (test1 > test2) {
            System.out.println("Test 1 has higher score");
        } else if (test2 > test1) {
            System.out.println("Test 2 has higher score");
        } else {
            System.out.println("Both tests have equal score");
        }

        sc.close();


}}