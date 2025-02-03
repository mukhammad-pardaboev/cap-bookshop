package com.sap.capire.bookshop;

import cds.gen.api_business_partner.ApiBusinessPartner_;
import cds.gen.catalogservice.BusinessPartner_;
import cds.gen.catalogservice.CatalogService_;
import com.sap.cds.Result;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ServiceName(CatalogService_.CDS_NAME)
public class RiskServiceHandler implements EventHandler {
  @Autowired
  @Qualifier(ApiBusinessPartner_.CDS_NAME)
  CqnService bupa;

  @On(entity = BusinessPartner_.CDS_NAME)
  Result readSuppliers(CdsReadEventContext context) {
    return bupa.run(context.getCqn());
  }
}
