// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// Циклы .
                    // Задача 3
public class Task14 {

    public  static void main (String[] args){

        int func = 0;
        int a;
        //Цикл для получения ста чисел
        for (int x = 1; x <= 100; x++){
             a = (int)Math.pow(x,2); // Возведение в квадрат
             func += a; // нужно найти сумму квадратов чисел, поэтому применил " += "
        }
        System.out.print(func);
    }
}
