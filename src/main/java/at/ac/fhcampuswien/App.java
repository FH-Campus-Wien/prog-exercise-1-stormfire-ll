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

        int sum = 0;
        char z1 = 'Z';
        int hex = 0xface;
        int octal = 012;
        long l1 = 80L;
        float f1 = 44e-1f;
        float f2 = 5.5f;
        double d1 = 8.88e1;
        double d1a = (int) d1;
        double d2 = 99.9f;
        double d2a = (int)d2;

        sum = sum + z1;
        sum += hex;
        sum += octal;
        sum += l1;
        sum += f1;
        sum += f2;
        sum += d1;
        sum += d1a;
        sum += d2;
        sum += d2a;

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
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
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

        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
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
        Scanner scanner = new Scanner(System.in);
        int revenue;

        System.out.print("Enter annual Revenue: ");
        revenue = scanner.nextInt();

        if (revenue < 0 | revenue >= 100000) {
            System.out.println("Invalid Revenue");
            System.out.println();
        } else if (0 <= revenue && revenue < 20000){
            System.out.println("Poor Sales Revenue");
            System.out.println();
        } else if (0 <= revenue && revenue <= 50000){
        System.out.println("Average Sales Revenue");
        System.out.println();
        } else if (0 <= revenue && revenue <= 80000){
            System.out.println("Good Sales Revenue");
            System.out.println();
        } else if (0 <= revenue && revenue <= 100000){
            System.out.println("Excellent Sales Revenue");
            System.out.println();
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        int commissionClass;

        System.out.print("Enter CommissionClass: ");
        commissionClass = scanner.nextInt();

        switch(commissionClass) {
            case 1:
                System.out.println("Your Commission Rate was set to  0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to  0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to  0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to  0.04");
                break;
            case 5:
                System.out.println("Your Commission Rate was set to  0.00");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Year: ");
        year = scanner.nextInt();

        if (year % 4 == 0){
            System.out.println("Leapyear");
        } else if (year % 100 == 0 && year % 400 != 0){
            System.out.println("Not a Leapyear");
        } else if (year % 400 == 0){
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Number: ");
        num = scanner.nextInt();

        int z1 = num % 10;
        int temp1 = num / 10;
        int z2 = temp1 % 10;
        int temp2 = temp1 % 10;

        System.out.println(z1 * 100 + z2 * 10 + temp2 * 1);
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