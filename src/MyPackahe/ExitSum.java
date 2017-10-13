package MyPackahe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExitSum {


    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;String exit="toal";
        while(!exit.equals("total")){String s=reader.readLine();
        if(!s.equals("total")){
            sum=sum+Integer.parseInt(s);
        }else{exit="total";}
    }System.out.println(sum);
}}
