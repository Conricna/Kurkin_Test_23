package Answer;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Task_1 t1 = new Task_1();
        // Есть некий массив который преобразуется в строку
        //System.out.println( "Выходная строка:\n " + (t1.task_1() + "."));

        Task_2 t2 = new Task_2();
        // Введите число, а оно округлится с точностью до 5
        //System.out.println( "Ваше число " + (t2.task_2(11.7F)));

        Task_4 t4 = new Task_4();
        // Проверка является ли введённое число простым
        //System.out.println( "Является ли ваше число простым? " + (t4.task_4(11)));

        Task_5 t5 = new Task_5();
        // Ищет одинаковые элементы в разных массивах
        //System.out.print( (Arrays.toString(t5.task_5())));

        Task_6 t6 = new Task_6();
        // Строит таблицу умножения
        //System.out.print( Arrays.deepToString(t6.task_6(5))); //ввести число до которого хотите построить таблицу умножения
        // Не сообразил как правильно реализовать вывод в виде матрицы из другого класса  Task_6
    }
}
