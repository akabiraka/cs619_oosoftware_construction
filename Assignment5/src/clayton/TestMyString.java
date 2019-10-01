package clayton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class TestMyString {

    @Test

    public void testPalindrome() {

        String palindrome = "";

        MyString myString = new MyString("bat");

//        Iterator iterator = myString.iterator();

        for (Object o : myString) {

            palindrome = (String) o + palindrome;

        }

        Assertions.assertEquals("tab", palindrome);

    }

    @Test

    public void testRemoveUnsupported() {

        MyString myString = new MyString("bat");

        Iterator iterator = myString.iterator();

        iterator.next();

        Assertions.assertThrows(UnsupportedOperationException.class, () -> {

            iterator.remove();

        });

    }

}
