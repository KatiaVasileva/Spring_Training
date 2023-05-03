package comments.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"comments.proxy", "comments.repository", "comments.service"})
public class ProjectConfiguration {
}
