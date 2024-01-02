/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Hall.Time;

/**
 *
 * @author ttthu
 */

public enum TimeOfDay {
    MORNING(15),
    AFTERNOON(20),
    EVENING(25);
    
    private final int timePrice;
    
    TimeOfDay(int timePrice) {
        this.timePrice = timePrice;
    }

    public int getTimePrice() {
        return timePrice;
    }
}
