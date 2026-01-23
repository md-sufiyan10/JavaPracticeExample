package practice.number;

import java.util.Locale;
import java.util.Scanner;

public class _11CountVowelsConsonants {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=scanner.nextLine();
        int vowels=0,consonants=0;
        str=str.toLowerCase();

        for (char c : str.toCharArray()){
            if(c >='a' && c <='z'){
                if ("aeious".indexOf(c)!=-1)
                    vowels++;
                else
                    consonants++;
            }
        }
        IO.println("Vowels:"+vowels + " , Consonants:"+consonants);
    }
}
