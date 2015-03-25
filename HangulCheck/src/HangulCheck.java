import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HangulCheck {
 public static void main(String args[]) throws IOException {

  String inputStr = "";
  char[] cha;
  BufferedReader bufferedReader = new BufferedReader(
    new InputStreamReader(System.in));

  System.out.println("아무거나 입력하시오.");

  inputStr = bufferedReader.readLine();
  cha = inputStr.toCharArray();

  for (char c : cha) {
   System.out.print(c + "는 ");
   if (Character.UnicodeBlock.HANGUL_SYLLABLES
     .equals(Character.UnicodeBlock.of(c))
     || Character.UnicodeBlock.HANGUL_JAMO
       .equals(Character.UnicodeBlock.of(c))
     || Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO
       .equals(Character.UnicodeBlock.of(c))
     || Character.UnicodeBlock.HANGUL_JAMO_EXTENDED_A
       .equals(Character.UnicodeBlock.of(c))
     || Character.UnicodeBlock.HANGUL_JAMO_EXTENDED_B
       .equals(Character.UnicodeBlock.of(c)))
    System.out.println("한글입니다.");
   else
    System.out.println("한글이아닙니다.");
  }

 }
}