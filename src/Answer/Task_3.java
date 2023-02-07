package Answer;

public class Task_3 {

    public String task_3(int item) {
        // Задача была выполнена за 10 минут
        String answer = null;

        int nitem =item; // начальное количество
        item =item %10;
        if (nitem>=11 && nitem<=14)// обработка так как только с 11 по 14 оканчивается на ов

            answer = (nitem + " компьютеров");

        else
        switch (item) {
            case 1 -> answer = (nitem + " компьютер");  // если оканчивается 1, присваивается окончание и количество
            case 2, 3, 4 -> answer = (nitem + " компьютера");  // если оканчивается 2 3 4
            case 0, 5, 6, 7, 8, 9 -> answer = (nitem + " компьютеров");  // если оканчивается 0 5 6 7 8 9
        }
// Изначально думал реализовать через if, а не кейсы

//        if (item ==0) System.out.println(nitem + " компьютеров");
//        if (item ==1) System.out.println(nitem + " компьютер");
//        if (item>=2 && item<=4) System.out.println(nitem + " компьютерa");
//        if (item>=5 && item<=10) System.out.println(nitem + " компьютеров");

        //System.out.println(item + " компьютерa");
    return answer;
    }
}
