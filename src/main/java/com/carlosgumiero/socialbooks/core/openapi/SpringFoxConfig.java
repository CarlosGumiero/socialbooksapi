package com.carlosgumiero.socialbooks.core.openapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig implements WebMvcConfigurer {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.carlosgumiero.socialbooks"))
				.build().apiInfo(apiInfo()).tags(new Tag("Livros", "Gerencia os livros e comentários dos livros."))
				.tags(new Tag("Autores", "Gerencia Autores."));
	}
	
	public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Documentação da API Socialbooks")
            .description("API aberta para todos.")
            .version("1")
            .contact(new Contact("Carlos", "www.linkedin.com/in/carlos-gumiero-011170161", "cali3_mgf@hotmail.com"))
            .build();
    }
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		
	}
}
