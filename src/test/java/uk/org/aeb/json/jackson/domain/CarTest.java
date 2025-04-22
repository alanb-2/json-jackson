package uk.org.aeb.json.jackson.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarTest {

  @Test
  public void ObjectToJson() throws JsonProcessingException {

    ObjectMapper objectMapper = new ObjectMapper();
    Car car = new Car("white", "Mazda");
    
    String actual = objectMapper.writeValueAsString(car);
    String expected = "{\"colour\":\"white\",\"type\":\"Mazda\"}";

    assertEquals(actual, expected);

  }

  @Test
  public void JsonToObject() throws JsonProcessingException {

    ObjectMapper objectMapper = new ObjectMapper();
    String json = "{\"colour\":\"white\",\"type\":\"Mazda\"}";

    Car actual = objectMapper.readValue(json, Car.class);
    Car expected = new Car("white", "Mazda");

    assertEquals(actual.getColour(), expected.getColour());
    assertEquals(actual.getType(), expected.getType());

  }

  @Test
  public void JsonToNode() throws JsonProcessingException {

    ObjectMapper objectMapper = new ObjectMapper();
    String json = "{\"colour\":\"white\",\"type\":\"Mazda\"}";

    JsonNode jsonNode = objectMapper.readTree(json);
    String actualColour = jsonNode.get("colour").asText();
    String actualType = jsonNode.get("type").asText();

    assertEquals(actualColour, "white");
    assertEquals(actualType, "Mazda");

  }

}
