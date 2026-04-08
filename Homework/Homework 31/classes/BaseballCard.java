/* Chloe Larson
HW 31
I used the internet to understand the cases, and make sure it was formatted correctly. */

package classes;

public class BaseballCard {
    String name;
    int year;

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "BaseballCard[player=\"" + name + "\", year=" + year + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BaseballCard other = (BaseballCard) obj;
        return this.year == other.year && this.name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        int result = name.toLowerCase().hashCode();
        result = 31 * result + year;
        return result;
    }
}