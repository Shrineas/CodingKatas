package anagrams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class AnagramsTest {

	@Test
	public void noCharacters() throws Exception {
		List<String> emptyListOfString = new ArrayList<>(Arrays.asList(""));
		assertThat(Anagrams.of(""), equalTo(emptyListOfString));
	}

	@Test
	public void oneCharacter() throws Exception {
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("a"));
		assertThat(Anagrams.of("a"), equalTo(expected));
	}
}
