/* Create a regular expression that accepts alphanumeric characters only.
Its length must be six characters long only.
 */


package regex;
import java.util.regex.*;
public class example6
{
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","2haRAD"));  // true
        System.out.println(Pattern.matches("[0-9]{10}","9876543211"));  //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","kkvarun32"));  // false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2Uk2"));  // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$2"));  // false ($ is not matched)
    }
}
