package com.QATracer.nasser.eclipse.views;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 4/19/18 9:07 PM
 * @author KYAMBOGO
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	RequireMatrixTest.class,
	ComponetMatrixTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/19/18 9:07 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
