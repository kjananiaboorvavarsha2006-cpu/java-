
import java.util.Scanner;

public class stringvowel{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String word= scr.nextLine();
        int vowel=0;
        String word1=word.toLowerCase();/*
        METHOD 1:
        for(int i=0;i<word1.length();i++){
            char ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
             vowel++;
        }
        System.out.println(vowel);
    }
}METHOD 2:
*/
String vowels="aeiouAEIOU";
for(int i=0;i<word1.length();i++){
    if(vowels.contains(word1.charAt(i)+""))
vowel++;
}
System.out.println(vowel);
    }
}


