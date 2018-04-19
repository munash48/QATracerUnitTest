package com.QATracer.nasser.eclipse.views;

import org.eclipse.swt.graphics.Point;
import org.junit.*;

import com.qatracer.nasser.eclipse.views.ComponetMatrix;

import static org.junit.Assert.*;

/**
 * The class <code>ComponetMatrixTest</code> contains tests for the class <code>{@link ComponetMatrix}</code>.
 *
 * @generatedBy CodePro at 4/19/18 9:04 PM
 * @author KYAMBOGO
 * @version $Revision: 1.0 $
 */
public class ComponetMatrixTest {
	/**
	 * Run the ComponetMatrix() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	@Test
	public void testComponetMatrix_1()
		throws Exception {
		ComponetMatrix result = new ComponetMatrix();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Point computeSize(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	@Test
	public void testComputeSize_1()
		throws Exception {
		ComponetMatrix fixture = ComponetMatrixFactory.createComponetMatrix();
		int w = 1;
		int h = 1;
		boolean changed = true;

		Point result = fixture.computeSize(w, h, changed);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Point {1, 1}", result.toString());
	}

	/**
	 * Run the Point computeSize(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	@Test
	public void testComputeSize_2()
		throws Exception {
		ComponetMatrix fixture = ComponetMatrixFactory.createComponetMatrix();
		int w = 1;
		int h = -1;
		boolean changed = true;

		Point result = fixture.computeSize(w, h, changed);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Point {1, 1}", result.toString());
	}

	/**
	 * Run the Point computeSize(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	@Test
	public void testComputeSize_3()
		throws Exception {
		ComponetMatrix fixture = ComponetMatrixFactory.createComponetMatrix();
		int w = -1;
		int h = 1;
		boolean changed = true;

		Point result = fixture.computeSize(w, h, changed);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Point {1, 1}", result.toString());
	}

	/**
	 * Run the int getOffset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	@Test
	public void testGetOffset_1()
		throws Exception {
		ComponetMatrix fixture = ComponetMatrixFactory.createComponetMatrix();

		int result = fixture.getOffset();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setOffset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	@Test
	public void testSetOffset_1()
		throws Exception {
		ComponetMatrix fixture = ComponetMatrixFactory.createComponetMatrix();
		int offset = 1;

		fixture.setOffset(offset);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/19/18 9:04 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ComponetMatrixTest.class);
	}
}