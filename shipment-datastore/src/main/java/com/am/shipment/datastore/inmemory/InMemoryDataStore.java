package com.am.shipment.datastore.inmemory;

import java.util.HashMap;
import java.util.Map;
import com.am.shipment.api.DataStore;
import com.am.shipment.model.Shipment;

public class InMemoryDataStore implements DataStore {

  private static Map<String, Shipment> shipments = new HashMap<String, Shipment>();

  public InMemoryDataStore() {}

  @Override
  public void storeShipment(Shipment shipment) {
    shipments.put(shipment.getId(), shipment);
  }

  @Override
  public void updateShipment(Shipment shipment) {
    shipments.put(shipment.getId(), shipment);
  }

  @Override
  public Shipment findShipment(String id) {
    return shipments.get(id);
  }

  @Override
  public void deleteShipment(String id) {
    shipments.remove(id);
  }

}
