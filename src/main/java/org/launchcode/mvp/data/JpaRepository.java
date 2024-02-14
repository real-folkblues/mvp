package org.launchcode.mvp.data;

import org.launchcode.mvp.models.KanjiForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface KanjiFormRepository extends JpaRepository<KanjiForm, Integer> {

    KanjiForm findByKanjiForm(String kanji);

}