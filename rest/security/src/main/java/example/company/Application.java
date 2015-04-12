package example.company;

import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"com.vadi","org.hibernate","org.springframework.orm.hibernate3.annotation"})
@EnableAutoConfiguration

public class Application extends SpringBootServletInitializer{

    @Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
    	return builder.sources(Application.class);
	}

	@Override
	protected WebApplicationContext createRootApplicationContext(
			ServletContext servletContext) {

		return super.createRootApplicationContext(servletContext);
	}

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
