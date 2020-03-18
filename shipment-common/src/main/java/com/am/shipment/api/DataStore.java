package com.am.shipment.api;

import com.am.shipment.model.Shipment;

public interface DataStore {

  void storeShipment(Shipment shipment);

  void updateShipment(Shipment shipment);

  Shipment findShipment(String id);

  void deleteShipment(String id);

}
