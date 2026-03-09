/* Chloe Larson
Die Project 
 */

public class Die {

    private int value;
    // Calling on the default constructor to initialize the die with a random value
    public Die() {
        roll();
    }
    public Die(int initialValue) {
        value = initialValue;
    }

    // Roll the die
    public void roll() {
        value = (int)(Math.random() * 6) + 1;
    }

    // Get current value
    public int getValue() {
        return value;
    }

    // Display ASCII die
    public void display() {

        // formatting of the dice is based on the value of the die, which is determined by the roll method
        switch(value) {
            case 1:
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   0   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;

            case 2:
                System.out.println("+-------+");
                System.out.println("| 0     |");
                System.out.println("|       |");
                System.out.println("|     0 |");
                System.out.println("+-------+");
                break;

            case 3:
                System.out.println("+-------+");
                System.out.println("| 0     |");
                System.out.println("|   0   |");
                System.out.println("|     0 |");
                System.out.println("+-------+");
                break;

            case 4:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("|       |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;

            case 5:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("|   0   |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;

            case 6:
                System.out.println("+-------+");
                System.out.println("| 0   0 |");
                System.out.println("| 0   0 |");
                System.out.println("| 0   0 |");
                System.out.println("+-------+");
                break;
        }
    }
}