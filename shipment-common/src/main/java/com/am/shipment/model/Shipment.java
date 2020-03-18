package com.am.shipment.model;

import java.util.Set;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"shipment", "shipmentLines", "packaging", "deliveryAddress", "type", "edd"})
public class Shipment {

  @JsonProperty("shipment")
  @NotEmpty
  private String id;

  @JsonProperty("shipmentLines")
  private Set<ShipmentLine> shipmentLines;

  @JsonProperty("packaging")
  @NotEmpty
  private Packaging packaging;

  @JsonProperty("deliveryAddress")
  private Address deliveryAddress;

  @JsonProperty("type")
  @NotEmpty
  private ShipmentType shipmentType;

  @JsonProperty("edd")
  private String estimatedDeliveryDate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Set<ShipmentLine> getShipmentLines() {
    return shipmentLines;
  }

  public void setShipmentLines(Set<ShipmentLine> shipmentLines) {
    this.shipmentLines = shipmentLines;
  }

  public Packaging getPackaging() {
    return packaging;
  }

  public void setPackaging(Packaging packaging) {
    this.packaging = packaging;
  }

  public Address getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  public String getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }
}
