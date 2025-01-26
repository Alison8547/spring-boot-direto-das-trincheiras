package academy.devdojo.domain;

import java.util.List;


public class Anime {
    private Long id;
    private String name;

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Anime> getAnimeList() {
        return List.of(new Anime(1L, "Naruto"), new Anime(2L, "Jujutsu"), new Anime(3L, "DeathNote"));
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
