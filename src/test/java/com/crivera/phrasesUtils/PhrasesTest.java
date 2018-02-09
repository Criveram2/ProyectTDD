package com.crivera.phrasesUtils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PhrasesTest {

	
    @Test
    public void anEmptyStringIsPolyindrome() {
    	assertTrue(Phrases.polindromo(" "));
    }
    
    @Test
    public void anLetteryStringIsPolyindrome() {
    	assertTrue(Phrases.polindromo("a"));
    }
	
    @Test
    public void abIsNotPolyindrome() {
		assertFalse(Phrases.polindromo("ab"));
    }
    
    @Test
    public void reconocerIsPolyindrome() {
    	assertTrue(Phrases.polindromo("reconocer"));
    }
    
    @Test
    public void stringWithSpacesCanBePolyindrome() {
    	assertTrue(Phrases.polindromo("aroma a mora"));
    }
    
    @Test
    public void stringWithUplaterCanBePolyindrome() {
    	assertTrue(Phrases.polindromo("Aroma A Mora"));
    }
    
    @Test
    public void stringWithSpecialCharactersCanBePolyindrome() {
    	assertTrue(Phrases.polindromo("[!Aroma @ A Mora."));
    }
    
    @Test
    public void stringWithTildeCharactersCanBePolyindrome() {
    	assertTrue(Phrases.polindromo("Oí lo de mamá: me dolió"));
    }
    

}
