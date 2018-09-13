package com.noofinc.dsm.webapi.client.core;

import com.noofinc.dsm.webapi.client.core.authentication.AuthenticationHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

public class AuthenticatedDsmWebapiClient extends DsmWebapiClientImpl {

    @Autowired
    private AuthenticationHolder authenticationHolder;

    @Override
    public void customizeUri(UriComponentsBuilder uriComponentsBuilder) {
        uriComponentsBuilder.queryParam("_sid", authenticationHolder.getLoginInformation().getSid());
    }
}
