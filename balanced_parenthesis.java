public class balanced_parenthesis {
 public static void balancedop(int ob,int cb,int n,String dibba)
 {
  if(ob==n && cb==n)
  {
   System.out.println(dibba);
   return;
  }
  if(ob<n)
  {
   balancedop(ob+1,cb,n,dibba+"(");
  }
  if(ob>cb)
  {
   balancedop(ob,cb+1,n,dibba+")");
   
  }
 }
 
public static void main(String args[])
{
 balancedop(0,0,3," ");

}
}
