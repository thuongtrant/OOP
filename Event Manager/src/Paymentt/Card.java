/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paymentt;

import Booking.Booking;

/**
 *
 * @author ttthu
 */
public class Card extends Payment{

    public Card() {
    }
    
    @Override
    public double totalRentalPrice(double totalPrice) {
        return totalPrice * 0.95;
    }    
    
}
