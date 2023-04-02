package org.example;

public class CaesarCypher {

    public String encrypt(String message, int key){
        StringBuilder sb = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        for(int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if(!Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else{
                if(Character.isUpperCase(ch)){
                    int index = alphabet.indexOf(Character.toLowerCase(ch));
                    sb.append(Character.toUpperCase(shiftedAlphabet.charAt(index)));
                }else{
                    int index = alphabet.indexOf(ch);
                    sb.append(shiftedAlphabet.charAt(index));
                }
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {

        CaesarCypher caesarCypher = new CaesarCypher();
        caesarCypher.encrypt("Get thee behind me Satan!!!", 17);
    }
}
