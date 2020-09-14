// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// Циклы .
                    // Задача 5
public class Task16 {

    public static void main (String[] args){

        double e = 0.02; // число Е из задания
        double answer = 0; // переменная для выражения
        int n = 0 ; // переменная для степени

        for (int i = 1; i <=100; i++){

            ++n;// степень будет увеличиваться
            double numbers = (1/Math.pow(2,n))+(1/Math.pow(3,n)); // не совсем понял условие, получилось так

            if ( Math.abs(numbers) >= e){ // тут метод для нахождения модуля " Math.abs"
                answer = answer + numbers;
            }
        }
        System.out.print(answer);
    }
}
