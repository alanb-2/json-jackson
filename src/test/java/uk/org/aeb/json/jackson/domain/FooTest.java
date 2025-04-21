package uk.org.aeb.json.jackson.domain;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FooTest {

  public void whenSerialiseAndDerserialiseUsingJackson_thenCorrect()
    throws IOException {
      Foo foo = new Foo(1, "first");
      ObjectMapper mapper = new ObjectMapper();

      String json = mapper.writeValueAsString(foo);
      Foo result = mapper.readValue(json, Foo.class);
      assertEquals(foo.id(), result.id());
    }  
}
