package hebertesteves.ScreenmatchFrases.service;

import hebertesteves.ScreenmatchFrases.entity.Frases;
import hebertesteves.ScreenmatchFrases.entity.FrasesDTO;
import hebertesteves.ScreenmatchFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class FrasesService {

    @Autowired
    private FraseRepository fraseRepository;

    public FrasesDTO obterFrase() {
        Integer total = fraseRepository.findAll().size();

        Optional<Frases> frase = fraseRepository.findById(obterIdAleatorio(total));

        return frase.map(this::converteFraseParaFrasesDTO).orElse(null);
    }

    private Long obterIdAleatorio(Integer total) {
        Random random = new Random();
        return (long) random.nextInt(total) + 1;
    }

    private FrasesDTO converteFraseParaFrasesDTO(Frases frases) {
        return new FrasesDTO(frases.getTitulo(), frases.getFrase(), frases.getPersonagem(), frases.getPoster());
    }
}
