package com.br.ufjf.pharmaspy;

import com.br.ufjf.pharmaspy.model.Endereco;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ViaCEPClient {
    public Endereco buscaEnderecoPor(String cep){
        RestTemplate template = new RestTemplate();
        StringBuilder sb = new StringBuilder();
        sb.append("https://viacep.com.br/ws/");
        sb.append(cep);
        sb.append("/json");
        String url = sb.toString();
        return template.getForObject(url,Endereco.class, cep);
    }
}
