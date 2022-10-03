package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
                System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){

        char z = 'Z';
        String oxface = "0xface";
        int octal = 012;
        String volume = "80L";
        float height = 44e-1f; //?
        float outcome = 5.5f;
        double length = 8.88e1;
        float num = 99.9f;

        int sum;
        int x = 1;
        int y = 2;
        int a = 3;
        int c = 4;
        int d = 5;
        sum = x + y + a + c + d;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Before Swap:");
        x = scanner.nextInt();
        System.out.println("x: " + x);
        y = scanner.nextInt();
        System.out.println("y: " + y);
        System.out.println("After Swap:");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;

        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if (n1 != n2) {
            if (n1 < n2) {
                System.out.println("n1 < n2");
            } else {
                System.out.println("n1 > n2");
            }
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        int year;

        year = scanner.nextInt();
        System.out.println("Year: " + year);

        if (year % 4 != 0)
    }

    //todo Task 10
    public void transposedNumbers(){

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}