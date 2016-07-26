package tests;

/**
 * Created by Andrew on 26/07/2016.
 */
public class TestToCharacters {
    public static void main(String[] args){
        System.out.println('a' + 2);
        System.out.println(Character.toChars('a' + 2));
        System.out.println(Character.toString(Character.toChars('a' + 2)[0]) + "4");
    }
}
