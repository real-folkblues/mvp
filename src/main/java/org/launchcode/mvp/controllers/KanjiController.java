package org.launchcode.mvp.controllers;

import org.launchcode.mvp.data.KanjiRepository;
import org.launchcode.mvp.models.Kanji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class KanjiController {

	@Autowired
	private final KanjiRepository kanjiRepository;

	@Autowired
	public KanjiController(KanjiRepository kanjiRepository){
		this.kanjiRepository = kanjiRepository;
	}

	@PostMapping("/api/saveKanji")
	public ResponseEntity<Kanji> saveKanji(@RequestBody Kanji kanjiData) {
		Kanji savedKanji = kanjiRepository.save(kanjiData);
		return ResponseEntity.ok(savedKanji);
	}
}











































































































