package kytungatdong;
 
public class EscapeCharacters {
 
    public static void main(String[] args) {
        System.out.println("Tab: " + "Welcome\tto Freetuts!");
        System.out.println("Backspace: " + "Welcome to\b Freetuts!");
        System.out.println("New line: " + "Welcome\nto Freetuts!"); 
        System.out.println("Welcome to\rFreetuts!"); // /r
        System.out.println("Single quote: " + "Welcome to\'Freetuts!");
        System.out.println("Double quote: " + "Welcome to\''Freetuts!");
        System.out.println("Backslash: " + "Welcome to\\Freetuts!");
    }
 
}