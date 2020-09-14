import java.util.Scanner;
// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// Циклы .
                    // Задача 2
public class Task13 {

    public static void main (String[] args){

        double h = 0.2; // Шаг
        double y , x; // переменные функции

        System.out.println("Введите точки А и В отрезка на котором будем вычислять значение функции.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение точки А : ");
        int a = sc.nextInt(); // ввод точки А через консоль
        System.out.println("Введите значение точки В : ");
        int b = sc.nextInt(); // ввод точки В через консоль

        // Ниже цикл с условием (больше и меньше двух)
        for ( x = a; x <= b; x += h ){
            if (x > 2){
                y = x;
                System.out.println(y);
            }
            else {
                y = -x;
                System.out.println(y);
            }
        }
    }
}
