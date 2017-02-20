package com.fi.ls.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.fi.ls.context.PersistenceApplicationContext;
import org.modelmapper.ModelMapper;



@Configuration
@Import(PersistenceApplicationContext.class)
@ComponentScan(basePackages = { "com.fi.ls.security", "com.fi.ls.mapping", "com.iqmsoft.mm.service", "com.iqmsoft.mm.facade" })
public class BeanMappingConfiguration {
        
        @Bean
        public ModelMapper modelMapper() {
            ModelMapper mapper = new ModelMapper();
            return mapper;
        }
}
