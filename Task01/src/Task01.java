import java.util.Scanner;
// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ЛИНЕЙНЫЕ ПРОГРАММЫ .
                    // Задача 1
public class Task01 {

    public static void main (String [] args){
        // Создаётся новый сканнер
        Scanner sc = new Scanner(System.in);
        //Определяем переменные как инпут и последовательно записываем их через консоль
        //Первая переменная а
        System.out.print("Enter a:");
        int a = sc.nextInt();
        //Вторая переменная b
        System.out.print("Enter b:");
        int b = sc.nextInt();
        //Третья переменная c
        System.out.print("Enter c:");
        int c = sc.nextInt();
        // И само выражение
        int z = ((a - 3)*b/2)+c;

        System.out.print("Z equals:"+z);






    }
}
