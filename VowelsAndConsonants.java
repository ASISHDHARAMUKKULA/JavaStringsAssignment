package StringsAssignment;

import java.util.Scanner;

public class VowelsAndConsonants {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scanner.next();
        int consonantsCount=0,vowelsCount=0;
        char[] ch=str.toLowerCase().toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'  || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                vowelsCount++;

            }
            else {
                consonantsCount++;
            }

        }
        System.out.println("Consants Count"+consonantsCount);
        System.out.println("Vowels Count"+vowelsCount);
    }
}
