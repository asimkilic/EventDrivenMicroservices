package com.asimkilic.commonservice.queries;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class GetUserPaymentDetailsQuery  {
    private String userId;

    public GetUserPaymentDetailsQuery() {
    }

    public GetUserPaymentDetailsQuery(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
