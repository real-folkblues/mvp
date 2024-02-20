package org.launchcode.mvp.models;

import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;


@Entity
@Table(name = "kanji_table")
public class Kanji {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kanji_id;

    @Column(nullable = false)
    private String kanji;
//    private String vocab;
//    private String particles;


    public Kanji() {
    }

    public Kanji(String kanji){
        this.kanji = kanji;
//    this.vocab = vocab;
//    this.particles = vocab;
    }

    public Integer getKanji_id() {
        return kanji_id;
    }

    public void setKanji_id(Integer kanji_id) {
        this.kanji_id = kanji_id;
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
