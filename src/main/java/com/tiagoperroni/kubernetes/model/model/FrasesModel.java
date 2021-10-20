package com.tiagoperroni.kubernetes.model.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "frases_model")
public class FrasesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String frase;
    private String autor;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FrasesModel)) {
            return false;
        }
        FrasesModel frasesModel = (FrasesModel) o;
        return Objects.equals(id, frasesModel.id) && Objects.equals(frase, frasesModel.frase)
                && Objects.equals(autor, frasesModel.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, frase, autor);
    }

}
