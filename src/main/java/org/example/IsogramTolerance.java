package org.example;
import java.util.List;
import java.util.ArrayList;
public class IsogramTolerance {
    public static boolean isogramWithTolerance(String s, int k) {
        List<Character> letters = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                letters.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        int count = 0;
        for(int i = 0; i< letters.size()-1; i++){
            for(int j = 1; j<letters.size(); j++){
                if(k == 0){
                    if(letters.get(i)==letters.get(j)){
                        return false;
                    }else{
                        return true;
                    }
                }else{
                    if(letters.get(i)==letters.get(j))
                        count++;
                }
            }
        }
        if(count <= k ){
            return true;
        }else{
            return false;
        }
    }
}