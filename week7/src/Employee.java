/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4yorke89
 */
public class Employee {
   private String name;
   private double pay;
   private int hours;
   private int holidays;
   
   public Employee(String nameIn, double payIn, int hoursIn, int holidaysIn)
   {
       name = nameIn;
       pay = payIn;
       hours = hoursIn;
       holidays = holidaysIn;
   }
   public String getName()
   {
       return name;
   }
   public double getPay()
   {
       return pay;
   }
   public int getHours()
   {
       return hours;
   }
   public int getHolidays()
   {
       return holidays;
   }
}
