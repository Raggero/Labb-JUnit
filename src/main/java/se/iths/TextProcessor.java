package se.iths;

public class TextProcessor {

    public String stringToUppercase(String text){
        return text.toUpperCase();
    }

    public String stringToLowerCase(String text){
        return text.toLowerCase();
    }

    public String stringToReverse(String text){
        String reverse = new StringBuilder(text).reverse().toString();
        return reverse;
    }
}
