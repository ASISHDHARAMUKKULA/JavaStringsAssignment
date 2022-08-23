package StringsAssignment;

public class ReverseAString {

    public static void main(String[] args) {

        String s="iNeuron";
        char ch;
        String reverseString="";
        for(int i=s.length()-1;i>=0;i--){
            reverseString=reverseString+s.charAt(i);


        }
        System.out.printf(reverseString);
    }
}
