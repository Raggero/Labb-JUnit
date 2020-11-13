package se.iths;

public class TextProcessor {

    public String stringToUpperCase(String text){
        System.out.println(text.toUpperCase());
        return text.toUpperCase();
    }

    public String stringToLowerCase(String text){
        System.out.println(text.toLowerCase());
        return text.toLowerCase();
    }

    public String stringToReverse(String text){
        String reverse = new StringBuilder(text).reverse().toString();
        System.out.println(reverse);
        return reverse;
    }
}
