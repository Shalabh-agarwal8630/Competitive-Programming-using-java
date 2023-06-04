public class count_length_of_string {
 public static int printop( String str) {
 if(str.isEmpty())
 return 0;

 int recans=printop(str.substring(1));
 int myans=recans+1;
 return myans;

 }

 public static void main(String args[]) {
 System.out.println("length is "+ printop("madar"));
 }

}
