import org.junit.Assert;
import org.junit.Test;

public class MyStringUtilsTests {

    @Test
    public void reverseTest(){
        Assert.assertEquals("trevor",MyStringUtils.reverse("rovert"));
        Assert.assertEquals("", MyStringUtils.reverse(" "));
        Assert.assertEquals("", MyStringUtils.reverse(null));
        Assert.assertEquals("gfedcba", MyStringUtils.reverse("abcdefg"));
    }

    @Test
    public void palindromeTest(){
        Assert.assertTrue(MyStringUtils.isPalindrome("racecar"));
        Assert.assertFalse(MyStringUtils.isPalindrome("trevor"));
        Assert.assertTrue(MyStringUtils.isPalindrome("a"));
        Assert.assertTrue(MyStringUtils.isPalindrome(""));
    }

    @Test
    public void vowelTest(){
        Assert.assertEquals(4, MyStringUtils.countOfVowels("aeio"));
        Assert.assertEquals(2,MyStringUtils.countOfVowels("assembly"));
        Assert.assertEquals(0, MyStringUtils.countOfVowels(""));
    }

    @Test
    public void oddContainsTest(){
        Assert.assertTrue(MyStringUtils.oddContains("computer", "cmue"));
        Assert.assertTrue(MyStringUtils.oddContains("computer", "cm"));
        Assert.assertTrue(MyStringUtils.oddContains("computer", "c"));
        Assert.assertFalse(MyStringUtils.oddContains("computer", "ce"));

    }

}
