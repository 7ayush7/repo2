package com.ayush.coding.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GoldManSachsQn1 {


    /*
     * Complete the function below.
     */
    static String findQualifiedNumbers(int[] numberArray) {

        StringBuilder ret = new StringBuilder(12345);
        Arrays.sort(numberArray);
        for(int i=0;i<numberArray.length;i++){
            int d = numberArray[i];
            int rem = 0;
            int oneCount = 0;
            int twoCount = 0;
            int threeCount = 0;
            while(d>0){
                rem = d%10;
                if(rem==1){
                    oneCount++;
                }
                else if(rem==2){
                    twoCount++;
                }
                else if(rem==3){
                    threeCount++;
                }
                d = d/10;
            }
            if(oneCount!=0&&twoCount!=0&&threeCount!=0){
                ret.append(numberArray[i]);
                ret.append(",");
            }
        }
        if(ret.lastIndexOf(",")>0){
        ret.deleteCharAt(ret.lastIndexOf(","));
        }
        else{
            ret=new StringBuilder("-1");
        }     
        return ret.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String res;
        int numberArray_size = 0;
        numberArray_size = Integer.parseInt(in.nextLine().trim());

        int[] numberArray = new int[numberArray_size];
        for(int i = 0; i < numberArray_size; i++) {
            int numberArray_item;
            numberArray_item = Integer.parseInt(in.nextLine().trim());
            numberArray[i] = numberArray_item;
        }

        res = findQualifiedNumbers(numberArray);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}
