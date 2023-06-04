public class print_all_char_of_string {
 public static void printop(String str) {
  int n = str.length();
  if (n == 0) {
   return;
  }
  char firstchar = str.charAt(0);
  System.out.print(firstchar);
  printop(str.substring(1));
 }

 public static void main(String args[]) {
  String str = "JAVA";
  printop(str);

 }

}