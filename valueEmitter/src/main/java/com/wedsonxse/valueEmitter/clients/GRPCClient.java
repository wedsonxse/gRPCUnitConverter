package com.wedsonxse.valueEmitter.clients;

import com.wedsonxse.valueEmitter.domain.TemperatureValue;

import java.net.http.HttpResponse;

public class GRPCClient implements DeliverClient{
    @Override
    public HttpResponse sendRequest(TemperatureValue t) {
        return null;
    }
}
