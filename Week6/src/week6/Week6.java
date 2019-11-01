/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author 4yorke89
 */
public class Week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarPark cp = new CarPark();
        
        Scanner scanIn = new Scanner(System.in);
        
        int state = 1;
        
        while(state == 1)
                {
                    System.out.println("A - Add Car");
                    System.out.println("B - remove Car");
                            System.out.println("X - Exit");
                            String input = scanIn.nextLine();
                            if(input.equals("A"))
                            {
                                System.out.println("Please enter Number Plate");
                            }
                            else(input.equals("B"))
                                    {
                                        
                                    }
                            
                               else(input.equals("X")) 
                                       {
                                           state = 0;
                                       }
                }
    }

}
