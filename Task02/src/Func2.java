// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ЛИНЕЙНЫЕ ПРОГРАММЫ .
                    // Задача 2
public class Func2 {

    public static void main (String[] args){
        //Задаём переменные
        double a = 3;
        double b = 5;
        double c = 10;
        float degree = 2;
        //Решрил отдельно найти подкоренное выражение
        float root = (float) Math.sqrt(Math.pow(b,degree)+4*a*c);
        // Ну и решение
        float answer = (float) ((b + root)/ 2*a -Math.pow(a,a)*c + 1/Math.pow(b,degree));

        System.out.print(answer);
    }
}
