package ControladorT.com.br.ControladordeTarefas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .requestMatchers("/tarefas/**").permitAll() // Permite acesso sem autenticação
                .anyRequest().authenticated() // Requer autenticação para todas as outras URLs
            .and()
            .formLogin() // Ativa o login baseado em formulário
                .loginPage("/login") // Define a URL da página de login
                .permitAll() // Permite acesso à página de login sem autenticação
            .and()
            .csrf().disable(); // Desabilita proteção CSRF (necessário para APIs REST)

        return http.build();
    }
}