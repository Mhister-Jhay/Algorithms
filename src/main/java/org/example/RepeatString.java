package org.example;

public class RepeatString {

    public static String accum(String str) {
        char[] strChar = new char[str.length()];
        int index = 0;
        String[] answer = new String[str.length()];
        for(int i = 0; i < str.length(); i++){
            index = i;
            strChar[i] = Character.toUpperCase(str.charAt(i));
            answer[i] = ""+strChar[i];
            for(int j = 0; j < index; j++){

                answer[i] += Character.toLowerCase(str.charAt(i));
            }
        }
        
        String[] finalStr = new String [str.length()];
        for(int k = 0; k < str.length()-1; k ++){
            finalStr[k] =answer[k] +"-";
        }
        finalStr[str.length()-1] = answer[str.length()-1];
        String bbbb = "";
        for(int l = 0; l < str.length(); l++){
            bbbb = bbbb + finalStr[l];
        }
        return bbbb;
    }

    public static void main(String[] args) {
        System.out.println(accum("abcD"));
    }
}
