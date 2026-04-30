import java.util.Scanner;

public class LabProgram {

   public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
      int count = 0;

      for (int i = 0; i < listSize; i++) {
         if (wordsList[i].equalsIgnoreCase(currWord)) {
            count++;
         }
      }

      return count;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int listSize = scnr.nextInt();
      String[] wordsList = new String[20];

      for (int i = 0; i < listSize; i++) {
         wordsList[i] = scnr.next();
      }

      for (int i = 0; i < listSize; i++) {
         System.out.println(wordsList[i] + " " + getWordFrequency(wordsList, listSize, wordsList[i]));
      }

      scnr.close();
   }
}
