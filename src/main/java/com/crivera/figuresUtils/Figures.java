package com.crivera.figuresUtils;

public final class Figures {
	private Figures() {
		throw new AssertionError("Esta clase no se deberia instanciar");
	}

	public static String generateSquareGeneric() {
		return generateSquare(3);
	}


	 /**
	     * Generate a Square.
	     *
	     * @param  size define the size.
	     * @return  empty if size <= 0 
	     */
	public static String generateSquare(int size) {

		if (size <= 0) {
			return "empty";
		} else {
			StringBuilder square = new StringBuilder();
			for (int rows = 1; rows <= size; rows += 1) {
				square.append(generareLine(size));
				square.append("\n");
			}
			return square.toString();
		}

	}

	public static String generateTriangleGeneric() {
		return generateTriangle(3);
	}

	 /**
     * Generate a Triangle.
     *
     * @param  size define the size.
     * @return  empty if size <= 0 
     */
	public static String generateTriangle(int size) {
		if (size <= 0) {
			return "empty";
		} else {
			StringBuilder triangle = new StringBuilder();
			int sizeLine = 1;
			for (int rows = 1; rows <= size; rows += 1) {
				int spaces = size - rows;
				triangle.append(generareLineBetweenSpaces(sizeLine, spaces));
				triangle.append("\n");
				sizeLine += 2;
			}
			return triangle.toString();
		}
	}

	 /**
     * Generate a Diamond.
     *
     * @param  size define the size.
     * @return empty if size <= 1 
     */
	public static String generateDiamond(int size) {
		if (size <= 1) {
			return "empty";
		} else {
			StringBuilder diamont = new StringBuilder();
			diamont.append(generateTriangle(size)).append(generateTriangleInverse(size - 1));
			return diamont.toString();
		}
	}

	public static String generateDiamondGeneric() {
		return generateDiamond(3);
	}

	private static String generateTriangleInverse(int size) {

		if (size <= 0) {
			return "empty";
		} else {
			StringBuilder triangle = new StringBuilder();
			int sizeLine = (2 * size) - 1;
			for (int rows = size; rows >= 1; rows -= 1) {
				int spaces = size - rows;
				triangle.append(' ');
				triangle.append(generareLineBetweenSpaces(sizeLine, spaces));
				triangle.append(' ');
				triangle.append("\n");
				sizeLine -= 2;
			}
			return triangle.toString();
		}
	}

	private static String generareLine(int size) {
		StringBuilder line = new StringBuilder();
		for (int column = 1; column <= size; column += 1) {
			line.append('*');
		}
		return line.toString();
	}

	private static String generareLineBetweenSpaces(int size, int spacesDeceate) {
		StringBuilder line = new StringBuilder();
		line.append(generateSpaces(spacesDeceate));
		line.append(generareLine(size));
		line.append(generateSpaces(spacesDeceate));
		return line.toString();
	}

	private static String generateSpaces(int size) {
		StringBuilder lineSpaces = new StringBuilder();
		for (int spaces = 1; spaces <= size; spaces += 1) {
			lineSpaces.append(' ');
		}
		return lineSpaces.toString();
	}

}
