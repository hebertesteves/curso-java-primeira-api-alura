package hebertesteves.ScreenmatchFrases.service;

import hebertesteves.ScreenmatchFrases.model.Frase;
import hebertesteves.ScreenmatchFrases.dto.FraseDTO;
import hebertesteves.ScreenmatchFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO obterFraseAleatoria() {
        Integer total = fraseRepository.findAll().size();

        Optional<Frase> frase = fraseRepository.findById(obterIdAleatorio(total));

        return frase.map(this::converteFraseParaFraseDTO).orElse(null);
    }

    private Long obterIdAleatorio(Integer total) {
        Random random = new Random();
        return (long) random.nextInt(total) + 1;
    }

    private FraseDTO converteFraseParaFraseDTO(Frase frase) {
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
