package StringsAssignment;

import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str="";
        System.out.println("Enter a String");
        str=scanner.nextLine();
        boolean b=isPangram(str);
        if(b){
            System.out.println("String is Pangram");
        }else {
            System.out.println("String is not Pangram");
        }
    }

    public static  boolean isPangram(String str){

        String str1=str.toLowerCase();
        boolean b=true;

        for(char ch='a';ch<='z';ch++){
            if(!str1.contains(String.valueOf(ch))){
                b=false;
                break;
            }

        }
        return b;
    }
}
