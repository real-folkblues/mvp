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
    private Integer jlpt;
    private Integer stroke_count;
    private String unicode;

    @ElementCollection
    @CollectionTable(name = "kanji_kun_readings") // Table for kun_readings
    @Column(name = "reading")
    private List<String> kunReadings = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "kanji_meanings") // Table for meanings
    @Column(name = "meaning")
    private List<String> meanings = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "kanji_on_readings") // Table for kun_readings
    @Column(name = "reading")
    private List<String> onReadings = new ArrayList<>();
    // Constructors, getters, and setters

    public Kanji() {

    }

    public Kanji(String kanji, Integer grade, Integer jlpt, Integer stroke_count, String unicode,
                 List<String> kunReadings, List<String> meanings) {
        this.kanji = kanji;
        this.grade = grade;
        this.jlpt = jlpt;
        this.stroke_count = stroke_count;
        this.unicode = unicode;
        this.onReadings = new ArrayList<>(onReadings);
        this.kunReadings = new ArrayList<>(kunReadings);
        this.meanings = new ArrayList<>(meanings);
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

    public Integer getJlpt() {
        return jlpt;
    }

    public void setJlpt(Integer jlpt) {
        this.jlpt = jlpt;
    }

    public Integer getStroke_count() {
        return stroke_count;
    }

    public void setStroke_count(Integer stroke_count) {
        this.stroke_count = stroke_count;
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

    public List<String> getOnReadings() {
        return onReadings;
    }

    public void setOnReadings(List<String> onReadings) {
        this.onReadings = onReadings;
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
