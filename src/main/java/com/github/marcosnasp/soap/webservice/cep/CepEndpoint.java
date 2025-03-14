package com.github.marcosnasp.soap.webservice.cep;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CepEndpoint {

    private static final String NAMESPACE_URI = "http://learningdevops7.xyz/cep";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsultaCEPRequest")
    @ResponsePayload
    public ConsultaCEPResponse consultaCep(@RequestPayload ConsultaCEPRequest request) {
        ConsultaCEPResponse response = new ConsultaCEPResponse();

        if ("01001000".equals(request.getCep())) {
            response.setEndereco("Praça da Sé", "Sé", "São Paulo", "SP");
        } else {
            response.setEndereco("Endereço desconhecido", "", "", "");
        }

        return response;
    }
}