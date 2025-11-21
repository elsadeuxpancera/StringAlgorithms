public class StringAlgorithms {

   public static String printCharacters(String word) {
      String newString = "";
      for(int i = 0; i < word.length(); i ++) {
         newString += (word.substring(i, i+1) + "\n");
      }
      return newString;
   }   

   public static String reverseWord(String word) {
      String newString = "";
      for(int i = word.length(); i > 0; i --) {
         newString += word.substring(i-1, i);
         
      }  
      return newString; 
   }
   
   public static String capitalizeString(String sentence) {
      String newString = "";
      newString += sentence.substring(0,1).toUpperCase();
      for(int i = 1; i < sentence.length(); i ++) { 
         if (sentence.substring(i-1, i).equals(" ")) {
            newString += " " + sentence.substring(i, i+1).toUpperCase();
         } else {
            newString += sentence.substring(i, i+1);  
         }  
      }
      return newString;   
   } 
   
   public static boolean detectPalindrome(String word) {
      String newString = "";
      for(int i = word.length(); i > 0; i --) {
         newString += word.substring(i-1, i);
         
      }  
      if (newString.equals(word)){
         return true;
      } else {
         return false;
      } 
   }

   public static void main(String[] args) {
      System.out.println(printCharacters("hello"));
      System.out.println(reverseWord("hello"));
      System.out.println(capitalizeString("the quick brown fox"));
      System.out.println(detectPalindrome("racecar"));
   }
}