package home_task_02;

import java.util.Arrays;
import java.util.Scanner;


public class MenuHelper {
    ArrayHolder holder = new ArrayHolder();
    Scanner sc = new Scanner(System.in);
    int size, check;

    public int intFromScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.err.println("Пожалуйста, введите целое число!");
            sc.next();
        }
        return check = sc.nextInt();
    }


    public void MenuArray() {
        System.out.println("     ==Меню работы с масивом==");
        System.out.println();

        System.out.print("Введите размерность массива:");


        intFromScanner(sc);
        size = check;
        if (size < 1) {
            System.out.println();
            System.out.println("Размер массива должен быть больше нуля!");
            System.out.println();

            MenuArray();
        } else {
            holder.Array(size);
            System.out.println();


            System.out.println("Введите элементы массива:");
            for (int i = 0; i < holder.mas.length; i++) {

                System.out.print("Элемент №" + (i + 1) + ":");
                intFromScanner(sc);
                holder.mas[i] = check;
            }
            System.out.println();
            System.out.println("Вы задали массив:" + " " + Arrays.toString(holder.mas));
        }
    }

    public void MenuChoice() {
        int choice;
        do {
            System.out.println();
            System.out.println("     ==Меню работы с элементами==");
            System.out.println();
            System.out.println(" - Для поиска числа по значению, нажмите - 1;");
            System.out.println(" - Сортировка элементов массива по возрастанию, нажмите - 2;");
            System.out.println(" - Сортировка элементов массива по убыванию, нажмите - 3;");
            System.out.println(" - Для выхода из программы нажмите - 4");
            intFromScanner(sc);
            choice = check;
            switch (choice) {
                case 1: {
                    System.out.print("Введите число для поиска:");
                    intFromScanner(sc);
                    int digit = check;
                    holder.Search(digit);
                    break;
                }

                case 2: {
                    holder.sortArrayAscending();
                    System.out.println("Массив по возрастанию:" + Arrays.toString(holder.mas));
                    break;
                }

                case 3: {
                    holder.sortArrayDescending();
                    System.out.println("Массив по убыванию:" + Arrays.toString(holder.mas));
                    break;
                }

                case 4: {
                    System.out.println("Спасибо что восползовались нашим приложением.");
                    break;
                }

                default: {
                    System.out.println("Пожалуйста сделайте Ваш выбор!");
                }
                MenuChoice();


            }


        } while (choice != 4);
    }
}







