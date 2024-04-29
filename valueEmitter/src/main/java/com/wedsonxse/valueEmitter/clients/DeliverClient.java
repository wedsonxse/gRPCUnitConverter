package com.wedsonxse.valueEmitter.clients;

import com.wedsonxse.valueEmitter.domain.TemperatureValue;

import java.net.http.HttpResponse;

public interface DeliverClient {
    HttpResponse sendRequest(TemperatureValue t);
}
