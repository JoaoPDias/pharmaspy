package com.br.ufjf.pharmaspy;

import com.br.ufjf.pharmaspy.model.TipoUsuario;
import com.br.ufjf.pharmaspy.model.Usuario;
import com.br.ufjf.pharmaspy.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
        Usuario usuario = new Usuario();
        usuario.setNome("Teste").setEmail("teste@gmail.com").setSenha("12345").setTipoUsuario(TipoUsuario.CONSUMIDOR);
        if (UsrRep.findByEmailIgnoreCase(usuario.getEmail()) == null) {
            UsrRep.save(usuario);
        }


    }

}
