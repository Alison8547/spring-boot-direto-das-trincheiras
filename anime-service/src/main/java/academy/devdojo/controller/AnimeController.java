package academy.devdojo.controller;

import academy.devdojo.domain.Anime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("v1/animes")
public class AnimeController {

    private static final Logger log = LogManager.getLogger(AnimeController.class);

    @GetMapping
    public List<Anime> getAll() throws InterruptedException {
        log.info(Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(1);
        return Anime.getAnimeList();
    }

    @GetMapping("filter")
    public List<Anime> findByName(@RequestParam(defaultValue = "") String name) {
        var animes = Anime.getAnimeList();

        if (name == null) return animes;

        return Anime.getAnimeList().stream().filter(anime -> anime.getName().equalsIgnoreCase(name)).toList();
    }


    @GetMapping("filter/{id}")
    public Anime findById(@PathVariable Long id) {
        return Anime.getAnimeList().stream().filter(anime -> anime.getId().equals(id)).findFirst()
                .orElse(null);
    }
}
