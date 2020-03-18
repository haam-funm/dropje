package com.am.shipment.resources.impl;

import com.am.shipment.api.DataStore;
import com.am.shipment.model.Shipment;
import com.am.shipment.resources.ShipmentResource;


public class ShipmentResourceImpl implements ShipmentResource {

  private DataStore dataStore;

  public ShipmentResourceImpl(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  @Override
  public void createShipment(Shipment shipment) {
    dataStore.storeShipment(shipment);
  }

  @Override
  public void updateShipment(Shipment shipment, String id) {
    shipment.setId(id);
    dataStore.updateShipment(shipment);
  }



}
