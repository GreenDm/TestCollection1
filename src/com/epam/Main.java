package com.epam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m18 on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        List<String> lst1 = new ArrayList<>();

for(int i = 0;i<=10;i++){

    lst1.add("number_" + i);

}
       for(String str:lst1){

           System.out.println(str);
       }

        }

    }

