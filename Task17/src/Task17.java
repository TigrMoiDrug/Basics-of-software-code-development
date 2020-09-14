// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// Циклы .
                    // Задача 6

public class Task17 {

    public static void main (String[] args){
        // Не совсем понял из залания ,что  нужно делать. Нашёл информацию про юникод в джава и
        // в столбик перечислил его.
        char sign  = '\u0000'; // первый (нулевой) символ юникода
        int num = 0; // для нумерации
        // цикл как в прошлых заданиях
        for (int i = 0; i<= 10000; i++){
            sign++;
            num++;
            System.out.println("Символ: " + sign + " ( " + num + " ) ");
        }
    }
}

