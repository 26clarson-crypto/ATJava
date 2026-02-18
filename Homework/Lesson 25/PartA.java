/* Part A
 */


class CashRegister {
   public void addItem(double price) {
       // put implementation here.
   }
   public double getTotal() {
       // put implementation here.
   }
   public int getCount() {
       // put implementation here.
   }
   public void clear() {
       // put implementation here.
   }
}


public static void main(String[] args) {
   CashRegister cr = new CashRegister();
   cr.addItem(3.00);
   cr.addItem(1.50);
   System.out.printf("Total = $%.2f%n", cr.getTotal());
   cr.clear();
   cr.addItem(2.00);
   cr.addItem(2.50);
   System.out.println("You have " + cr.getCount() + " items.");
   System.out.printf("Total = $%.2f%n", cr.getTotal());
}

// the output of the previous code should be:
// Total = $4.50
// You have 2 items.
// Total = $4.50
