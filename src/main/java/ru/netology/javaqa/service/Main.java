
package ru.netology.javaqa.service;
public class Main {
    public static void main(String[] args) {
        HolidayService service = new HolidayService();
        int vacation = service.calculate(100_000, 60_000, 150_000);
        System.out.println(vacation);

    }
}
