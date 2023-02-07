package Answer;

public class Task_4 {
    public boolean task_4( int num){
        // Задача была выполнена за 20 минут
        //int num =57;

        int chek;
        // проверка, если число где-то поделится без остатка, то оно не простое
        for (int i =2; i<num-1; i++){
            chek = num % i;
            if (chek ==0) return false;
        }
        return true;
    }
}
