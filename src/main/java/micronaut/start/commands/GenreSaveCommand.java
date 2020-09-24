package micronaut.start.commands;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;

/**
 * @author: Dawid Antecki
 * @created: 09/23/2020 18:17
 * @version: 1.0
 */
@Introspected // generates Bean Metainformation at compile time.
public class GenreSaveCommand {

    @NotBlank
    private String name;

    public GenreSaveCommand() {

    }

    public GenreSaveCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
