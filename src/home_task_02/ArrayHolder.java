package home_task_02;

public class ArrayHolder {
    int[] mas;

    public void Array(int arraySize) {
        mas = new int[arraySize];
    }

    public void sortArrayAscending() {

        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }

    public void sortArrayDescending() {

        for (int i = 1; i < mas.length; i++) {
            for (int j = 1; j < mas.length; j++) {
                if (mas[j] > mas[j - 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = tmp;
                }
            }
        }
    }

    public void Search(int element) {
        int i;
        for (i = 0; i < mas.length; i++) {
            if (mas[i] == element) {
                System.out.println("Число" + " " + element + " является " + (i + 1) + "-м" + " по счету в массиве");
                break;
            }
        }
        if (i == mas.length) {
            System.out.println("Число " + element + " не найдено в массиве");


        }
    }
}




