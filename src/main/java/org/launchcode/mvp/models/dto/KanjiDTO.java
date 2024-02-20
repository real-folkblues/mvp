package org.launchcode.mvp.models.dto;


public class KanjiDTO {

    private Integer kanji_id;
    private String kanji;

    // Constructor
    public KanjiDTO(String kanji) {
        this.kanji = kanji;
    }

    // Getters and Setters
    public Integer getKanji_id() {
        return kanji_id;
    }

    public Integer setKanji_id(Integer kanji_id) {
        return kanji_id;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }
}
