import java.util.*;
public class Mains {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line=scan.nextLine();
    LetterSequence st=new LetterSequence(line);
   TreeMap<Character,Integer> result= st.computeFrequency();
    st.displayLetterFrequency(result);
  }
}