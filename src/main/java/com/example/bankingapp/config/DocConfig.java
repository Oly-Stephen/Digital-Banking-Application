package com.example.bankingapp.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Bank App API",
                description = "Doing Crud Operations",
                summary = "This APIs will add, delete, create and update",
                termsOfService = "T&C",
                contact = @Contact(
                        name = "Stephen",
                        email = "stephenoluwayanmi@gmail.com"

                ),
                license = @License(
                        name = "Available for all"
                ),
                version = "v1"
        ),
        servers = {
                @Server(
                        description = "Dev",
                        url = "http://localhost:8080"
                )
        }
)
public class DocConfig {
}

