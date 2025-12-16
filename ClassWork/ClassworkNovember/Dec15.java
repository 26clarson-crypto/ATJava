// array but not working
// need to generate 10 random values and store? 

public class Dec15 {
    public static void main (String [] args) {
        // declare my array
        int [] values;

        //make my array
        values = new int [10];


        //loop through the array
        for (int i=0; i<values.length; i++) {
            int v=(int)(Math.random()*100)+1;
            values [i]=v;

            // loop through each element of the array
            for (int number : values) {
                System.out.println(number);
            }
        }
    }
    
    
}


