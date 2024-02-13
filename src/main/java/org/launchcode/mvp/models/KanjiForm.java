package org.launchcode.mvp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class KanjiForm extends AbstractEntity{

    @ManyToOne
    @JoinColumn()

    @NotNull
    private String kanji;

//    @NotNull
//    private String vocab;
//
//    @NotNull
//    private String particles;

    public KanjiForm(String kanji){
    this.kanji = kanji;
//    this.vocab = vocab;
//    this.particles = vocab;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

//    public String getVocab() {
//        return vocab;
//    }
//
//    public void setVocab(String vocab) {
//        this.vocab = vocab;
//    }
//
//    public String getParticles() {
//        return particles;
//    }
//
//    public void setParticles(String particles) {
//        this.particles = particles;
//    }
}
