/* Chloe Larson 
HW 31
I used the intenet to come up with baseball cards, and understanding the formatting for the cards. */

package classes;

public class CardCollector {

    public static void main(String[] args) {

        BaseballCard card1 = new BaseballCard("Babe Ruth", 1933);
        BaseballCard card2 = new BaseballCard("Babe Ruth", 1933);
        BaseballCard card3 = new BaseballCard("Lou Gehrig", 1933);
        BaseballCard card4 = new BaseballCard("Babe Ruth", 1934);
        BaseballCard card5 = new BaseballCard("babe ruth", 1933);

        // toString() demo
        System.out.println("=== toString() Demo ===");
        System.out.println("card1 : " + card1);
        System.out.println("card2 : " + card2);
        System.out.println("card3 : " + card3);
        System.out.println("card4 : " + card4);
        System.out.println();

        // equals() demo
        System.out.println("=== equals() Demo ===");
        System.out.println("card1.equals(card2)  [same player, same year]  → " + card1.equals(card2));
        System.out.println("card1.equals(card3)  [diff player, same year]  → " + card1.equals(card3));
        System.out.println("card1.equals(card4)  [same player, diff year]  → " + card1.equals(card4));
        System.out.println("card1.equals(card1)  [same object]             → " + card1.equals(card1));
        System.out.println("card1.equals(null)   [null comparison]         → " + card1.equals(null));
        System.out.println("card1.equals(card5)  [name in lowercase]       → " + card1.equals(card5));
        System.out.println();

        // Duplicate check
        System.out.println("=== Collector Duplicate Check ===");
        BaseballCard[] collection = {card1, card3, card4};
        BaseballCard newCard = card2;

        boolean isDuplicate = false;
        for (BaseballCard c : collection) {
            if (c.equals(newCard)) {
                isDuplicate = true;
                break;
            }
        }

        System.out.println("New card to check : " + newCard);
        System.out.println("Already in collection? " + isDuplicate);
    }
}