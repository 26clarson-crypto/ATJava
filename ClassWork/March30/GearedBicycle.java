public class GearedBicycle extends Bicycle {
    private int gear = 1; // default gear is 1
    final private int MAX_GEAR = 6;
    final private int GEARED_MAX_SPEED = 50;
    
    // make explicit constructor
    public GearedBicycle() {
        // call the parent constructor
         super();
        // initilize the gear to gear #1
       gear = 1;
    }

    public int getGear() { 
        return gear; 
    }

    public void setGear(int gear) {
        if (gear > 0 && gear <= MAX_GEAR) {
            this.gear = gear;
        }
    }

    public void shiftUp () {
        gear = gear + 1;
        if (gear > MAX_GEAR) {
            gear = MAX_GEAR;
        }

    }

    public void shiftDown () {
        gear = gear - 1;
        if (gear < 1) {
            gear = 1;
        }
    }

    // override the pedal method from the bicycle class
    public void pedal () {
        // dont increase by one but the gear number
        int newSpeed = getSpeed() + gear;

    // did we exceed max speed? 
        if (newSpeed > GEARED_MAX_SPEED) {
            newSpeed = GEARED_MAX_SPEED;
        }
        // update speed 
       this.setSpeed(newSpeed);
    }

    // override brake method 


    // override the display method
    public void display() {
        // for a geared bicycle: display the current speed to the screen then the current gear
        System.out.println("Speed: " + getSpeed());
        System.out.println ("Current gear = " + gear);
    }

    public static void main(String[] args) {
        GearedBicycle b = new GearedBicycle();
        b.setGear(2);
        b.pedal();
        b.display(); // Should print "Speed: 2 Gear: 2"

        GearedBicycle c = new GearedBicycle();
        c.shiftUp();
        c.pedal();
        c.pedal();
        c.display(); // Should print "Speed: 6 Gear: 2"
    }
}