package com.sap.capire.bookshop.handlers;

import cds.gen.capbusinesspartnerservice.CapBusinessPartnerService_;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.ServiceName;
import org.springframework.stereotype.Component;

@Component
@ServiceName(CapBusinessPartnerService_.CDS_NAME)
public class BusinessPartnerReadListener implements EventHandler {
  // TODO: uncomment the lines below and insert your API key, if you are using the sandbox service
  // private static final String APIKEY_HEADER = "apikey";
  // private static final String SANDBOX_APIKEY = "";

//  @On(event = CqnService.EVENT_READ, entity = CapBusinessPartner_.CDS_NAME)
//  public void onRead(CdsReadEventContext context) throws ODataException {
//    final Destination destination = DestinationAccessor.getDestination("MyErpSystem");
//
//    final Map<Object, Map<String, Object>> result = new HashMap<>();
//    final List<BusinessPartner> businessPartners =
//        new DefaultBusinessPartnerService()
//            .getAllBusinessPartner()
//            .top(10)
//            // TODO: uncomment the line below, if you are using the sandbox service
//            // .withHeader(APIKEY_HEADER, SANDBOX_APIKEY)
//            .executeRequest(destination);
//
//    final List<CapBusinessPartner> capBusinessPartners =
//        convertS4BusinessPartnersToCapBusinessPartners(businessPartners, "MyErpSystem");
//    capBusinessPartners.forEach(capBusinessPartner -> {
//      result.put(capBusinessPartner.getId(), capBusinessPartner);
//    });
//
//    context.setResult(result.values());
//  }
//
//  @On(event = CdsService.EVENT_CREATE, entity = "cloud.sdk.capng.CapBusinessPartner")
//  public void onCreate(CdsCreateEventContext context) throws ODataException {
//    final Destination destination = DestinationAccessor.getDestination("MyErpSystem");
//
//    Map<String, Object> m = context.getCqn().entries().get(0);
//    BusinessPartner bp =
//        BusinessPartner
//            .builder()
//            .firstName(m.get("firstName").toString())
//            .lastName(m.get("surname").toString())
//            .businessPartner(m.get("ID").toString())
//            .build();
//
//    new DefaultBusinessPartnerService()
//        .createBusinessPartner(bp)
//        // TODO: uncomment the line below, if you are using the sandbox service
//        // .withHeader(APIKEY_HEADER, SANDBOX_APIKEY)
//        .executeRequest(destination);
//  }
//
//  private List<CapBusinessPartner> convertS4BusinessPartnersToCapBusinessPartners(
//      final List<BusinessPartner> s4BusinessPartners,
//      final String destinationName) {
//    final List<CapBusinessPartner> capBusinessPartners = new ArrayList<>();
//
//    for (final BusinessPartner s4BusinessPartner : s4BusinessPartners) {
//      final CapBusinessPartner capBusinessPartner = com.sap.cds.Struct.create(CapBusinessPartner.class);
//
//      capBusinessPartner.setFirstName(s4BusinessPartner.getFirstName());
//      capBusinessPartner.setSurname(s4BusinessPartner.getLastName());
//      capBusinessPartner.setId(s4BusinessPartner.getBusinessPartner());
//      capBusinessPartner.setSourceDestination(destinationName);
//
//      capBusinessPartners.add(capBusinessPartner);
//    }
//
//    return capBusinessPartners;
//  }
}

