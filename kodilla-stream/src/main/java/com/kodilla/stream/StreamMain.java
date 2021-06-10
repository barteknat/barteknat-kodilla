package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        new PoemBeautifier().beautify("eldorado", (text) -> "ABC " + text + " ABC");
        new PoemBeautifier().beautify("eldorado", (text) -> text.toUpperCase());
        new PoemBeautifier().beautify("eldorado", (text) -> text.substring(0, 1).toUpperCase() + text.substring(1, text.length()-1) + text.substring(text.length()-1, text.length()).toUpperCase());
        new PoemBeautifier().beautify("eldorado", (text) -> "-" + text.substring(0, text.length()/2) + "-" + text.substring(text.length()/2, text.length()) + "-");
    }
}
