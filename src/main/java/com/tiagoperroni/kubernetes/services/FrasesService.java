package com.tiagoperroni.kubernetes.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//import java.util.UUID;

import com.tiagoperroni.kubernetes.model.model.FrasesModel;
import com.tiagoperroni.kubernetes.repository.FrasesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private FrasesRepository frasesRepository;

    public List<FrasesModel> getAll() {
        return frasesRepository.findAll();
    }

    public FrasesModel create(FrasesModel model) {
        return frasesRepository.save(model);
    }

    public FrasesModel getFrase() {
        Random rand = new Random();
        return listarFrasesRandom().get(rand.nextInt(5));
    }

    public List<FrasesModel> listarFrasesRandom() {
        List<FrasesModel> listaFrases = new ArrayList<>();
        FrasesModel model = new FrasesModel();
        // model.setId(UUID.randomUUID().toString());
        model.setId(1);
        model.setFrase("Não procuro problemas. Os problemas geralmente me encontram.");
        model.setAutor("Juares Xupisco.");

        FrasesModel model2 = new FrasesModel();
        model2.setId(2);
        model2.setFrase("Siga meu conselho, eu não uso mesmo.");
        model2.setAutor("Ordinário Soares.");

        FrasesModel model3 = new FrasesModel();
        model3.setId(3);
        model3.setFrase("O amor pode ser cego, mas o casamento é uma verdadeira revelação.");
        model3.setAutor("Filha da Putano.");

        FrasesModel model4 = new FrasesModel();
        model4.setId(4);
        model4.setFrase("Você nunca pode comprar amor, mas ainda assim terá que pagar por ele.");
        model4.setAutor("Masque Bostano");

        FrasesModel model5 = new FrasesModel();
        model5.setId(5);
        model5.setFrase("Se eu ganhasse o prêmio por preguiça, mandaria alguém buscar para mim.");
        model5.setAutor("Quebrado da Silva.");

        FrasesModel model6 = new FrasesModel();
        model5.setId(6);
        model5.setFrase("Eu realmente preciso de um dia entre sábado e domingo.");
        model5.setAutor("Preguiçaldo Xupisco.");

        listaFrases.addAll(Arrays.asList(model, model2, model3, model4, model5, model6));

        return listaFrases;
    }
}
