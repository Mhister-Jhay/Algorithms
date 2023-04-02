package org.example;

public class HighestOccurringChar {

    public char getHighestOccurringChar(String message){
        // a character to store the highest occurring character
        char highestOccurringChar = ' ';
        // an integer to store the highest occurring value
        int highestOccurringValue = 0;
        // an array to initialise all possible 256 characters
        int[] count = new int[256];
        for(int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if(Character.isLetter(message.charAt(i))) {
                count[(int) ch]++;
            }
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] > highestOccurringValue){
                highestOccurringChar = (char) i;
                highestOccurringValue = count[i];
            }
        }
        return highestOccurringChar;
    }

    public static void main(String[] args) {
        HighestOccurringChar highestOccurringChar = new HighestOccurringChar();
        System.out.println(highestOccurringChar.getHighestOccurringChar("elephant"));
    }
}
