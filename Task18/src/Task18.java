// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// Циклы .
                    // Задача 7

import java.util.Scanner;

public class Task18 {
    public  static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Вводим числа M и N с клавиатуры
        System.out.println("Найдём делители всех чисел ряда , кроме единицы и самих себя! Если получится))");
        System.out.print("Введите первое число ряда: ");
        int m = sc.nextInt();
        System.out.print("Введите последнее число ряда: ");
        int n = sc.nextInt();

        int i;

        System.out.print("Вот эти делители: ");// Эту строку выводим до цикла

        while ( m <= n){

            for (i = 2 ; i < m; i++ ){ // начальное условие для i = 2 такое , так как нам нужно исключить единицу
                if (m % i == 0){

                    System.out.print(i+ ", ");
                }
            }
            m += 1; // так как число натуральное то увеличиваем на 1
        }
    }
}
