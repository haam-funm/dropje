package com.am.shipment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

  @JsonProperty("streetName")
  private String streetName;

  @JsonProperty("postCode")
  private String postCode;

  @JsonProperty("country")
  private String country;

}
