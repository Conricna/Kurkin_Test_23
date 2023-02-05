package Answer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача была выполнена за 55 минут
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число для построения таблицы умножения: ");
        int num =  sc.nextInt();;
        int[][] mas = new int[num+1][num+1];

        for (int i = 1; i < mas.length; i++) {

            System.out.print("\n");
            for (int j = 1; j < mas[i].length; j++) {
                int b = j * i;
                mas[i][j]=b ;
                System.out.printf("%2d ", mas[i][j]);
            }

        }
    }
}
