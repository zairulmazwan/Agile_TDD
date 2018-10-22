package uk.ac.aber.books.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.ac.aber.books.Book;

public class BookTest {

	@Test
	public void shouldGetTitle() {
		Book book = new Book("Test-Driven Development"); 
	    assertEquals("Test-Driven Development", book.getTitle());
	}

}
