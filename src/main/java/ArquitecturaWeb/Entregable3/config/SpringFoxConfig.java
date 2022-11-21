package ArquitecturaWeb.Entregable3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Info;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
class SpringFoxConfig {
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API Arquitecturas Web 2022")
            .version("1.0.0")
            .description("Esta es una API que tiene como objetivo poder brindar informacion de las carreras, estudiantes y inscripciones de la facultad, ademas de poder agregar informacion de las mismas.")
            .contact(new Contact("Developers", "exa.unicen.edu.ar", "ezzefernandezzz@gmail.com"))
            .build();
    }
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            /* .apis(RequestHandlerSelectors.any()) */
            .apis(RequestHandlerSelectors.basePackage("ArquitecturaWeb.Entregable3.controller"))
            /* .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)) */
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
	}
    
}