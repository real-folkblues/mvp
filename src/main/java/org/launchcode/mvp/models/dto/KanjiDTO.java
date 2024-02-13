package org.launchcode.mvp.models.dto;

public class KanjiDTO {

    private long id;
    private String kanji;

    public KanjiDTO(long id, String kanji) {
        this.id = id;
        this.kanji = kanji;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }
}
