package StringsAssignment;

import java.util.Scanner;

public class CountNumberOfSpecialCharacters {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scanner.next();
        char[] ch=str.toCharArray();
        int alphabetscount=0,digitsCount=0,specialCharactersCount=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z'){
                alphabetscount++;
            } else if (ch[i]>='0' && ch[i]<='9') {
                digitsCount++;

            }
            else {
                specialCharactersCount++;
            }
        }
        System.out.println(alphabetscount);
        System.out.println(digitsCount);
        System.out.println(specialCharactersCount);
    }
}
