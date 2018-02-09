package com.crivera.phrasesUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Phrases {

	private Phrases() {
		throw new AssertionError("Esta clase no se deberia instanciar");
	}

	public static boolean polindromo(String string) {
		StringBuilder sb = new StringBuilder(deleteSpacesString
				                    (deleteSpecialCharacterString(
				                    		deleteTildes(string.toLowerCase()))));
		if (sb.toString().equals(Phrases.reverseString(sb.toString()))) {
			return true;
		}
		return false;
	}

	static String reverseString(String string) {
		StringBuilder sb = new StringBuilder(string);
		return sb.reverse().toString();
	}

	static String deleteSpacesString(String string) {
		String stringWithoutSpaces = string.replaceAll(" ", "");
		return stringWithoutSpaces;
	}

	static String deleteSpecialCharacterString(String string) {
		Pattern pat = Pattern.compile("[^A-Za-z0-9]+");
		Matcher mat = pat.matcher(string);
		mat.find();
		return mat.replaceAll(" ");
	}
	
	//mejorar esta funcion
	static String deleteTildes(String string){
		String stringWithoutTildes = string.replaceAll("ó", "o");
		stringWithoutTildes = stringWithoutTildes.replaceAll("á", "a");
		stringWithoutTildes = stringWithoutTildes.replaceAll("é", "e");
		stringWithoutTildes = stringWithoutTildes.replaceAll("í", "i");
		stringWithoutTildes = stringWithoutTildes.replaceAll("ú", "u");
		return stringWithoutTildes;
	}

}
