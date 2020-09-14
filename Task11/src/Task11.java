import java.util.Scanner;
// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ВЕТВЛЕНИЯ.
                    // Задача 5
public class Task11 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        // ВВод переменной через консоль
        System.out.print("Напишите чему будет равен X: ");
        int x = sc.nextInt();

        System.out.print("Значение функции при X равном "+x+" : ");// Чтобы пользователь мог видеть,
                                                                   // что ввёл.
        // Условие для икса
        if (x<=3){
            System.out.print(Math.pow(x,2)-3*x+9);

        }
        else {
            System.out.print(1/(Math.pow(x,3)+6));
        }
    }
}
