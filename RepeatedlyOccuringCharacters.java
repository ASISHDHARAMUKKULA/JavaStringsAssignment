package StringsAssignment;

import java.util.Scanner;

public class RepeatedlyOccuringCharacters {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String str="";
        str=scanner.nextLine();
        int count=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==ch[i+1] && ch[i]!=' '){
                count++;
                System.out.println(ch[i]);

            }
        }
    }
}
