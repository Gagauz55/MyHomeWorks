package home_task_02;

/**
 Trunov Dmitry

 Консольное приложение:
 - ввод размера массива int
 - ввод элементов массива
 - меню с возможными операциями над ним:
 - поиск чила по значению
 - сортировка
  */

public class AppRun {
    public static void main(String[] args) {

        MenuHelper runner= new MenuHelper();

        runner.MenuArray();
        runner.MenuChoise();


    }

}
