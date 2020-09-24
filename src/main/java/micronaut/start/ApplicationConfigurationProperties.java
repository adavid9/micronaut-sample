package micronaut.start;

import io.micronaut.context.annotation.ConfigurationProperties;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author: Dawid Antecki
 * @created: 09/23/2020 18:02
 * @version: 1.0
 */
@ConfigurationProperties(value = "application")
public class ApplicationConfigurationProperties implements ApplicationConfiguration {

    protected final Integer DEFAULT_MAX = 10;

    @NotNull
    private Integer max = DEFAULT_MAX;

    @Override
    public @NotNull Integer getMax() {
        return max;
    }

    public void setMax(@NotNull Integer max) {
        this.max = Objects.requireNonNull(max, "max must not be null");
    }
}
