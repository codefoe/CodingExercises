package MyPackahe;

//import com.sun.tools.javac.jvm.StringConcat;

import java.util.Arrays;
import java.util.Scanner;

public class Blank {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //int i=input.nextInt();
        String l="hello world";//first index inclusive, second index is exclusive
        String h=l.substring(0,1).toUpperCase()+l.substring(1,6)+" " +l.substring(6,7).toUpperCase()+l.substring(7);
        String pass="  hide  ";
        String passTrimmed=pass.trim();//eliminates spaces in te beginning and end of the string. Doesnt touch middle
                                        //Strings are immutable(meaning cant be changed).
        String split="one, two, three";
        String[] splitSplitted=split.split(", ");
        System.out.println(Arrays.toString(splitSplitted));
        System.out.println(l);
        System.out.println(h);
        System.out.println(" hi\t whats up");//tab insert
        System.out.println(" Hi\n whats up");//new line
        System.out.println(":" + passTrimmed);


        //String s=input.nextLine();
        //System.out.println((":"+i));
        //System.out.println(":" +s);
    }
   /* public static String fullName(String l,String m,String n){
        return l.concat(m.concat(n));
    }*/
}
