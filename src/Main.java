public class Main {
    public static void main(String[] args) {

        // Задание 1.1
        System.out.println("Задание 1.1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно еще немного подожать.");
        }

        // Задание 1.2
        System.out.println("Задание 1.2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек учится в университете");
        }
        if (age >= 24) {
            System.out.println("Человек ходит на работу");
        }

        // Задание 1.3
        System.out.println("Задание 1.3");
        int capacity = 102;
        int seatAmount = 60;
        int standAmount= capacity - seatAmount;
        int seatUsed = 60;
        int standUsed = 42;

        if (seatUsed < seatAmount) {
            System.out.println("В вагоне осталось " + (seatAmount - seatUsed) + " сидячих мест");
        }

        if (standUsed < standAmount) {
            System.out.println("В вагоне осталось " + (standAmount - standUsed) + " стоячих мест");
        }
        if (seatUsed == seatAmount) {
            System.out.println("Сидячих мест нет!");
        }
        if (standUsed == standAmount) {
            System.out.println("Стоячих мест нет!");
        }

    }
}
