package org.launchcode.mvp.data;


import org.launchcode.mvp.models.Kanji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KanjiRepository extends JpaRepository <Kanji, Long> {
}