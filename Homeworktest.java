
import org.junit.Assert;
import org.junit.Test;

public class Homeworktest {

	@Test
	public void test_power_of_3() {
		Homeworkclone test = new Homeworkclone();
		int[] output = test.PowerofThree(4);
		int[] expectedOutput = { 1, 3, 9, 27 };
		Assert.assertArrayEquals(expectedOutput, output);
	}

	@Test
	public void test_countdigits() {
		Homeworkclone test2 = new Homeworkclone();
		int output = test2.countDigits(100);
		Assert.assertEquals(1, output);
		
	}
	@Test
	public void test_sort() {
		Homeworkclone test3 = new Homeworkclone();
		int[] output = test3.printNumbers(4);
		int[] expectedOutput = { 0, 2, 4, 6 };
		Assert.assertArrayEquals(expectedOutput, output);

	}
	
	@Test
	public void test_swap() {
		Homeworkclone test4 = new Homeworkclone();
		String output = test4.swap("Hello");
	    Assert.assertEquals("Holle", output);
	
	}
	
	@Test
	public void test_lengthofLastWord() {
		Homeworkclone test5 = new Homeworkclone();
		String output = test5.lengthofLastWord("apple is best");
	    Assert.assertEquals("4", output);
	}

	@Test
	public void test_reversewords() {
		Homeworkclone test6 = new Homeworkclone();
		String output = test6.reversewords("i like soccer");
	    Assert.assertEquals("soccer like i", output);
	}
	
	@Test
	public void test_Pascal() {
		Homeworkclone test7 = new Homeworkclone();
		String output = test7.Pascal(5);
	    Assert.assertEquals("111121133114641", output);
	
	}
	
}
