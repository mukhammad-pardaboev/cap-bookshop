using my.bookshop as my from '../../db/datamodel';

service CapBusinessPartnerService {
     entity CapBusinessPartner as projection on my.CapBusinessPartner;
}
