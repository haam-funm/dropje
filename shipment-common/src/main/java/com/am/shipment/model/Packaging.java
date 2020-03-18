package com.am.shipment.model;

public enum Packaging {
  AUTOMATIC("Automatic"), MANUAL("Manual");

  private String value;

  Packaging(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
