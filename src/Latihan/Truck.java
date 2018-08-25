/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author MPC
 */
public class Truck {
    public int cedence;
    public int gear;
    public int speed;
    public Truck(int startCadence,int startSpeed,int startGear)
    {
        gear = startGear;
        cedence = startCadence;
        speed = startSpeed;
    }
    public void serCedence(int newValue)
    {
        cedence = newValue;
    }
    public void setGear(int newValue)
    {
        gear = newValue;
    }
    public void applybrake(int decrement)
    {
        speed = decrement;
    }
    public void speedUp(int increment){
        speed = increment;
    }
}
 class MountainTruck extends Truck
{
    public int seatHeight;
    public MountainTruck(int startHeight,int startCedence,int startSpeed,int startGear)
    {
        super (startCedence,startSpeed,startGear);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public static void main (String [] args)
    {
        System.out.println("mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear = "+ MB.gear);
        System.out.println("speed=" + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear=" + MB.gear);
        System.out.println("speed=" + MB.speed);
        MB.speedUp(2);
        System.out.println("gear=" + MB.gear);
        System.out.println("speed=" + MB.speed);
    }
}
