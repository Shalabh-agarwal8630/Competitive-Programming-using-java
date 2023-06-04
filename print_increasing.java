public class print_increasing {
 public static void printop(int n) {
  if (n == 0) {
   return;
  }
  printop(n - 1);
  System.out.print(n+" ");
  
  
  
 }

 public static void main(String args[]) {
  int n=4;
  printop(n);

 }

}
