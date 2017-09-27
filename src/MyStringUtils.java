import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class MyStringUtils {
    public static String reverse(String s){
        if(stringChecker(s)){
            return "";
        }
        StringBuilder rString = new StringBuilder("");
        int letterPointer  = 0;
        for(int i = s.length() - 1; i >= 0; i--){
             rString.append(s.charAt(i));
            letterPointer++;
        }
        return rString.toString();
    }

    public static boolean isPalindrome(String s){
        int letPointer = 0;
        if (!s.equals(null)) {
            for (int i = s.length() - 1; i >= s.length() / 2; i--) {
                if (s.charAt(i) != s.charAt(letPointer)) {
                    return false;
                } else {
                    letPointer++;
                }
            }
            return true;
        }
        return false;
    }

    public static int countOfVowels(String s){
        if(stringChecker(s)){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }

    public static boolean oddContains(String main, String subString){
        int subLetterPointer = 0;
        if(stringChecker(main)|| stringChecker(subString)){
            return false;
        }
        for(int i = 0; subLetterPointer < subString.length(); i+=2){
            if(main.charAt(i) != subString.charAt(subLetterPointer)){
                return false;
            }
            subLetterPointer++;
        }
        return true;
    }

    private static boolean stringChecker(String s){
        return StringUtils.isBlank(s);
    }

}
