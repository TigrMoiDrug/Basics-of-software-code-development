// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ЛИНЕЙНЫЕ ПРОГРАММЫ .
                    // Задача 3
public class Task03 {

    public static void main (String[] args){
        //Переменные
        double y = 25;
        double x = 45.5;
        //В классе математика в джава используются радианы
        // Переводим градусы в разианы
        double y_rad = Math.toRadians(y);
        double x_rad = Math.toRadians(x);
        // Используем класс Math для тригонометрии
        double sinus_x =Math.sin(x_rad);
        double sinus_y =Math.sin(y_rad);
        double cosinus_x =Math.cos(x_rad);
        double cosinus_y =Math.cos(y_rad);
        double tang_xy =Math.tan(x_rad*y_rad);
        //Нахождение значения выражения
        double answer = (sinus_x + cosinus_y)/(cosinus_x - sinus_y) * tang_xy;

        System.out.print(answer);
    }
}
