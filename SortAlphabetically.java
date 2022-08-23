package StringsAssignment;

import java.util.Scanner;

public class SortAlphabetically {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String str="";
        str=scanner.next();
        System.out.println(str);
        char[] ch=str.toCharArray();
        System.out.println(ch);
        char temp=' ';
        System.out.println(ch.length);
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;

                }
            }
        }

        System.out.println(ch);

    }
}
