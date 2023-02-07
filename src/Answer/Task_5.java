package Answer;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_5 {
    //  Задача была выполнена за 20 минут и +- час я пытался довести до ума своими силами, но чутка не получилось
    private static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public int[] task_5() {
        int[] arrnum1 = new int[]{7, 17, 1, 9, 1, 7, 56, 56, 23};
        int[] arrnum2 = new int[]{56, 17, 17, 1, 23, 34, 23, 1, 8, 1, 7};
        int[] arrnum3 = new int[arrnum1.length];

// сравниваем значение первого массива со вторым, если да то записываем в третий массив
        for (int i = 0; i < arrnum1.length; i++) {
            for (int j = 0; j < arrnum2.length; j++) {
                if (arrnum1[i] == arrnum2[j]) {
                    arrnum3[i] = arrnum1[i];
                }
            }
        }

        Arrays.sort(arrnum3);  // сортировка массива

        int[] distinct = removeDuplicates(arrnum3);  // Оставляем только уникальные значения


/////////////////////////////

        //Я что-то не так реализовал и когда в массивах отсутствуют одинаковые элементы на их месте остаётся 0,
        // так же думаю ошибка заключается в неправильном объявлении 3-его массива
        // Ниже не мой код, нашёл его как вариант решения.
        // Понимаю что тестируются мои знания, а не то как я могу искать готовое решение)))  Поэтому мой код сверху)

        int[] arr1 = {7, 17, 1, 9, 1, 7, 56, 56, 23};
        int[] arr2 = {56, 17, 17, 1, 23, 34, 23, 1, 8, 1, 7};

        int[] arr3 = Stream.of(arr1, arr2)
                // выкидываем из каждого массива поворяющиеся
                // элементы и объединяем в один Stream<Integer>
                .flatMap(arr -> Arrays.stream(arr).distinct().boxed())
                // группируем в карту по количеству вхождений
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                // обходим карту
                .entrySet().stream()
                // количество больше одного
                .filter(e -> e.getValue() > 1)
                // получаем сами элементы
                .map(e -> e.getKey())
                // получаем 'int' значения элементов
                .mapToInt(Integer::intValue)
                // собираем в массив
                .toArray();

// выводим массив повторяющихся элементов
        //System.out.println( Arrays.toString(arr3)); // [1, 2, 3, 5, 8]

        return distinct;
    }
}
