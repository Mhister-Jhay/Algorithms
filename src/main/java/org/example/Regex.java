package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    String sentence;
    public Regex(String sentence){
        this.sentence = sentence;
    }
    // Helper code to get the list of strings that matches the required pattern
    protected List<String> getTokens(String pattern)
    {
        ArrayList<String> tokens = new ArrayList<>();
        Pattern tokSplitter = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = tokSplitter.matcher(sentence);

        while (m.find()) {
            tokens.add(m.group());
        }

        return tokens;
    }

    public int getNumberOfWords(){
        String[] words = sentence.split(" +");
        return words.length;
    }
    public int getNumberOfSentence(){
        String[] sentences = sentence.split("[^.?!]+");
        return sentences.length;
    }
    public int getNumberOfSyllables(){
        List<String> syllables = getTokens("[aeiouy]+([^e\\W]|[^aeiouy\\W]?)");
        return syllables.size();
    }

    public static void main(String[] args) {
        Regex regex = new Regex("My name is Peterson. I am a boy. And yes, I am very smart! I am very dedicated to fulfilling everything I set my mind to do");
        System.out.println(regex.getNumberOfWords());
        System.out.println(regex.getNumberOfSentence());
        System.out.println(regex.getNumberOfSyllables());
    }
}
