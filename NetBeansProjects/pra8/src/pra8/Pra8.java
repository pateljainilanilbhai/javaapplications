/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra8;

/**
 *
 * @author jainil
 */
public class Pra8 {

  
		public static String[] wordsWithout(String[] words, String target) {
			  int found = 0;
			  
			  for (int i = 0; i < words.length; i++) {
			    if (words[i].equals(target))
			      found++;
			  }
			  found = words.length - found;
			  int place = 0;
			  
			  String[] str = new String[found];
			  for (int j = 0; j < words.length; j++) {
			    if (!words[j].equals(target)) {
			      str[place] = words[j];
			      place++;
			    }
			  }
			  return str;
			}
		public static void main(String[] args)
		{
			String s[]={"a","e","i","o","u"};
			s=wordsWithout(s,"a");
			for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		
		}

}



