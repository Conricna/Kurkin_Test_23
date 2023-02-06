package Answer;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Task_4 t4 = new Task_4();
        System.out.println( "Является ли ваше число простым? " + (t4.task_4(11)));

        Task_5 t5 = new Task_5();
        //System.out.print( (Arrays.toString(t5.task_5())));

        Task_6 t6 = new Task_6();
        //System.out.print( Arrays.deepToString(t6.task_6(5))); //ввести число до которого хотите построить таблицу умножения
        // Не сообразил как правильно реализовать вывод в виде матрицы из другого класса  Task_6
    }
}
