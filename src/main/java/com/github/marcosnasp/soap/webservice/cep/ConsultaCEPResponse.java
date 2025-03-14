package com.github.marcosnasp.soap.webservice.cep;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ConsultaCEPResponse", namespace = "http://learningdevops7.xyz/cep")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultaCEPResponse {

    @XmlElement(name = "logradouro")
    private String logradouro;

    @XmlElement(name = "bairro")
    private String bairro;

    @XmlElement(name = "cidade")
    private String cidade;

    @XmlElement(name = "estado")
    private String estado;

    public void setEndereco(String logradouro, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}