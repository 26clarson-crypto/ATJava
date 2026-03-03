/* Chloe Larson
Part B
 */

public class PartB {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.println("Before: " + myItem.getValue());
        myItem.setValue(13);
        System.out.println("After: " + myItem.getValue());
    }
}

class Item {
    private int value;

    public void setValue(int value) {
        this.value = value; // Use 'this' to refer to the instance variable (used the internet here to understand this concept)
    }
    public int getValue() {
        return value;
    }
}

// The output of the original program would be:
// Before: 0
// After: 0

// The output of the modified program would be:
// Before: 0
// After: 13

