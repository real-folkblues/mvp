package org.launchcode.mvp.data;

import org.launchcode.mvp.models.KanjiForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KanjiFormRepository extends CrudRepository<KanjiForm, Integer> {
}
