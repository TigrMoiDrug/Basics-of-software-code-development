// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// Циклы .
                    // Задача 8

import java.util.Scanner;

public class Task19 {
    public static void main ( String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Найдём общие цифры во введённых через консоль числах.");

        System.out.print("Введи первое число: ");// Введем числа через консоль
        int a = sc.nextInt();                    // первое
        System.out.print("Введи второе число: ");
        int b = sc.nextInt();                    // второе

        String c = String.valueOf(a);            // конвертируем в строку , хотя я видел ,когда просто сразу через сканнер вводят
        String d = String.valueOf(b);            // в формате строки , но мне показалось, что так универсальнее)

        int length_c = c.length();                // переменные длины  строки нужны , чтобы остановить цикл
        int length_d = d.length();

        System.out.print("Общие цифры чисел "+c+" и "+d+" : ");

        for ( int i = 0 ; i < length_c ; i ++){  // поместил цикл внутрь цикла , (получилось случайно )
                                                 // так как не имеет смысла считать больше совпадений ,чем
                                                 // цивр в одном из чисел (у нас это первое)
            for (int y = 0 ; y < length_d ; y ++){

                if (c.charAt(i) == d.charAt(y)){ // это основное услове ( совпадение цифр)
                    System.out.print(d.charAt(y) + ", ");
                }
            }
        }
    }
}
