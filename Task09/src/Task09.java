import java.util.Scanner;
// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ВЕТВЛЕНИЯ .
                    // Задача 3
public class Task09 {

    public static void main (String[] args){

        Scanner scnr = new Scanner(System.in); // значения точек пробую вводить через консоль
        System.out.println("Определим лежат ли точки на одной прямой по их координатам");
        // ВВодим координаты через консоль
        System.out.print("Введите координату по оси x точки А: ");
        int x1 = scnr.nextInt();
        System.out.print("Введите координату по оси y точки A: ");
        int y1 = scnr.nextInt();
        System.out.print("Введите координату по оси x точки B: ");
        int x2 = scnr.nextInt();
        System.out.print("Введите координату по оси y точки B: ");
        int y2 = scnr.nextInt();
        System.out.print("Введите координату по оси x точки C: ");
        int x3 = scnr.nextInt();
        System.out.print("Введите координату по оси y точки C: ");
        int y3 = scnr.nextInt();
        // Формула из геометрии по которой можно определить находятся ли точки на одной прямой.
        if( (x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)!=0){  // условие при котором точки не лежат на одной прямой
            System.out.print("Точки не лежат на одной прямой");
        }
        else {
            System.out.print("Точки лежат на одной прямой");
        }
    }
}
