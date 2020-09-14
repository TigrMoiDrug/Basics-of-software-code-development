import java.util.Scanner;
// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ЛИНЕЙНЫЕ ПРОГРАММЫ .
                    // Задача 6
public class Task06 {

    public static void main (String[] args){
        // создаём переменную сканер
        Scanner sca = new Scanner(System.in);

        System.out.print("Введите значение координаты x : ");
        double x = sca.nextDouble();// вводим переменную х в консоль

        System.out.print("Введите значение координаты y : ");
        double y = sca.nextDouble();// вводим переменную у в консоль
        // условие для у
        boolean a = y < 4;
        boolean b = y > -3;
        //условие для х
        boolean c = x < 4;
        boolean d = x >-4;
        // общее условие для выделенной области ( печатает true если все условия равны true)
        c = a & b & c & d;

        System.out.print(c);
    }
}
