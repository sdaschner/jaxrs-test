package com.sebastian_daschner.jaxrs_test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@ApplicationScoped
public class TestClient {

    private Client client;
    private WebTarget target;

    @PostConstruct
    private void initClient() {
        client = ClientBuilder.newClient();
        target = client.target("http://localhost:9080/foobar");
    }

    @PreDestroy
    private void closeClient() {
        client.close();
    }

    public void invokeRequest() {
        try {
            target.request().get();
        } catch (Exception e) {
            // doesn't matter if it fails
        }
    }
}
