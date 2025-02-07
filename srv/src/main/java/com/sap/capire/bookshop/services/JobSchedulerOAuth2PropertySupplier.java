package com.sap.capire.bookshop.services;

import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultOAuth2PropertySupplier;
import com.sap.cloud.sdk.cloudplatform.connectivity.ServiceBindingDestinationOptions;
import java.net.URI;
import java.util.Collections;
import org.jetbrains.annotations.NotNull;

public class JobSchedulerOAuth2PropertySupplier extends DefaultOAuth2PropertySupplier {

  public JobSchedulerOAuth2PropertySupplier(
      @NotNull ServiceBindingDestinationOptions options) {
    super(options, Collections.emptyList());
  }

  @NotNull
  @Override
  public URI getServiceUri() {
    return getCredentialOrThrow(URI.class, "url");
  }
}
