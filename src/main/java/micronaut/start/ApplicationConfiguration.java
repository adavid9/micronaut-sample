package micronaut.start;

import javax.validation.constraints.NotNull;

/**
 * @author: Dawid Antecki
 * @created: 09/23/2020 18:02
 * @version: 1.0
 */
public interface ApplicationConfiguration {
    @NotNull Integer getMax();
}
