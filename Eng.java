import java.util.*;
public class Eng
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter initial and target string: ");
    String initial = sc.nextLine();
    String target = sc.nextLine();
    StringBuffer s = new StringBuffer(initial);
    if(target.length()<initial.length())
    {
      System.out.println("Enter valid string");
      System.exit(-1);
    }
    //System.out.println(initial.compareTo(target));
    while(!(target.length()==initial.length()))
    {
      char ch = initial.charAt(initial.length()-1);
      char ch1 = initial.charAt(0);
      if(target.charAt(target.length()-1) =='A' && ch!='A')
      {
        initial+="A";
        System.out.println(initial);
        if(target.length()==initial.length())
          break;
      }
      else
      {
        if((target.charAt(0)=='B' && ch1!='B') || target.charAt(target.length()-1)=='B' && ch!='B')
        {
          System.out.println(initial);
          initial+="B";
          s = new StringBuffer(initial);
          initial = (s.reverse()).toString();
          if(target.length()==initial.length())
            break;
        }
      }
    }
    if(initial.equals(target))
    {
      System.out.println("\"Possible\"");
    }else
    {
      System.out.println("\"Impossible\"");
    }
  }
}
