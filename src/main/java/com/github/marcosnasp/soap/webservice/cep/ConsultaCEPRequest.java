package com.github.marcosnasp.soap.webservice.cep;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ConsultaCEPRequest", namespace = "http://learningdevops7.xyz/cep")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultaCEPRequest {
    
    @XmlElement(name = "cep", required = true)
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}