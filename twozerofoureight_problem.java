public class twozerofoureight_problem {
 public static void words(int num)
 {
  if(num==0)
  {return;}

  String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
  words(num/10);
  int digit=num%10;
 System.out.print(arr[digit] + " ");
  


 }
public static void main(String args[])
{
 words(44444);

}


}
