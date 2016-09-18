package com.main;

import com.exception.ImproperStringException;
import com.util.Constants;

public class Hasher {

	public long hash(String toHash) throws ImproperStringException {
		for(char character:toHash.toCharArray()) {
			if(Constants.KEY_LETTER_STORE.indexOf(character)==-1) {
				throw new ImproperStringException(character+" can't be hashed");
			}
		}
		long hashed = Constants.MIN_DECIPHER_VAL;
		for(int i=0; i<toHash.length(); i++) {
			hashed=(hashed*37 + Constants.KEY_LETTER_STORE.indexOf(toHash.charAt(i)));
		}
		return hashed;
	}
}
