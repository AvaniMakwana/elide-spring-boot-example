package example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import javax.validation.constraints.NotBlank;


/**
 * Configuration settings for Elide.
 */
@Data
@ConfigurationProperties(prefix = "elide")
@ComponentScan
public class ElideConfigProperties {

    /**
     * Settings for the JSON-API controller.
     */
    private ControllerProperties jsonApi;

    /**
     * Settings for the GraphQL controller.
     */
    private ControllerProperties graphql;

    /**
     * Settings for the Swagger document controller.
     */
    private SwaggerControllerProperties swagger;

    /**
     * Root package name of the Elide data models.
     */
    @NotBlank
    private String modelPackage;

    /**
     * Default pagination size for collections if the client doesn't paginate.
     */
    private int pageSize = 500;

    /**
     * The maximum pagination size a client can request.
     */
    private int maxPageSize = 10000;
}
