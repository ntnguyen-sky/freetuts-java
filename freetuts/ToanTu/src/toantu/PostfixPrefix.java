package toantu;

public class PostfixPrefix {
    public static void main(String[] args) {
        int firstVariable = 5, secondVariable = 7;
        int result = firstVariable++ + ++secondVariable - 8;
        System.out.println("First variable = " + firstVariable);
        System.out.println("Second variable = " + secondVariable);
        System.out.println("Third variable = " + result);
    }
}
