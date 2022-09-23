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
// Задание 2.1
        System.out.println("Задание 2.1");
        age = 16;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        else  {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно еще немного подожать.");
        }

        // Задание 2.2
        System.out.println("Задание 2.2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (age >= 24) {
            System.out.println("Человек ходит на работу");
        }

        // Задание 2.3
        System.out.println("Задание 2.3");
        capacity = 102;
        seatAmount = 60;
        standAmount= capacity - seatAmount;
        seatUsed = 60;
        standUsed = 42;

        if (seatUsed < seatAmount) {
            System.out.println("В вагоне осталось " + (seatAmount - seatUsed) + " сидячих мест");
        }

        else  {
            System.out.println("Сидячих мест нет!");
        }

        if (standUsed < standAmount) {
            System.out.println("В вагоне осталось " + (standAmount - standUsed) + " стоячих мест");
        }

        else  {
            System.out.println("Стоячих мест нет! ");
        }

        //Задание 3.1
        System.out.println("Задание 3.1");
        age = 19;
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        }

        else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        }

        else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        }

        else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }

        //Задание 3.2
        System.out.println("Задание 3.2");

        age = 15;
        if (age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }

        else if (age >= 5 && age < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        }

        else if (age >= 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        //Задание 3.3
        System.out.println("Задание 3.3");
        int one = 1;
        int two = 2;
        int free = 3;

        if (one >= two && one > free ) {
            System.out.println("Число " + one + " максимальное число");
            }
        else if (two > one && two >= free ) {
            System.out.println("Число " + two + " максимальное число");
        }

        else if (free >= one && free > two){
            System.out.println("Число " + free + " максимальное число");
        }

        else { System.out.println("Число " + one + " максимальное число");

        }



        }
}
