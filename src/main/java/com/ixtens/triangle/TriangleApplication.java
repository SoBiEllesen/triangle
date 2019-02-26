package com.ixtens.triangle;

import com.google.common.base.Predicates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class TriangleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TriangleApplication.class, args);
    }

    @Bean
    public Docket api() {
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder.name("Accept-Language")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .defaultValue("en-US")
                .required(true)
                .build();
        List<Parameter> aParameters = new ArrayList<>();
        aParameters.add(aParameterBuilder.build());
        aParameterBuilder.name("X-Tradeshift-ActorId")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .defaultValue("37617bf8-4e04-41f2-bd27-9ad9153419ee")
                .required(true)
                .build();
        aParameters.add(aParameterBuilder.build());
        aParameterBuilder.name("X-Tradeshift-TenantId")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .defaultValue("210dc7b0-1cbd-4320-a044-5061318c12d4")
                .required(true)
                .build();
        aParameters.add(aParameterBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .build()
                .globalOperationParameters(aParameters);
    }

}
