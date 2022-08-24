import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        Menu menuObj = new Menu();
        menuObj.displayMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice :");
        int choice = scanner.nextInt();

        if (choice > 0 && choice < 6) {
            switch (choice) {
                case 1: {
                    System.out.println("Add: " + obj.add());
                    break;
                }
                case 2: {
                    System.out.println("Sub: " + obj.sub());
                    break;
                }
                case 3: {
                    System.out.println("multiple " + obj.multiple());
                    break;
                }
                case 4: {
                    System.out.println("multiple " + obj.division());
                    break;
                }
                case 5: {
                    System.out.println("modulous " + obj.modulos());
                    break;
                }
            }
        } else {
            System.out.println("Error");
        }
    }

}
