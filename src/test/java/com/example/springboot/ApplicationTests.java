package com.example.springboot;

import net.bytebuddy.description.type.TypeList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

	private TestRestTemplate testRestTemplate;

	@LocalServerPort
	int randomPort;

	@Autowired
	public ApplicationTests(TestRestTemplate testRestTemplate){
		this.testRestTemplate = testRestTemplate;
	}



}
