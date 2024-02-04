package Ex_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    private StringUtils novaString;


    @BeforeEach
    public void setup (){
        novaString = new StringUtils();

    }

    // Para testar booleans - assertTrue or assertFalse
    @Test
    public void palindromeTest (){

        assertTrue(novaString.isPalindrome("Ana"));
        assertTrue(novaString.isPalindrome("ovo"));
        assertFalse(novaString.isPalindrome("joao"));
        assertFalse(novaString.isPalindrome("porto"));
    }
}
