/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author 4yorke89
 */
public class CarPark {

    private Car[] spaces = new Car[15];

    public boolean addCar(Car carIn) {
        for (int count = 0; count < spaces.length; count++) {
            if (spaces[count] == null) {
                spaces[count] = carIn;
                return true;
            }
        }
        return false;
    }

    public boolean removeCar(String noPlateIn) {
        for (int count = 0; count < spaces.length; count++) {
            if (spaces[count] != null) {
                if (spaces[count].getNoPlate().equals(noPlateIn)) {
                    spaces[count] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public Car getCar(String noPlateIn) {
        for (int count = 0; count < spaces.length; count++) {
            if (spaces[count] != null) {
                if (spaces[count].getNoPlate().equals(noPlateIn)) {
                    return spaces[count];
                }

            }

        }
        return null;
    }
}
