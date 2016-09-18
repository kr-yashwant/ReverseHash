import static org.junit.Assert.*;

import org.junit.Test;

import com.exception.ImproperHashException;
import com.main.Hasher;
import com.exception.ImproperStringException;
import com.main.Reverser;
import com.util.Constants;

public class ReverserTest {

	@Test
	public void unHashtheHashed() {
		Reverser reverser = new Reverser();
		Hasher hasher = new Hasher();
		try {
			assertEquals("leepadg", reverser.reverseHash(hasher.hash("leepadg")));
		} catch (ImproperHashException e) {
			fail();
		} catch (ImproperStringException e) {
			fail();
		}
	}
	
	@Test
	public void hashTheUnHashed() {
		Reverser reverser = new Reverser();
		Hasher hasher = new Hasher();
		try {
			assertEquals(680131659347L, hasher.hash(reverser.reverseHash(680131659347L)));
		} catch (ImproperHashException e) {
			fail();
		} catch (ImproperStringException e) {
			fail();
		}
	}

	@Test
	public void testEdgesOfReverser() {
	    Reverser reverser = new Reverser();

	    try{
	    	reverser.reverseHash(Constants.MIN_DECIPHER_VAL-1);
	        fail("expected ImproperHashException");
	    } catch(ImproperHashException e){
	        
	    }
	}
	
	public void testEdgesOfHasher() {
		Hasher hasher = new Hasher();
		try {
			hasher.hash("z");
			fail("expected ImproperStringException");
		} catch (ImproperStringException e) {
			
		}
	}
}
