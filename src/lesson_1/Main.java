package lesson_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(task1(3, 5, 5, 2));
        System.out.println(task2(5, 10 ));
        System.out.println(task2(1, 3));
        System.out.println(task3(12));
        System.out.println(task3(-10));
        System.out.println(task4("Человек"));
        System.out.println(task5(2400));
    }
    public static float task1 (int a, int b, int c, int d) {
        return a * (b + (float)c / d);
    }
    public static boolean task2 (int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }
    public static String task3 (int a){
        return (a>=0) ? "Положительное" : "Отрицательное";
    }
    public static String task4 (String name) {
        return "Привет," + name + "!";
    }
    public static String task5 (int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0){
                    return "Високосный";
                } else {
                    return "Не високосный";
                }
            } else {
                return "Високосный";
            }
        } else {
            return "Не високосный";
        }
    }
}
