import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  String str;
  char[] ch;
  String sa = "";
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the String you would like to reverse: ");
  str = s.nextLine();
  ch = str.toCharArray();
  System.out.println(" The Reversed String is: ");
  for (int i = ch.length-1 ; i >= 0; i--){
    sa = sa + ch[i];
    }
   System.out.println(sa);
  }
}
