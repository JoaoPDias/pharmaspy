package com.br.ufjf.pharmaspy;

import com.br.ufjf.pharmaspy.model.*;
import com.br.ufjf.pharmaspy.repository.MedicamentoRepository;
import com.br.ufjf.pharmaspy.repository.ReacaoAdversaRepository;
import com.br.ufjf.pharmaspy.repository.ReacaoMedicamentoRepository;
import com.br.ufjf.pharmaspy.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class PharmaspyApplication implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Register resource handler for images
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/")
                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(PharmaspyApplication.class, args);
        UsuarioRepository UsrRep = ctx.getBean(UsuarioRepository.class);
        ReacaoAdversaRepository ReaAdRep = ctx.getBean(ReacaoAdversaRepository.class);
        MedicamentoRepository MedicamentoRepository = ctx.getBean(MedicamentoRepository.class);
        ReacaoMedicamentoRepository ReaMedRep = ctx.getBean(ReacaoMedicamentoRepository.class);
        ArrayList<ReacaoAdversa> reacoes = new ArrayList<>();
        reacoes.add(new ReacaoAdversa("Coceira"));
        reacoes.add(new ReacaoAdversa("Irritação"));
        reacoes.add(new ReacaoAdversa("Ressecamento"));
        reacoes.add(new ReacaoAdversa("Foliculite"));
        reacoes.add(new ReacaoAdversa("Hipertricose"));
        reacoes.add(new ReacaoAdversa("Estrias"));
        Usuario usuario = new Usuario();
        usuario.setNome("Teste").setEmail("teste@gmail.com").setSenha("12345").setTipoUsuario(TipoUsuario.CONSUMIDOR);
        Medicamento medicamento = new Medicamento();
        if (UsrRep.findByEmailIgnoreCase(usuario.getEmail()) == null) {
            UsrRep.save(usuario);
        }
        if (MedicamentoRepository.findById(930l) != null) medicamento = MedicamentoRepository.findById(930l).get();
        for (ReacaoAdversa reacao : reacoes
        ) {
            if (!ReaAdRep.existsByTitulo(reacao.getTitulo())) {
                ReaAdRep.save(reacao);
                ReacaoMedicamento reacaoMedicamento = new ReacaoMedicamento().setMedicamento(medicamento).setReacaoAdversa(reacao).setGrauPossibilidade("Baixa");
                ReaMedRep.save(reacaoMedicamento);
            }
        }

    }

}
