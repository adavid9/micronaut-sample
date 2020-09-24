package micronaut.start.repository;

import micronaut.start.domain.Genre;
import micronaut.start.pojo.SortingAndOrderArguments;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

/**
 * @author: Dawid Antecki
 * @created: 09/23/2020 18:06
 * @version: 1.0
 */
public interface GenreRepository {

    Optional<Genre> findById(@NotNull Long id);

    Genre save(@NotBlank String name);

    Genre saveWithException(@NotBlank String name);

    void deleteById(@NotNull Long id);

    List<Genre> findAll(@NotNull SortingAndOrderArguments args);

    int update(@NotNull Long id, @NotBlank String name);
}
