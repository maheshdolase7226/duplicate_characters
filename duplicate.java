package duplicate_char;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicate 
	{
    	public static void main(String[] args) 
    	{
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("Enter a string:");
    		String input = scanner.nextLine();
        
	        Map<Character, Integer> CountChar = new HashMap<>();
	        
	        for (char ch : input.toCharArray())
	        {
	        	CountChar.put(ch, CountChar.getOrDefault(ch, 0) + 1);
	        }
	        
	        System.out.println("Duplicate characters :");
	        for (Map.Entry <Character, Integer> add : CountChar.entrySet())
	        {
	            if (add.getValue() > 1) 
	            {
	                System.out.println(add.getKey() + " - " + add.getValue());
	            }
	        }
	        
	        scanner.close();
	    }
	}