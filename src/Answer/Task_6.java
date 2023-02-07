package Answer;

public class Task_6 {
    // Задача была выполнена за 50 минут
    public int[][] task_6(int num) {
        // Тут был вариант с водом через консоль решил не удалять его

       // Scanner sc = new Scanner(System.in);

        //System.out.print("Введите число для построения таблицы умножения: ");
        //int num = sc.nextInt();
        //int num = 5;

        int[][] mas = new int[num + 1][num + 1];
        // в двойном цикле перемножаем элемент строки на столбец
        for (int i = 1; i < mas.length; i++) {
            for (int j = 1; j < mas[i].length; j++) {
                int b = j * i;
                mas[i][j] = b;
                System.out.printf("%2d ", mas[i][j]);
            }
            System.out.print("\n");
        }
        return mas;
    }
}
