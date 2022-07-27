package com.bilgeadam.boost.lesson072;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class RegexJunit {

	@Test
	public void givenText_whenSimpleRegexMatches_thenCorrect() {

		Pattern pattern = Pattern.compile("foo");
		Matcher matcher = pattern.matcher("foo");
		
		assertTrue(matcher.find());
	}
	
	@Test
	public void givenText_whenSimpleRegexMatchesTwice_thenCorrect()	{
		
		Pattern pattern = Pattern.compile("foo");
		Matcher matcher = pattern.matcher("foofoo");
		int matches = 0;
		while(matcher.find()) {
			matches++;
		}
		assertEquals(matches,2);
		
	}
	
	public static int runTest(String regex, String text) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		int matches = 0;
		while(matcher.find()) {
			matches++;
		}
		return matches;
		
	}
	
	@Test
	public void givenText_WhenMatchesWithDot_thenCorrect(){
		
		 int matches = runTest(".","foo");
		assertEquals(matches,3);
	}
	
	@Test
	public void givenRepeatedText_whenMatchesOnceWithDot_thenCorrect() {
		
		int matches = runTest("foo.","foofoo");
		assertEquals(1,matches);
		
	}
	
	@Test
	public void givenCharSet_whenMatchesAny_thenCorrect() {
		
		int matches = runTest("[xds]","d");
		
		assertEquals(1,matches);
		
	}
	@Test
	public void givenCharSet_whenMatchesAnyAndAll_thenCorrect() {
		
		int matches = runTest("[xds]","lhouhohooıxşhoıdpiokpokspokp");
		
		assertEquals(3,matches);
	}
	
	@Test
	public void gicenCharSet_whenMatchesAllCombinations_thenCorrect() {
		int matches = runTest("[bcr]at", "bcat brcat rat");
		assertEquals(3,matches);
	}
	
	@Test
	public void givenNotCharSet_whenMacthesNon_thenCorrect() {
		int matches = runTest("[^abc]","g");
		assertEquals(1, matches);
	}
	@Test
	public void givenNotCharSet_whenMatchesAllExceptElements_thenCorrect() {
		int matches = runTest("[^bcr]at", "sat mat asfdfsdfsdbeatdsadasdada");
		assertEquals(3,matches);
	}
	@Test
	public void givenUpperCaseRange_whenMatchesUpperCase_thenCorrect() {
		int matches = runTest("[A-Z]","Two UpperCase alphabets 34 overall");
		assertEquals(3,matches);
	}
	
	@Test
	public void givenLowerCaseRange_whenMacthesLowerCas_thenCorrect() {
		int matches=runTest("[a-z]","Two UpperCase alphabets 34 overall");
		assertEquals(matches,25);
	}
	
	@Test
	public void givenBothLowerAndUpperCaseRange_whenMatchesAllLetters_thenCorrect(){
		
		int matches = runTest("[a-z[A-Z]]","Two UpperCase alphabets 34 overall");
		assertEquals(28, matches);
	}
	
	@Test
	public void givenNumberRange_whenMatchesAccurately_thenCorrect() {
		
		int matches= runTest("[1-5]", "Two UpperCase alphabets 34 overall");
		assertEquals(matches, 2);
	}
	
	@Test
	public void givenNumberRange_whenMatchesAccurately_thenCorrect2() {
		
		int matches = runTest("3[0-5]", "Two UpperCase alphabets 34 overall");
		assertEquals(matches, 1);
	}
	//Union
	@Test
	public void givenTwoSets_whenMatchesUnion_thenCorrect() {
		
		int matches = runTest("[1-3[7-9]]","123456789");
		assertEquals(matches, 6);
	}
	//Intersection
	@Test
	public void givenTwoSets_whenMatchesIntersection_thenCorrect() {
		
		int matches = runTest("[1-6&&[3-9]]", "123456789");
		assertEquals(4, matches);
		
	}
	//Substraction
	@Test
	public void givenSetSubstraction_whenMatchesAccurately_thenCorrect() {
		int matches = runTest("[0-9&&[^2468]]","123456789");
		assertEquals(matches, 5);
	}
	//Digits
	@Test
	public void givenDigits_whenMatches_thenCorrect() {
		int matches = runTest("\\d","1230");
		assertEquals(4,matches);
	}
	//Non-Digits
	@Test
	public void givenNonDigits_whenMatches_thenCorrect() {
		int matches = runTest("\\D","a1230d z,");
		assertEquals(5,matches);
	}
	//Space
	@Test
	public void givenWhiteSpace_whenMatches_thenCorrect() {
		int matches = runTest("\\s","a c");
		assertEquals(1,matches);
	}
	//Non_Space
	@Test
	public void givenNonWhiteSpace_whenMatches_thenCorrect() {
		int matches = runTest("\\S","a c");
		assertEquals(2,matches);
	}
	//Word "\\w"== [a-zA-Z_0-9] 
	@Test
	public void givenWordCharacter_whenMatches_thenCorrect() {
		int matches = runTest("\\w", "hi1!");
		assertEquals(3,matches);
	}
	@Test
	public void givenNonWordCharacter_whenMatches_thenCorrect() {
		int matches = runTest("\\W", "hi1!");
		assertEquals(1,matches);
	}
	@Test
	public void givenWordCharacter_whenMatches_thenCorrect2() {
		int matches = runTest("[a-z_A-Z_0-9]", "hi1!");
		assertEquals(3,matches);
	}
	
	@Test
	public void givenBraceQuantifier_whenMatches_thenCorrect() {
		int matches = runTest("b{3}","bbb");
		assertEquals(matches,1);
	}
	@Test
	public void givenBraceQuantifier_whenFailsToMatch_thenCorrect() {
		int matches = runTest("b{3}","bb");
		assertFalse(matches>0);
	}
	@Test
	public void givenBraceQuantifierWithRange_whenMatches_thenCorrect() {
		int matches = runTest("a{2,3}", "aaaa");
		assertEquals(1, matches);
	}
	@Test
	public void givenBraceQuantifierWithRange_whenMatchesLazily_thenCorrect() {
		int matches = runTest("a{2,3}?", "aaaa");
		assertEquals(2, matches);
	}
	//Capturing Groups
	@Test
	public void givenCapturingGroup_whenMatches_thenCorrect() {
		
		int matches=runTest("(\\d\\d)","12");
		assertEquals(matches,1);
		
	}
	@Test
	public void givenCapturingGroup_whenMatches_thenCorrect2() {
	int matches=runTest("(\\d\\d)","1212");
	assertEquals(matches,2);
	}
	
	// \\1 shows us that search regex repeats 1 time
	@Test
	public void givenCapturingGroup_whenMatchesWithBackReference_thenCorrect(){
		
		int matches = runTest("(\\d\\d)\\1","1212");
		assertEquals(matches,1);
	}
	@Test
	public void givenCapturingGroupAndWrongInput_whenMatchFailsWithBackReference_thenCorrect() {
		int matches = runTest("(\\d\\d)\\1","1213");
		assertFalse(matches>0);
	}
	
	@Test
	public void givenCapturingGroup_whenMatches_thenCorrect3() {
		int matches = runTest("(\\d\\d)(\\d\\d)","1265");
		assertEquals(matches,1);

	}
	@Test
	public void givenCapturingGroup_whenMatchesWithBackReference_thenCorrect2() {
		int matches = runTest("(\\d\\d)\\1\\1\\1", "12121212");
		assertEquals(matches, 1);
	}
	//BOUNDARY MATCHING
	
	//To match only when the required regex is true at the BEGINNING of the text, we use the caret^ .
	@Test
	public void givenText_whenMatchesAtBeginning_thenCorrect() {
		int matches= runTest("^dog","dogs are friendly");
		assertTrue(matches>0);
	}
	@Test
	public void givenText_whenMatchFailsAtBeginning_thenCorrect() {
		int matches= runTest("^dog","are dogs  friendly?");
		assertFalse(matches>0);
	}
	
	@Test
	public void givenText_whenMatchesAtEnd_thenCorrect() {
		int matches = runTest("dog$", "Man's best friend is a dog");
		assertTrue(matches>0);
	}
	
	
	
}
