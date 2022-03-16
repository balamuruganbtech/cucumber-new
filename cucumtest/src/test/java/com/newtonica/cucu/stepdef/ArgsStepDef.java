package com.newtonica.cucu.stepdef;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.newtonica.cucu.entity.Color;
import com.newtonica.cucu.entity.User;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class ArgsStepDef {

	Logger logger = LoggerFactory.getLogger(ArgsStepDef.class);

	@Given("I have data in table with 1 column")
	public void i_have_data_in_table_with_column(List<String> dataTable) {
		logger.info(() -> dataTable.toString());
	}
	
	@Given("I have data in table with 2 column")
	public void i_have_data_in_table_with_2_column(Map<String,String> dataTable) {
		logger.info(() -> dataTable.toString());
	}
	
	@Given("I have data in table with 3 column")
	public void i_have_data_in_table_with_3_column(DataTable dataTable) {
		logger.info(() -> dataTable.toString());
		logger.info(() -> dataTable.column(2).get(1));
	}
	
	@Given("I have data in table with 4 column")
	public void i_have_data_in_table_with_4_column(List<User> users) {
		logger.info(() -> users.toString());
		logger.info(() -> users.get(1).toString());
	}
	
	@Given("^I have 3 (red|green|blue) t-shirts$")
	public void i_have_red_t_shirts(Color color) {
		logger.info(() ->color.toString());
	}

	@Given("I have a json data in doc string")
	public void i_have_a_json_data_in_doc_string(JsonNode docString) {
		logger.info(() ->docString.get("passwd").asText());
	}

}
