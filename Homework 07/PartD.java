/* Chloe Larson
Part D
*/
public class PartD {
    public static void main(String[] args) {
        double grade = ch;
        String letterGrade;

        if (grade >= 4.0) {
            letterGrade = "A+";
        } else if (grade >= 3.9) {
            letterGrade = "A";
        } else if (grade >= 3.7) {
            letterGrade = "A-";
        } else if (grade >= 3.3) {
            letterGrade = "B+";
        } else if (grade >= 3.0) {
            letterGrade = "B";
        } else if (grade >= 2.7) {
            letterGrade = "B-";
        } else if (grade >= 2.3) {
            letterGrade = "C+";
        } else if (grade >= 2.0) {
            letterGrade = "C";  
        } else if (grade >= 1.7) {
            letterGrade = "C-";
        } else if (grade >= 1.3) {
            letterGrade = "D+";
        } else if (grade >= 1.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
//Error code in case someone enters a grade over 4.0 or less than 0.0 or a character
        if (grade > 4.0 || grade < 0.0) {
            System.out.println("Error: Invalid grade entered.");
        } else {
            System.out.println("The letter grade is: " + letterGrade);
        }
    }
}
