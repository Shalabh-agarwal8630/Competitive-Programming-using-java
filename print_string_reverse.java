public class print_string_reverse {
 public static void printop(String str) {
  int n = str.length();
  if (n == 0) {
   return;
  }
  printop(str.substring(1));
  char firstchar = str.charAt(0);
  System.out.print(firstchar);
  
 }

 public static void main(String args[]) {
  String str = "JAVA";
  printop(str);

 }

}