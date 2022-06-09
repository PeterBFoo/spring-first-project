package edu.poniperro;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:textos.properties") // El classpath es donde se encuentran los recursos
})
public class PropertiesConfig {
}
