
/*
Enter String
Welcome to java coding
wELCOME TO JAVA CODING
 */

import java.util.Scanner;

public class UptoLctoUp {
    static String uppertoLowerandLowertoUp(String s1){
        String s2="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch>='a'&& ch<='z'){
                s2=s2+(char)(ch-32);
            }
            else if(ch>='A' && ch<='Z'){
                s2=s2+(char)(ch+32);
            }
            else{
                s2=s2+ch;
            }

        }
        return s2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s1=sc.nextLine();
        System.out.println(uppertoLowerandLowertoUp(s1));


    }
}
