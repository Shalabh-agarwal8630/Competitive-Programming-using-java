public class print_decreasing {
 public static void printop(int n) {
  if (n == 0) {
   return;
  }
  System.out.print(n+" ");
  printop(n - 1);
  
  
 }

 public static void main(String args[]) {
  int n=4;
  printop(n);

 }

}
