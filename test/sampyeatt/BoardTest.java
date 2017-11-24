package sampyeatt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Sam Pyeatt on 11/24/2017.
 */
public class BoardTest {
    @Test
    public void testPrintBoard(){
        Board b= new Board();
        b.setVal(0,3,2);
        b.setVal(0,4,6);
        b.setVal(0,6,7);
        b.setVal(0,8,1);

        b.setVal(1,0,6);
        b.setVal(1,1,8);
        b.setVal(1,4,7);
        b.setVal(1,7,9);

        b.setVal(2,0,1);
        b.setVal(2,1,9);
        b.setVal(2,5,4);
        b.setVal(2,6,5);

        b.setVal(3,0,8);
        b.setVal(3,1,2);
        b.setVal(3,3,1);
        b.setVal(3,7,4);

        b.setVal(4,2,4);
        b.setVal(4,3,6);
        b.setVal(4,5,2);
        b.setVal(4,6,9);

        b.setVal(5,1,5);
        b.setVal(5,5,3);
        b.setVal(5,7,2);
        b.setVal(5,8,8);

        b.setVal(6,2,9);
        b.setVal(6,3,3);
        b.setVal(6,7,7);
        b.setVal(6,8,4);

        b.setVal(7,1,4);
        b.setVal(7,4,5);
        b.setVal(7,7,3);
        b.setVal(7,8,6);

        b.setVal(8,0,7);
        b.setVal(8,2,3);
        b.setVal(8,4,1);
        b.setVal(8,5,8);

        assertFalse(b.isComplete());
        b.printB();
        b.solve();
        b.printB();
        assertTrue(b.validate());

    }
}
