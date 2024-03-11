package org.launchcode.mvp.controllers;

import org.launchcode.mvp.data.KanjiRepository;
import org.launchcode.mvp.models.Kanji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class KanjiController {

	@Autowired
	private KanjiRepository kanjiRepository;

	@PostMapping("/api/saveKanji")
	public ResponseEntity<Kanji> saveKanji(@RequestBody Kanji kanjiData) {
		Kanji savedKanji = kanjiRepository.save(kanjiData);
		return ResponseEntity.ok(savedKanji);
	}
}

//	@PutMapping("/updateKanji/{id}")
//	public ResponseEntity<?> updateKanji(@PathVariable long id, @RequestBody KanjiDTO kanjiDTO) {
//		// Check if the KanjiForm exists
//		Optional<Kanji> kanjiOptional = (Optional <Kanji>) kanjiRepository.findById(id);
//		if (!kanjiFormOptional.isPresent()) {
//			return ResponseEntity.notFound().build();
//		}
//
//		// Get the existing Kanji and update its fields
//		Kanji updatedkanji = (Kanji) kanjiOptional.get();
//
//		// Update other fields as necessary
//
//		// Save the updated KanjiForm
//		Kanji kanjiData = new Kanji();
//		kanjiRepository.save(kanjiData);
//
//		// Return a response entity
//		return ResponseEntity.ok().body("KanjiForm updated successfully");
//	}


//	@DeleteMapping("/deleteKanji/{id}")
//	public ResponseEntity<?> deleteKanjiForm(@PathVariable long id) {
//		// Check if the KanjiForm to delete exists
//		Optional <Kanji> kanjiFormOptional = (Optional <Kanji>) kanjiRepository.findById(id);
//		if (!kanjiFormOptional.isPresent()) {
//			return ResponseEntity.notFound().build();
//		}
//
//		// Delete the KanjiForm
//		kanjiRepository.delete((Kanji) kanjiFormOptional.get());
//
//		// Return a response entity
//		return ResponseEntity.ok().body("KanjiForm deleted successfully");
//	}










































































































