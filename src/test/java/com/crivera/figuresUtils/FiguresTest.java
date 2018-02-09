package com.crivera.figuresUtils;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class FiguresTest {
	
	
	@Test
	public void squareCero() {
		assertThat(Figures.generateSquare(0), is("empty"));
	}

	@Test
	public void square2x2() {
		assertThat(Figures.generateSquare(2), is("**\n**\n"));
	}
	
	@Test
	public void squareGeneric() {
		assertThat(Figures.generateSquareGeneric(), is("***\n***\n***\n"));
	}
	
	@Test
	public void square4x4() {
		assertThat(Figures.generateSquare(4), is("****\n****\n****\n****\n"));
	}
	
	
	@Test
	public void triangleCero() {
		assertThat(Figures.generateTriangle(0), is("empty"));
	}
	
	@Test
	public void triangleSize2() {
		assertThat(Figures.generateTriangle(2), is(" * \n***\n"));
	}
	
	@Test
	public void triangleSize4() {
		assertThat(Figures.generateTriangle(4), is("   *   \n  ***  \n ***** \n*******\n"));
	}
	
	@Test
	public void triangleGeneric() {
		assertThat(Figures.generateTriangleGeneric(), is("  *  \n *** \n*****\n"));
	}
	
	
	@Test
	public void diamond0() {
		assertThat(Figures.generateDiamond(0), is("empty"));
	}
	
	@Test
	public void generateDiamondSize2(){
		assertThat(Figures.generateDiamond(2), is(" * \n***\n * \n"));
		
	}
	
	@Test
	public void generateDiamondGeneric(){
		assertThat(Figures.generateDiamondGeneric(), is("  *  \n *** \n*****\n *** \n  *  \n"));
	}
	

}
