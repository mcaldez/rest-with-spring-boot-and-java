package com.br.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	//Media Type por Query Param exemplo: http://localhost:8080/api/person/v1?mediaType=xml
//	@Override
//	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//		configurer.favorParameter(true)
//		.parameterName("mediaType")
//      .ignoreAcceptHeader(true)
//		.useRegisteredExtensionsOnly(false)
//		.defaultContentType(MediaType.APPLICATION_JSON)
//		.mediaType("Json", MediaType.APPLICATION_JSON)
//		.mediaType("xml", MediaType.APPLICATION_XML);
//	}
//	
	//Media Type por header param exemplo: http://localhost:8080/api/person/v1
		@Override
		public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorParameter(false)
        .ignoreAcceptHeader(false)
		.useRegisteredExtensionsOnly(false)
		.defaultContentType(MediaType.APPLICATION_JSON)
		.mediaType("Json", MediaType.APPLICATION_JSON)
		.mediaType("xml", MediaType.APPLICATION_XML);
		}

	
}
