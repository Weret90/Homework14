import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraysCheckerTest {
    private ArrayChecker arrayChecker;

    @BeforeEach
    public void init() {
        arrayChecker = new ArrayChecker();
    }

    @Test
    public void testArrayChecker() {
        Assertions.assertTrue(arrayChecker.arrayChecker(new int[]{1,1,1,1,1,4,4,4,4,4,4,1}));
    }

    @Test
    public void testArrayChecker2() {
        Assertions.assertFalse(arrayChecker.arrayChecker(new int[]{4,4,4,4,4,4}));
    }

    @Test
    public void testArrayChecker3() {
        Assertions.assertFalse(arrayChecker.arrayChecker(new int[]{1,1,1,1}));
    }

    @Test
    public void testArrayChecker4() {
        Assertions.assertFalse(arrayChecker.arrayChecker(new int[]{1,1,1,1,3,4,4,4,4,5}));
    }
}
