package home_task_02_1;

import java.util.*;

public class MenuHelp {


    MyCollection collection = new MyCollection();
    Scanner sc = new Scanner(System.in);
    int size, check;

    public int intFromScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.err.println("Пожалуйста, введите целое число!");
            sc.next();
        }
        return check = sc.nextInt();
    }


    public void MenuCollection() {
        System.out.println("     \n=======Меню работы с коллекцией======\n");
        System.out.println("Введите количество элементов в коллекции:");
        intFromScanner(sc);
        this.size = check;
        if (size <= 1) {
            System.out.println("\nВведите корректный размер коллекции!\n");

            MenuCollection();
        } else {
            collection.ListSize(size);
            System.out.println("\n Вы задали коллекцию:\n" + collection.list);
        }
    }


    public void MenuChoice() {
        int choice;
        do {
            System.out.println("     \n==Меню работы с элементами коллеции==\n");
            System.out.println(" - Для добавления элемента, нажмите - 1;");
            System.out.println(" - Для удаления элемента по индексу, нажмите - 2;");
            System.out.println(" - Для удаления элемента по значению, нажмите - 3;");
            System.out.println(" - Для поиска элемента по значению, нажмите - 4;");
            System.out.println(" - Для поиска элемента по индексу, нажмите - 5;");
            System.out.println(" - Для поиска минимального элемента, нажмите  - 6;");
            System.out.println(" - Для поиска максимального элемента, нажмите  - 7;");
            System.out.println(" - Для поиска среднеарифметического значения всех элементов, нажмите  - 8;");
            System.out.println(" - Для завершения работы программы, нажмите  - 9;");

            intFromScanner(sc);
            choice = check;
            switch (choice) {
                case 1: {
                    System.out.print("Введите число для добавления в коллекцию:");
                    intFromScanner(sc);
                    int digit = check;
                    collection.AddElement(digit);
                    break;
                }

                case 2: {
                    System.out.println("Введите индекс элемента для удаления:");
                    intFromScanner(sc);
                    int digit = check;
                    if (digit > size) {
                        System.err.println("Индекс выходит за размеры коллеции");
                        MenuChoice();
                    } else {
                        collection.DelIndex(digit);
                        break;
                    }
                }


                case 3: {
                    System.out.print("Введите значение для удаления:");
                    intFromScanner(sc);
                    int element = check;
                    collection.DelElement(element);
                    break;
                }

                case 4: {
                    System.out.print("Введите число для поиска:");
                    intFromScanner(sc);
                    int element = check;
                    collection.SearchElement(element);
                    MenuChoice();
                    break;
                }
                case 5: {
                    System.out.println("Введите индекс для поиска:");
                    intFromScanner(sc);
                    int index = check;
                    if (index > size) {
                        System.err.println("Индекс выходит за размеры коллеции");
                        MenuChoice();
                    } else {

                        collection.SearchIndex(index);
                        break;
                    }
                }

                case 6: {
                    collection.MinValue();
                    break;
                }

                case 7: {
                    collection.MaxValue();
                    break;
                }

                case 8: {
                    collection.Avg();

                    break;
                }

                case 9: {

                    System.out.println("Спасибо что восползовались нашим приложением.");
                    break;
                }
                default: {
                    System.out.println("Пожалуйста сделайте Ваш выбор!");
                }
                MenuChoice();

            }

        }
        while (choice != 9);
    }
}




