package com.am.shipment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.am.shipment.api.DataStore;
import com.am.shipment.datastore.inmemory.InMemoryDataStore;
import com.am.shipment.resources.impl.ShipmentResourceImpl;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ShipmentApplication extends Application<Configuration>{

  private static final Logger LOGGER = LoggerFactory.getLogger(ShipmentApplication.class);
  
  @Override
  public void initialize(Bootstrap<Configuration> b) {
  }

  @Override
  public void run(Configuration c, Environment e) throws Exception {
      LOGGER.info("Registering REST resources");
      DataStore ds = new InMemoryDataStore();
 
      ShipmentResourceImpl shipmentResource = new ShipmentResourceImpl(ds);
      e.jersey().register(shipmentResource);
 }

  public static void main(String[] args) throws Exception {
      new ShipmentApplication().run(args);
  }

}
