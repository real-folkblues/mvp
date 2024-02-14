package org.launchcode.mvp.models.dto;
import java.util.ArrayList;


public class KanjiDTO {

    private long id; // or Long if you prefer an object
    private String kanji;

    // Constructor
    public KanjiDTO(long id, String kanji) {
        this.id = id;
        this.kanji = kanji;
    }

    // Getters and Setters
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
}
