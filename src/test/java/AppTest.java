import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 05.07.2015.
 */
public class AppTest {
    String[] array = {"12ram8u", "2papa", "01mila", "12po1moga1l", "99mama1"};
    String[] expect = {"99mama1", "01mila", "2papa", "12po1moga1l", "12ram8u"};
    @Test
    public void testSuperSort(){
        assertEquals(App.superSort(array), expect);
    }
    @Test
    public void testCompareStrings(){
        assertTrue(App.compareStrings("71mete2or", "09kokoko"));
    }

    @Test
    public void testIsInteger(){
        assertFalse(App.isInteger("qwe"));
    }

    @Test
    public void testIsInteger1(){
        assertTrue(App.isInteger("583"));
    }

    @Test
    public void testStringWithoutNum(){
        assertEquals(App.stringWithoutNum("1J0o9k72e"), "Joke");
    }

}