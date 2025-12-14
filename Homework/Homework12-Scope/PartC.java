/* Chloe Larson
Part C
*/

public class PartC
{   
    public static int countVowels(String phrase)
   {
      int count = 0;
      for (int i = 0; i < phrase.length(); i++)
      {
         char ch = phrase.charAt(i);
         if (isVowel(ch))
         {
            count++;
         }
      }
      return count;
   }
   
   public static boolean isVowel(char ch)
   {
      ch = Character.toLowerCase(ch);
      return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
   }
   public static void main(String[] args)
   {
      String phrase = "Hello World";
      int vowelCount = countVowels(phrase);
      System.out.println("The number of vowels in \"" + phrase + "\" is: " + vowelCount);
   }
   
}