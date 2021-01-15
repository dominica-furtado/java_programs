/* 
 Given a string input, find counts of each word and display them in sorted order as shown below  :
<word> - <word-count>
*/

import java.util.*;
import java.io.*;

public class word_count
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		System.out.println("Enter a string :");	//Accept a string from user
		str = sc.nextLine();
		str = str.toLowerCase(); 	//Convert str to lowercase
		
		StringTokenizer tokenizer = new StringTokenizer(str,"\t \n:,;?.[]()'");
		
		int len_tokens = tokenizer.countTokens(); 	//Number of tokens
		System.out.println("The total number of tokens = "+len_tokens);
		
		
		//Store the word as key & its count as value
		Map <String,Integer> ht = new HashMap<String, Integer>(); 
		
		for(int i=0; i<len_tokens; i++)
		{
			String key_word = tokenizer.nextElement().toString();
			
			if(ht.containsKey(key_word))
			{
				int cnt = ht.get(key_word);
				ht.put(key_word, cnt+1);
			}
			
			else
			{
				ht.put(key_word, 1);
			}
		}
		
		System.out.println("\nWord count : \n"+ht);
		
		TreeMap tm = new TreeMap(ht);
		System.out.println("\nSorted word count :\n"+tm);
		
	}
}

/*
OUTPUT :-
Enter a string :
Each user on UNIX system owns a set of files. The owner can decide whether other user may view, modify or execute their files. 
The total number of tokens = 24

Word count : 
{owner=1, a=1, other=1, set=1, or=1, may=1, their=1, decide=1, execute=1, each=1, the=1, can=1, modify=1, view=1, system=1, whether=1, of=1, owns=1, files=2, user=2, unix=1, on=1}

Sorted word count :
{a=1, can=1, decide=1, each=1, execute=1, files=2, may=1, modify=1, of=1, on=1, or=1, other=1, owner=1, owns=1, set=1, system=1, the=1, their=1, unix=1, user=2, view=1, whether=1}
 */

