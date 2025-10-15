/* Chloe Larson
 * Homework 03 - Variables & Operators
 * Calculate the total volume of a soda
 * 
 */
public class Volume1 {
    public static void main(String[] args) {
       // Declare variable cansPerPack of type int and initialize it to 6
       int cansPerPack = 6;
       // Declare a constant called CAN_VOLUME with a value of 0.355
       final double CAN_VOLUME = 0.355; 
       // Calculate and display the total volume of soda in a pack of cans
       double totalVolume = cansPerPack * CAN_VOLUME;
       System.out.println("The total volume of soda in a pack of cans is: " + totalVolume + " liters");
       // Declare a constant called BOTTLE_VOLUME with a value of 2.0 
       final double BOTTLE_VOLUME = 2.0;
       // Calculate and display the total volume of soda in a pack of cans and a bottle
       double totalVolumeWithBottle = totalVolume + BOTTLE_VOLUME;
       System.out.println("The total volume of soda in a pack of cans and a bottle is: " + totalVolumeWithBottle + " liters");
    // modifying the program to calculate and display additional quanitites.
        int packsPerCase = 4;
        double totalVolumeInCase = totalVolume * packsPerCase;
        System.out.println("The total volume of soda in a case of cans is: " + totalVolumeInCase + " liters");
        double totalVolumeInCaseWithBottle = totalVolumeInCase + BOTTLE_VOLUME;
        System.out.println("The total volume of soda in a case of cans and a bottle is: " + totalVolumeInCaseWithBottle + " liters");
    }
    
}
