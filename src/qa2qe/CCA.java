package qa2qe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCA {
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of items");
int getitems=Integer.parseInt(br.readLine());
int count=0;
int inputitems[]=new int[getitems];
// int maxvalue;
int maxvalue;
maxvalue=0;
System.out.println("Enter the item id details");
for(int i=0;i<getitems;i++)
{
   inputitems[i]=Integer.parseInt(br.readLine());    
}
for (int i = 0; i < inputitems.length; i++) 
{
for (int j = i + 1 ; j < inputitems.length; j++) 
{
    if (inputitems[i]==(inputitems[j])) 
    {
     count=count+1;
     if (maxvalue<inputitems[i])
       {
           maxvalue=inputitems[i];
       }
    }
}
}
if(count==0)
{
System.out.println("There is no frequently purchased item "); 
}else
{
System.out.println("Frequently purchased item is : "+maxvalue);
}


    }
}

