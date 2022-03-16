package com.newtonica.cucu.config;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.newtonica.cucu.entity.Color;
import com.newtonica.cucu.entity.User;

import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;

public class CustomParameterTypes {

	private static ObjectMapper objMapper = new ObjectMapper();

	@DataTableType
	public User userEntry(Map<String, String> entry) {
		return new User(entry.get("UserId"), entry.get("Name"), entry.get("Mobile"), entry.get("Country"));
	}

	/*
	 * @DataTableType public User userEntry(Map<String, List<String>> entry) {
	 * return new User(entry.get("UserId"), entry.get("Name"), entry.get("Mobile"),
	 * entry.get("Country")); }
	 */

	@ParameterType("red|green|blue")
	public Color userEntry(String color) {
		return new Color(color);
	}

	@DocStringType
	public JsonNode json(String docString) throws JsonMappingException, JsonProcessingException {
		return objMapper.readValue(docString, JsonNode.class);
	}

}
