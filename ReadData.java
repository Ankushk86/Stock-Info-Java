import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadData { 
	public static void main(String[] args) throws Exception  
	{    
	
	Scanner cm30 = new Scanner(new File("C:\\Users\\Harman Singh\\Downloads\\cm30JAN2020bhav.csv"));;
	while (cm30.hasNextLine()) {
        String high1 = cm30.nextLine();
        String[] column1 = high1.split(",");
        String higher = column1[3];
        String lower = column1[4];
        System.out.println(higher);
        cm30.useDelimiter(",");
        System.out.println(lower);
	}
	while (cm30.hasNext())  
	{  
	System.out.print(cm30.next()); 
	}   
	cm30.close();  
	}
}
