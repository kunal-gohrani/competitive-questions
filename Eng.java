import java.util.*;
public class Eng
{
    static private String initial;
    static private String target;
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter initial and target string: ");
    initial = sc.nextLine();
    target = sc.nextLine();
    if(target.length()<initial.length())
    {
      System.out.println("Enter valid string");
      System.exit(-1);
    }
    change(0);
    if(initial.equals(target))
    {
      System.out.println("\"Possible\"");
    }else
    {
      System.out.println("\"Impossible\"");
    }
  }
    static void change(int count)
    {
        if(target.length()==initial.length())
        {
            return;
        }else if(count>initial.length()-1)
        {
            for(int i=count;i<target.length();i++)
            {
                char ch1=target.charAt(i);
                if(ch1=='B')
                {
                    initial+="B";
                    StringBuffer s = new StringBuffer(initial);
                    initial=(s.reverse()).toString();
                }
                else
                {
                    initial+="A";
                }
            }
        }
        char ch = initial.charAt(count);
        char ch1 = target.charAt(count);
        if(ch!=ch1)
        {
            if(ch1=='B')
            {
                initial+="B";
                StringBuffer s = new StringBuffer(initial);
                initial=(s.reverse()).toString();
                
            }else
            {
                initial+="A";
            }
        }
        
            change(++count);
        
    }
}
