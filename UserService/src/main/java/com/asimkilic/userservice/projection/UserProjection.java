package com.asimkilic.userservice.projection;

import com.asimkilic.commonservice.model.CardDetails;
import com.asimkilic.commonservice.model.User;
import com.asimkilic.commonservice.queries.GetUserPaymentDetailsQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

@Component
public class UserProjection {

    @QueryHandler
    public User getUserPaymentDetails(GetUserPaymentDetailsQuery query) {

        //Ideally Get the details from the Database
        CardDetails cardDetails = CardDetails.builder()
                .name("Asım KILIÇ")
                .validUntilMonth(01)
                .validUntilYear(2022)
                .cardNumber("1234567890")
                .cvv(111)
                .build();

        return User.builder()
                .userId(query.getUserId())
                .firstName("Asım")
                .lastName("KILIÇ")
                .cardDetails(cardDetails)
                .build();
    }
}
