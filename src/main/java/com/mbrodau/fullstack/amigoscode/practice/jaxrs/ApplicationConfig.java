package com.mbrodau.fullstack.amigoscode.practice.jaxrs;

import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Configuration
@ApplicationPath("/")
public class ApplicationConfig extends Application {
}
