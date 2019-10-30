package hw6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextAnalyzerTest 
{
	@Test
	void testVowels()
	{
		TextAnalyzer text = new TextAnalyzer();
		assertEquals(text.countVowels("hello how are you?"), 7);
	}
	void testWords()
	{
		TextAnalyzer text = new TextAnalyzer();
		assertEquals(text.countWords("hello how are you?"), 4);
	}

}
