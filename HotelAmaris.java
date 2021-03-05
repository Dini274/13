/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.amaris;

/**
 *
 * @author Dini Aryani
 */
public class HotelAmaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[][] room  = { 
      {"X", "2", "3", "4", "5"},
      {"1", "2", "3", "4", "5"},
      {"1", "2", "3", "4", "5"},
      {"1", "2", "X", "4", "5"},
    };


    int emptyroom = 0;
    for (int j = 0; j < room.length; j++) {
      for (int i = 0; i < room[j].length; i++) {
        if ("X".equals(room[j][i])) {
          System.out.println("Tamu berada di Lantai " + (j+1) + " Kamar " + (i + 1) );
        } else {
          emptyroom += 1;
        }
      }
    }

    System.out.println("");
    System.out.println("Jumlah Kamar yg tersedia ada " + emptyroom);






  }
 }