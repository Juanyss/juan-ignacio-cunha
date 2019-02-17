package com.bootCamp.topic6.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@EnableSwagger2
@Configuration
public class swaggerConfig {
    @Bean
    public Docket shoppingCartApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bootCamp.topic6"))
                .paths(regex("/API.*"))
                .build()
                .apiInfo(metaInfo());
    }



    private ApiInfo metaInfo() {
        return new ApiInfoBuilder()
                .title("Shopping Cart API")
                .description("Shopping Cart Example")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("")
                .version("1.0")
                .contact(new Contact("Juany", "https://github.com/Juanyss", "Juanyss88@gmail.com"))
                .build();
    }


}


