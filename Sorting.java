package app;
import java.util.*;

public class Sorting 
{
   public static TreeSet<Character> find(String m)
   {   
	   
	   TreeSet<Character> t=new TreeSet<>();
	   int i,j;
	   for(i=0;i<m.length();i++)
		   
	   {   
		   int cnt=0;
		   for(j=m.length()-1;j>i;j--)
		   {
			   if(m.charAt(i)!=m.charAt(j))
					   {   
				           cnt++; 
				       }
			   else
			   {
				   
				   cnt=0;
				   i++;
				   j++;
				   System.out.println(i);
			   }
			   
				   
			  
			}
		   if(cnt==m.length()-i-1)
		   {
			   t.add(m.charAt(i));
		   }
	   }
	   
	   return t;
   }
   
   public static void main(String a[])
   {
	   String str="rishi";
	   TreeSet<Character> m=new TreeSet<>();
	   m=find(str);
	   System.out.println(m);
	   
   }
}
