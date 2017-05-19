package home_task_02_1;

import java.util.*;

public class MyCollection {

    ArrayList<Integer> list = new ArrayList<Integer>();

    public void ListSize(int size) {
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 100));

        }
    }

    public void AddElement(int value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + value);
        }
        list.add(value);
        System.out.println("Коллекция имеет вид:" + list);

    }

    public void DelIndex(int index) {
        int digit = list.remove(index);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) - digit);
        }
        System.out.println("Коллекция имеет вид:" + list);

    }

    public void DelElement(int element) {
        int i;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                list.remove(i);
            }
        }
        for (i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) - element);
        }
        System.out.println("Коллекция имеет вид:" + list);
    }


    public void SearchElement(int element) {
        int i;
        boolean count = false;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                System.out.println("Число" + " " + element + " является " + (i + 1) + "-м" + " в коллекции");
                count = true;
            }
        }
        if (count == false) {
            System.out.println("Число " + element + " не найдено");
        }
    }

    public void SearchIndex(int index) {
        for (int i = 0; i < list.size(); i++) {
            if (i == index) {
                System.out.println("Число по индексу:" + " " + index + " " + "равно" + " " + list.get(i));

            }
        }
    }

    public void MinValue() {
        int min = Collections.min(list);
        System.out.println("Минимальный элемент в коллекции равен:" + " " + min);
    }

    public void MaxValue() {
        int max = Collections.max(list);
        System.out.println("Максимадбний элемент в коллекции равен:" + " " + max);

    }

    public void Avg() {
        double result = 0;
        for (int i : list) {
            result += i;
        }
        System.out.printf("Среднеарифметическое значение коллекции:"+" "+"%.2f",result / list.size());
    }
}


