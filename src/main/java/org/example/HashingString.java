package org.example;

public class HashingString {

    public static String maskify(String cc) {
        if(cc.length() < 4){
            return cc;
        } else if(cc.length() >= 4){
            char[] ccChar = cc.toCharArray();
            int i = 0;
            String ans = "";
            for(char ch : ccChar){
                if(i < ccChar.length - 4){
                    ans+="#";
                }else{
                    ans += ch;
                }
                i++;
            }
            return ans;
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(HashingString.maskify("3681u3e948883167"));

    }
}
