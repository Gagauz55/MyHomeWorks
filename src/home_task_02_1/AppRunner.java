package home_task_02_1;

/**
 * Необходимо реализовать коллекцию целых чисел, которая позволяет выполнять операции:
 - добавления;
 - удаления;
 - поиска элемента по значению;
 - поиска элемента по индексу;
 - поиска максимального элемента;
 - поиска минимального элемента;
 - поиска среднего арифметического всех элементов;

 При этом:
 при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
 при удалении - уменьшают своё значение на удаляемый элемент

 Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.

 Результатом работы должен быть отдельный репозиторий github/bitbucket с README файлом,
 который описывает задание, сам класс и содержит инструкции по запуску приложения.
 Trunov Dmitry
 */
public class AppRunner {
    public static void main(String[] args) {
        MenuHelp start=new MenuHelp();
        start.MenuCollection();
        start.MenuChoice();

    }
}

