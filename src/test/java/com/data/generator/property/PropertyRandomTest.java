package com.data.generator.property;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.data.utils.FileUtils;

public class PropertyRandomTest {


  @Test
  public void randomProperty() {

    String namesPath = FileUtils.getResourcePath("data/names.csv");
    PropertyRandom property = new PropertyRandom(namesPath);
    System.out.println(property.getValue());


    assertTrue(true);

  }
}
