import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestArray {

    @Test
    public void test1arrayAfter4(){
        int[] in = new int[]{1,2,3,4,5,6,7};
        int[] out = new int[]{5,6,7};
        assertArrayEquals(out, Main.arrayAfter4(in));
    }

    @Test
    public void test2arrayAfter4(){
        int[] in = new int[]{1,2,3,4};
        int[] out = new int[]{};
        assertArrayEquals(out, Main.arrayAfter4(in));
    }

    @Test
    public void test3arrayAfter4(){
        int[] in = new int[]{1,7,3,8,1,6};
        assertThrows(RuntimeException.class, ()->{
            Main.arrayAfter4(in);
        });
    }

    @Test
    public void test1arrayContainsOnly1and4(){
        int[] in  = new int[]{1,2,3,4};
        assertFalse(Main.arrayContainsOnly1and4(in));
    }

    @Test
    public void test2arrayContainsOnly1and4(){
        int[] in  = new int[]{1,1,1,4};
        assertTrue(Main.arrayContainsOnly1and4(in));
    }

    @Test
    public void test3arrayContainsOnly1and4(){
        int[] in  = new int[]{4,4};
        assertFalse(Main.arrayContainsOnly1and4(in));
    }
}
