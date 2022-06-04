package com.example.springboot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

	private TestRestTemplate testRestTemplate;

	@LocalServerPort
	int randomPort;

	@Autowired
	public ApplicationTests(TestRestTemplate testRestTemplate){
		this.testRestTemplate = testRestTemplate;
	}


	@Test
	void testUserName() throws URISyntaxException {
		String url = "http://localhost:"+ randomPort +"/username";
		URI uri = new URI(url);
		String username = testRestTemplate.getForObject(uri, String.class);
		Assert.assertEquals(username, "Zeynep");
	}


}
