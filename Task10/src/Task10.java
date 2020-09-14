import java.util.Scanner;
// 1. BASICS OF SOFTWARE CODE DEVELOPMENT
// ВЕТВЛЕНИЯ.
                    // Задача 4
public class Task10 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Есть прямоугольное отверстие со сторонами А и В и " +
                "кирпич с гранями X ,Y ,Z. Определим пройдет ли кирпич через " +
                "отверстие");
        System.out.print("Укажите длину отвертия : ");
        int a = sc.nextInt();
        System.out.print("Укажите ширину отвертия : ");
        int b = sc.nextInt();
        System.out.println("Класс! Отверстие готово . Теперь кирпич.");
        System.out.print("Укажите длину кирпича : ");
        int x = sc.nextInt();
        System.out.print("Укажите ширину кирпича : ");
        int y = sc.nextInt();
        System.out.print("Укажите высоту кирпича : ");
        int z = sc.nextInt();

        // Ниже пытаюсь перечислить варианты для прохода через отверстие.
        // Логично , что две грани кирпича долны совпасть или быть меньше
        // ширины и длинны отверстия. Надеюсь все перечислил.

        if ((x<=a&y<=b)|(x<=b&y<=a)|(x<=a&z<=b)|(z<=a&x<=b)|(y<=a&z<=b)|(z<=a&y<=b)){
            System.out.print("Такой кирпич пройдёт через отверстие");
        }
        else {
            System.out.print("Такой кирпич не пройдет через отверстие");
        }
    }
}
