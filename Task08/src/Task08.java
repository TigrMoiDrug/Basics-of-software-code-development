// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ВЕТВЛЕНИЯ .
                    // Задача 2
public class Task08 {

    public static void main (String[] args){
        // Переменные
        int a = 8;
        int b = 7;
        int c = 6;
        int d = 10;

        int min_a_b =Math.min(a,b); // минимум из первой пары
        int min_c_d =Math.min(c,d); // минимум из второй пары

        int max = Math.max(min_a_b, min_c_d); // максимум из двух верхних значений

        System.out.print(max);
    }
}
