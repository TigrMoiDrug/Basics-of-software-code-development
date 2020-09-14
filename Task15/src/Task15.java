// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// Циклы .
                    // Задача 4
public class Task15 {

    public static void main (String[] args){

        int func = 0;
        int a;
        // Требовалось найти произведение первых 200 чисел, что похоже на
        // предыдущее задание, поэтому цикл практически такой же
        for (int x = 1; x <= 200; x++){
            a = (int)Math.pow(x,2);
            func = a * a; // нахождение произведения чисел
        }
        System.out.println(func);
    }
}
