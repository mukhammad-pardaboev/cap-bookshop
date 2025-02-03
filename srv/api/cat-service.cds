using {sap.capire.bookshop as my} from '../../db/schema';
using { API_BUSINESS_PARTNER as bp } from '../external/API_BUSINESS_PARTNER';


@path: '/browse'
service CatalogService {

    @readonly
    entity Books as
        select from my.Books {
            *,
            author.name as author
        }
        excluding {
            createdBy,
            modifiedBy
        };

    @requires: 'authenticated-user'
    action submitOrder(book : Books:ID, quantity : Integer);

    entity BusinessPartner as projection on bp.A_BusinessPartner;
}
