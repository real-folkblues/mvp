package org.launchcode.mvp.models;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Kanji {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kanji;
    private Integer grade;
    private String heisigEn;
    private Integer jlpt;
    private Integer strokeCount;
    private String unicode;

    @ElementCollection
    @CollectionTable(name = "kanji_kun_readings") // Table for kun_readings
    @Column(name = "reading")
    private List<String> kunReadings = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "kanji_meanings") // Table for meanings
    @Column(name = "meaning")
    private List<String> meanings = new ArrayList<>();
    // Constructors, getters, and setters


    public Kanji(Long id, String kanji, Integer grade, String heisigEn, Integer jlpt, Integer strokeCount, String unicode, List<String> kunReadings, List<String> meanings) {
        this.id = id;
        this.kanji = kanji;
        this.grade = grade;
        this.heisigEn = heisigEn;
        this.jlpt = jlpt;
        this.strokeCount = strokeCount;
        this.unicode = unicode;
        this.kunReadings = kunReadings;
        this.meanings = meanings;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getHeisigEn() {
        return heisigEn;
    }

    public void setHeisigEn(String heisigEn) {
        this.heisigEn = heisigEn;
    }

    public Integer getJlpt() {
        return jlpt;
    }

    public void setJlpt(Integer jlpt) {
        this.jlpt = jlpt;
    }

    public Integer getStrokeCount() {
        return strokeCount;
    }

    public void setStrokeCount(Integer strokeCount) {
        this.strokeCount = strokeCount;
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

    public List<String> getKunReadings() {
        return kunReadings;
    }

    public void setKunReadings(List<String> kunReadings) {
        this.kunReadings = kunReadings;
    }

    public List<String> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<String> meanings) {
        this.meanings = meanings;
    }
}
