package StringsAssignment;

public class PreservingPosition {

    public static void main(String[] args) {

        String str="Think Twice";
        String[] str1= str.split(" ");
        String result="", result1="";
        System.out.printf(str1[0]);
        System.out.println(str1[1]);
        for (int i=str1[0].length()-1;i>=0;i--){
            result=result+str1[0].charAt(i);
        }
        System.out.printf(result);
        for(int j=str1[1].length()-1;j>=0;j--){
            result1=result1+str1[1].charAt(j);
        }
        System.out.printf(result1);
    }
}
