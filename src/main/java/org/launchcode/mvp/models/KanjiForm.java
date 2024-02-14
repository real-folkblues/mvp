package org.launchcode.mvp.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class KanjiForm extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String kanji;
//    private String vocab;
//    private String particles;


    public KanjiForm() {
    }

    public KanjiForm(Long id,String kanji){
        this.id = id;
        this.kanji = kanji;
//    this.vocab = vocab;
//    this.particles = vocab;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
