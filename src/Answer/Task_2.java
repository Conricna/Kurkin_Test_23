package Answer;

public class Task_2 {

    public int task_2(float num){
        // Задача была выполнена за 5 минут
       // float num =41.7F;

        int res = Math.round(num);
        int round = res %5;
        if (round ==1) res -= 1;
        if (round ==2) res -= 2;
        if (round ==3) res += 2;
        if (round ==4) res += 1;
        return res;
    }
}
