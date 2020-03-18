package com.am.shipment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentLine {
  
  @JsonProperty("product")
  private int productId;
  
  @JsonProperty("qty")
  private int quantity; 

}
