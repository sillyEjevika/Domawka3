public class Main {
    public static void main(String[] args) {
        //Задача 6
        System.out.println("Задача 6");
       var firstBoxerWeight = 78.2;
       var secondBoxerWeight = 82.7;
       var bothBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Вес двух боксеров "+ bothBoxersWeight + "кг");
        var differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница веса двух боксеров "+ differenceBoxersWeight + "кг");
        //Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница веса двух боксеров (1 способ) "+ differenceBoxersWeight + "кг");
        System.out.println("Разница веса двух боксеров (2 способ) "+ secondBoxerWeight%firstBoxerWeight + "кг");
        //Задача 7
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalPeople = totalWorkingHours/hoursPerDay;
        System.out.println("Всего работников в компании - "+totalPeople +"чел.");
        totalPeople = totalPeople +94;
        totalWorkingHours = totalPeople * hoursPerDay;
        System.out.println("Если в компании работает " + totalPeople+ " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками");    }
}