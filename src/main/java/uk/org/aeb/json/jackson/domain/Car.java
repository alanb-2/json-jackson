package uk.org.aeb.json.jackson.domain;

public class Car {

  private String colour;
  private String type;

  public String getColour() {
    return this.colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Car(String colour, String type) {
    this.colour = colour;
    this.type = type;
  }

  public Car() {
    this.colour = "";
    this.type = "";
  }

}