package org.launchcode.mvp.controllers;

import org.launchcode.mvp.data.KanjiRepository;
import org.launchcode.mvp.models.Kanji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class KanjiController {


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

//@PutMapping("/updateKanjiForm/{id}")
//public ResponseEntity<?> updateKanjiForm( @PathVariable long id, @RequestBody KanjiDTO kanjiDTO) {
//	// Check if the KanjiForm exists
//	Optional<KanjiForm> kanjiFormOptional = kanjiFormRepository.findById(id);
//	if (!kanjiFormOptional.isPresent()) {
//		return ResponseEntity.notFound().build();
//	}
//
//	// Get the existing KanjiForm and update its fields
//	KanjiForm kanjiForm = kanjiFormOptional.get();
//	kanjiForm.setKanji(kanjiDTO.getKanji());
//	// Update other fields as necessary
//
//	// Save the updated KanjiForm
//	kanjiFormRepository.save(kanjiForm);
//
//	// Return a response entity
//	return ResponseEntity.ok().body("KanjiForm updated successfully");
//}











































































































