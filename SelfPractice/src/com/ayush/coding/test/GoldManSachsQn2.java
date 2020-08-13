package com.ayush.coding.test;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getShrunkArray' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY inputArray
     *  2. INTEGER burstLength
     */

    public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {
        int sizeOfinputArray=inputArray.size();
        List<String> list = new java.util.LinkedList<>();
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<sizeOfinputArray;i++){
            if(map.containsKey(inputArray.get(i))){
                map.put(inputArray.get(i), map.get(inputArray.get(i))+1);
            }
            else{
                map.put(inputArray.get(i), 1);
            }
        }

        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()<burstLength){
                list.add(e.getKey());
            }
        }
        
        return list;

    }

}

public class GoldManSachsQn2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int inputArrayCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> inputArray = IntStream.range(0, inputArrayCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int burstLength = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.getShrunkArray(inputArray, burstLength);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
