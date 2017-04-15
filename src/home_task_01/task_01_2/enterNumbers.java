package home_task_01.task_01_2;
import  java.util.Scanner;
import java.util.Arrays;
/**
 * Trunov Dmitry
 * Создать консольное приложение, которое просит пользователя ввести из консоли 5 чисел
 Все числа должны быть записаны в массив целых чисел.

 После этого, массив должен быть отсортирован по возрастанию и выведен консоль.
 Сначала начальная версия, далее - отсортированная.

 */
public class enterNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mas= new int[5];
        for (int i =0; i<mas.length; i++) {

               System.out.println("Enter number" + " " + (i+1) + ":");
                mas[i] = sc.nextInt();
        }
        System.out.println("Initial array:" + Arrays.toString(mas));

        client sort =new client();
        client.arraySort(mas);


    }
}
