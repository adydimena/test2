package com.example.ady.test2;

/**
 * Created by Ady on 11/26/2017.
 */

public class test2 {

    public static void main (String[] args ) {
        ;



        System.out.println(task1("abcz45368675abgf@#"));




    }
    public static StringBuilder task1(String strg){
        StringBuilder dummy = new StringBuilder(strg);
        int operation;
        Character oper;
        int dummmy;
        for (int i = 0; i <strg.length() ; i++) {
            dummmy = (int) strg.charAt(i);
            if (dummmy >95 && dummmy <123  ) {
                operation = (int) strg.charAt(i);
                operation = operation - 97;
                //System.out.println("the letter " + strg.charAt(i) + "is "+ (int) strg.charAt(i));
                operation = 122 - operation;
                oper = (char) operation;
                dummy.setCharAt(i, oper);
            }

        }


        return dummy;
    }
}
