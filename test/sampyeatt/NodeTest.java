package sampyeatt;

import org.junit.Test;

import java.net.Inet4Address;

import static org.junit.Assert.*;

/**
 * Created by Sam Pyeatt on 11/24/2017.
 */
public class NodeTest {
    @Test
    public void testisSet(){
        Node n = new Node(0, 0);
        assertFalse(n.isSet());
        n.setValue(3);
        assertTrue(n.isSet());
    }
    @Test
    public void testcantB(){
        Node q = new Node(0,0);
        q.cantB(3);
        q.cantB(9);
        assertEquals(7,q.posval.size());
        q.cantB(4);
        q.cantB(5);
        q.cantB(1);
        q.cantB(2);
        q.cantB(8);
        q.cantB(6);
        assertEquals(q.actval, new Integer(7));
    }
}
