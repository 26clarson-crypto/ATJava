/* HW 30
Chloe Larson
Used internet to understand how to create an abstract class and implement it in a subclass.  */
 

public abstract class Sensor {
    private String name;
    private int modelNumber;

    public Sensor(String name, int modelNumber) {
        this.name = name;
        this.modelNumber = modelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    // Abstract method that subclasses must implement
    public abstract void recordMeasurement();

}
