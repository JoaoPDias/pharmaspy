package com.br.ufjf.pharmaspy;

import com.br.ufjf.pharmaspy.model.Endereco;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ViaCEPClient {
    public Endereco buscaEnderecoPor(String cep){
        RestTemplate template = new RestTemplate();
        return template.getForObject("https://viacep.com.br/ws/{cep}/json",Endereco.class, cep);
    }
}