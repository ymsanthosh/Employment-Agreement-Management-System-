package com.project.gts.project.configuration;

import org.modelmapper.ModelMapper;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.gts.project.DB;
// import com.project.gts.project.DevDB;
import com.project.gts.project.ProdDB;


@Configuration
public class AppConfig {
    
    @Bean
    public DB getProdDBBean(){
        return new ProdDB();
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
