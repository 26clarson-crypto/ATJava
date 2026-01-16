/* 
Chloe Larson
Part B
Multi-dimensional Arrays */


public class PartB {
    static int [][] numbers = {
        {8, 6, 7},
        {5, 3, 0}
    };
    // declare and initialize second array.
    static int [][] values = {
        {0, 7, 6, 5},
        {2, 2, 0, 1},
        {8, 4, 5, 7}
    };

    public static void main(String[] args) {
        System.out.println("the first array is:");
        print(numbers);
        System.out.println("the second array is:");
        print(values);
    }

    public static void print(int [][] array) {
        // print both arrays saying: "first array is:" and "second array is:""
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println();

    }
}