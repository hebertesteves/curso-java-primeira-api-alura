package hebertesteves.ScreenmatchFrases.controller;

import hebertesteves.ScreenmatchFrases.entity.FrasesDTO;
import hebertesteves.ScreenmatchFrases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private FrasesService frasesService;

    @GetMapping("/frases")
    public FrasesDTO obterFrase() {
        return frasesService.obterFrase();
    }
}
