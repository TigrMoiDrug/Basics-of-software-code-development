import java.util.Scanner;
// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ЦИКЛЫ.
                    // Задача 1
public class Task12 {

    public static void main (String[] args){
        // По условию пользователь вводит любое целое число,
        // а программа считает сумму всех чисел от 1 до введенного числа
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int answer = 0; // Просто ноль . Используется для вывода ответа
        // Цикл с условиями для суммирования
        for(int one = 1; one <= x; one ++){
            answer += one; // += прибавляет и присваивает значение переменной one переменной answer
        }
        System.out.print(answer);
    }
}
