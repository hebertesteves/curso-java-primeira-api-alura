package hebertesteves.ScreenmatchFrases.service;

import hebertesteves.ScreenmatchFrases.dto.FraseDTO;
import hebertesteves.ScreenmatchFrases.model.Frase;
import hebertesteves.ScreenmatchFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = fraseRepository.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
