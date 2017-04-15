package home_task_01;

/**
 * Trunov Dmitry
 * Создать консольное приложение, которое запрашивает имя пользователя. После ввода имени выводит строку: Hello, <введённое имя>
 */

import java.util.Scanner;
public class task_01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             System.out.println("Enter Your name:");

        String name = (String) sc.nextLine();
             System.out.println("Hello,"+" "+name);

    }
}
