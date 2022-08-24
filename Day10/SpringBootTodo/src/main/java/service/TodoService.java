package service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class TodoService {
    public void printMenu() {
        System.out.println("---------------");
        System.out.println("1.Add");
        System.out.println("2.View");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5. Exit");
        System.out.println("---------------");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:{

            }
            case 2:{

            }
            case 3:{

            }
            case 4:{

            }
            case 5:{

            }
            default:{
                System.out.println("Invalid input");
            }
        }

    }
}
