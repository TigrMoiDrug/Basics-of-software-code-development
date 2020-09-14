// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ЛИНЕЙНЫЕ ПРОГРАММЫ .
                    // Задача 5
public class Task05 {
    public static void main (String[] args){
        //Количество секунд
        double time_sec = 68794;
        // Количество секунд в одном часу
        double hour = 3600;
        //Количество секунд в минуте
        double minute = 60;

        //находим количество часов
        double hh = time_sec / hour;
        // для вывода и "округления" нужно поменять тип данных
        int x = (int) hh;
        //  -//-
        double mm =(time_sec-(x * hour))/minute;
        int y = (int) mm;
        //  -//-
        double ss =time_sec-(x * hour)-(y * minute);
        int z = (int) ss;
        //
        System.out.print("HH:"+x+"  MM:"+y+"  SS:"+z);
    }
}
