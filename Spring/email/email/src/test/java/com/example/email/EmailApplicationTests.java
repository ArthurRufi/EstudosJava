package com.example.email;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.email.model.EmailDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class EmailControllerTest {

	@Autowired
	private MockMvc mockMvc;

	ObjectMapper mapper = new ObjectMapper();

	@Test
	public void deveriaRetornarOEmailEnviado() throws Exception {
		EmailDetails details = new EmailDetails(
				"email@email.com",
				"Simple Email Message",
				"Hey! \n\nThis is a Simple Email with attachment\n\nThanks",
				"C:/caminho-da-imagem/nome.png"
		);

		URI uri = new URI("/sendMailWithAttachment");

		MvcResult mvcResult = mockMvc
				.perform(MockMvcRequestBuilders
						.post(uri)
						.content(mapper.writeValueAsString(details))
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers
						.status()
						.is(200)).andReturn();

		String expectedResponseBody = "Mail Sent Successfully...";
		String actualResponseBody = mvcResult.getResponse().getContentAsString();
		System.out.println(actualResponseBody);
		Assertions.assertEquals(expectedResponseBody, actualResponseBody);
	}
}
