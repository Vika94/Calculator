import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.print("Введите 1-е число: ");
            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
            System.out.print("Введите 2-е число: ");
            Scanner scan1 = new Scanner(System.in);
            int num2 = scan1.nextInt();
            System.out.print("Введите знак: ");
            Scanner scan2 = new Scanner(System.in);
            String a = scan2.nextLine();
            if (a.equals("-"))
                System.out.println("Ровно" + " " + (num1 - num2));
            else if (a.equals("+"))
                System.out.println("Ровно" + " " + (num1 + num2));
            else if (a.equals("*"))
                System.out.println("Ровно" + " " + (num1 * num2));
            else if (a.equals("/"))
                System.out.println("Ровно" + " " + (num1 / num2));
            if(a.equals("0")) break;
        }
    }
}

