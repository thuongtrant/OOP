/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Hall.Time;

/**
 *
 * @author ttthu
 */
public enum DayOfWeek {
    MONDAY(10),
    TUESDAY(10),
    WEDNESDAY(10),
    THURSDAY(10),
    FRIDAY(10),
    SATURDAY(20),
    SUNDAY(20);
    private final int dayPrice;
    DayOfWeek(int dayPrice) {
        this.dayPrice = dayPrice;
    }

    public int getDayPrice() {
        return dayPrice;
    }
}



