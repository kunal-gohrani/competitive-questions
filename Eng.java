import java.util.*;
public class Eng
{
    static private String initial; //The initial string
    static private String target; //The target string
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter initial and target string: ");
        //Taking input of initial and target string
        initial = sc.nextLine();
        target = sc.nextLine();
        //Checking whether the strings satisfy the constraint
        if(target.length()<initial.length())
        {
          System.out.println("Enter valid string");
          System.exit(-1);
        }
        /*calling the recursive function which tries to change initial to target string.*/
        change(0); //the argument passed is the starting position, i.e. zero
        //checking if initial is equal to target and printing results
        if(initial.equals(target))
        {
          System.out.println("\"Possible\"");
        }else
        {
          System.out.println("\"Impossible\"");
        }
    }

    /*Recursive function to change initial to target string*/
    static void change(int count)
    {
        if(target.length()==initial.length()) //returns to main if initial and target have same length
        {
            return;
        }else if(count>initial.length()-1) //this condition is executed when we are out of characters in initial string but target string has some characters left
        {
            for(int i=count;i<target.length();i++) //checks for leftover characters in target and adds it to initial based on the given rules
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
        else 
        {
            //this condition is executed till the length of the initial string.
            char ch = initial.charAt(count);
            char ch1 = target.charAt(count);
            if(ch!=ch1) //will add characters to initial only if characters in initial and target string do not match
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
}
