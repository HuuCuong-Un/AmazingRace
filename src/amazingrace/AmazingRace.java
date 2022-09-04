/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //showRecords();
        showRecordsWithTakeAway();
    }
    
    public static void showRecordsWithTakeAway() {
        
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }
            
            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                               "XXX", name, yob, weight, run());
            }
            
        };
        
        Hamster xx = new Hamster("NHẮT", 2021, 0.3);
        Pet racer[] = new Pet[] {new Dog("CHIHUHU", 2021, 0.5),
                                 new Dog("VÀNG ƠI", 1950, 10.0),
                                 new Cat("TOM", 1960, 15.0),                      
                                 new Cat("KITTY", 1990, 5.0),
                                 new Hamster("JERRY", 1960, 0.5), 
                                 xx, 
                                 ufo //object tao tu anonymous class van la PET
                                };
        
        
        System.out.println("The records table");
        for (Pet x : racer) 
            x.showRecord();
        
        
        
    }
    
    public static void showRecords() {
        Hamster xx = new Hamster("NHẮT", 2021, 0.3);
        Pet racer[] = new Pet[] {new Dog("CHIHUHU", 2021, 0.5),
                                 new Dog("VÀNG ƠI", 1950, 10.0),
                                 new Cat("TOM", 1960, 15.0),                      
                                 new Cat("KITTY", 1990, 5.0),
                                 new Hamster("JERRY", 1960, 0.5), 
                                 xx
                                };
        
        
        System.out.println("The records table");
        for (Pet x : racer) 
            x.showRecord();
        
        
        //Bài AmazingRace bắt tụi nhỏ chạy 1ượt  để ghi nhận thành tích
        //ta so sánh trên thành tích chạy này
        
        //hii sửa nè
        
    }
}
