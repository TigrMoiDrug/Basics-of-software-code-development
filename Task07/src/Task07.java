import java.util.Scanner;
// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ВЕТВЛЕНИЯ .
                    // Задача 1
public class Task07 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Задаём ДВА угла через консоль
        System.out.println("Есть треуголник. Введите значения двух углов , чтобы узнать прямоугольный ли он.");
        System.out.println("Первый : ");
        int a = sc.nextInt() ;
        System.out.println("Второй : ");
        int b = sc.nextInt() ;
        //Находим сумму двух углов
        int sum = a + b;
        //Условная конструкция
        if (sum<180){
            //Решил ещё одну конструкцию с if поместить внутри перьвой
            if (180 - sum ==90){
                System.out.print("Такой треугольник ЯВЛЯЕТСЯ прямоугольным");
            }
            else {
                System.out.print("Такой треугольник НЕ ЯВЛЯЕТСЯ прямоугольным");
            }
        }
        else {
            System.out.print("Такого треугольника не существует");
        }
    }
}
