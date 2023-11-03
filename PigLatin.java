import java.util.Scanner;

public class PigLatin {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String vowels = "aeiou";

    System.out.println("Welcome to Pig Latin Translator.");
    System.out.print("Please enter a word to be translated.");

    String word = scan.nextLine().toLowerCase().trim();
    int vowelPosition = 1;

    char startC = word.charAt(0);
    String startChar = String.valueOf(startC);

    if (vowels.contains(startChar)) {
      System.err.println("The translated word is: " + word + "yay");
    } else {
      for (int i = 0; i < word.length(); i++) {
        startC = word.charAt(i);
        startChar = String.valueOf(startC);
        if (vowels.contains(startChar)) {
          vowelPosition = i;
          break;
        }
      }
      System.out.println(
        "The translated word is: " +
        word.substring(vowelPosition) +
        word.substring(0, vowelPosition) +
        "ay"
      );
    }
    scan.close();
  }
}
