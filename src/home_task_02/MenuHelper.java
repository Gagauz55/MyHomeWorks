package home_task_02;

import java.util.Arrays;
import java.util.Scanner;



public class MenuHelper {
    ArrayHolder holder = new ArrayHolder();
    Scanner sc = new Scanner(System.in);



    public void MenuArray() {
        System.out.println("     ==Меню работы с масивом==");
        System.out.println();

        System.out.print("Введите размерность массива:");

        int size = sc.nextInt();

        holder.Array(size);
        System.out.println();

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < holder.mas.length; i++) {

            System.out.print("Элемент №" + (i + 1) + ":");
            holder.mas[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Вы задали массив:" + " " + Arrays.toString(holder.mas));
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

        choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Введите число для поиска:");
                    int digit = sc.nextInt();
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







