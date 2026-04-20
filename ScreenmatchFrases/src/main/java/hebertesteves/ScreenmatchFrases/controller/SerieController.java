package hebertesteves.ScreenmatchFrases.controller;

import hebertesteves.ScreenmatchFrases.dto.FraseDTO;
import hebertesteves.ScreenmatchFrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO obterFrase() {
        return fraseService.obterFrase();
    }
}
