package com.am.shipment.model;

public enum ShipmentType {
  B2B("B2B");

  private String value;

  ShipmentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
