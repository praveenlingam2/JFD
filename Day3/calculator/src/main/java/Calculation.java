import java.util.Scanner;

public class Calculation {

    public int add() {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the value of a & b");
        int a = obj1.nextInt();
        int b = obj1.nextInt();

        return a + b;
    }

    public int sub() {
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter the value of a & b");
        int a = obj2.nextInt();
        int b = obj2.nextInt();

        return a - b;
    }

    public int multiple() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Enter the value of a & b");
        int a = obj3.nextInt();
        int b = obj3.nextInt();

        return a * b;
    }

    public int division() {
        Scanner obj4 = new Scanner(System.in);
        System.out.println("Enter the value of a & b");
        int a = obj4.nextInt();
        int b = obj4.nextInt();

        return a / b;
    }

    public int modulos() {
        Scanner obj5 = new Scanner(System.in);
        System.out.println("Enter the value of a & b");
        int a = obj5.nextInt();
        int b = obj5.nextInt();

        return a % b;
    }

}
