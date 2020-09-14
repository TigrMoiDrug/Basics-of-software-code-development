public class Task04 {
    public static void main (String[] args){
        //Число , которое нужно изменить
        double num = 456.123;
        // Выделение целой и дробной части
        double left = (int)num; //целая часть
        double right = num - left; //дробная часть
        // Тут дробную часть просто домножаем на 1000 , целую наоборот делим
        double right_turned = right * 1000;
        double left_turned = left/1000;
        //Суммируе
        double answer =  right_turned + left_turned;// тут возникла проблема -
        //в дробной части имененного числа появилось бесконечное множество цифр после запятой,
        // нашел такой вариант решенияю
        String rslt = String.format("%.3f",answer);
        System.out.print(rslt);
    }
}
