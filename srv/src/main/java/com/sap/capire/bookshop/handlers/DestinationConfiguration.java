package com.sap.capire.bookshop.handlers;

import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultDestinationLoader;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultHttpDestination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DestinationConfiguration {

  @Autowired
  private Environment environment;

  @EventListener
  void applicationReady(ApplicationReadyEvent ready) {
    String portString = environment.getProperty("local.server.port");
    System.out.println("Server port: " + portString);
    int port = Integer.parseInt(portString);
    DefaultHttpDestination mockDestination = DefaultHttpDestination
        .builder("http://localhost:" + port)
        .name("s4-business-partner-api-mocked").build();

    DefaultDestinationLoader loader = new DefaultDestinationLoader();
    loader.registerDestination(mockDestination);
    DestinationAccessor.prependDestinationLoader(loader);
  }

}
