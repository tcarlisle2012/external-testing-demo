package com.gfs.gordonnow.externaltestingdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class OktaAuthService {

    private String ssoToken = "SOME_TOKEN_FROM_OKTA";

    @PostConstruct
    public void ssoInit() {
        /// TBD ..... hit Okta auth endpoint with basic auth and user/password to get a session
        // then hit the Okta endpoint to turn that session into a token
        // store token in this class

    }

    public String getToken() {
        return ssoToken;
    }

    private void setToken(String token) {
        ssoToken = token;
    }

}
