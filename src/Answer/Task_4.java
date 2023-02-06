package Answer;

public class Task_4 {
    public boolean task_4( int num){
        // Задача была выполнена за 20 минут
        //int num =57;
        int c;
        for (int i =2; i<num-1; i++){
            c = num % i;
            if (c ==0) return false;
        }
        return true;
    }
}
