package org.launchcode.mvp.controllers;

import org.launchcode.mvp.data.KanjiRepository;
import org.launchcode.mvp.models.Kanji;
import org.launchcode.mvp.models.dto.KanjiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin
@RestController
public class KanjiController {

    @Autowired
    private final KanjiRepository kanjiRepository;

    public KanjiController(KanjiRepository kanjiRepository) {
        this.kanjiRepository = kanjiRepository;
    }

    @PostMapping("api/saveKanji")
    public ResponseEntity<String> createKanji(@RequestBody KanjiDTO kanjiDTO) {
        //error checking
        if (errors.hasErrors()) {
            //returns a bad request
            return ResponseEntity.badRequest().body("Validation errors occurred");
        }
        // Turns KanjiDTO to Kanji entity
        Kanji kanji;
        kanji = new Kanji();
        kanji.setKanji(kanjiDTO.getKanji());


        //saves entity to the database
        kanjiRepository.save(kanji);

        //set attributes for session
        session.setAttribute("kanjiId", kanji.getKanji());

        //return response entity with applicable status
        return ResponseEntity.ok().body(" submitted successfully");
    }
//
//    @PutMapping("/updateKanji/{id}")
//    public ResponseEntity<?> updateKanjiEntry(@PathVariable long id, @RequestBody KanjiDTO kanjiDTO) {
//        // Check if the Kanji exists
//        Optional<Kanji> kanjiOptional = kanjiRepository.findById((int) id);
//        if (kanjiOptional.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        // Get the existing Kanji and update its fields
//        Kanji kanji = kanjiOptional.get();
//        kanji.setKanji(kanjiDTO.getKanji());
//        // Update other fields as necessary
//
//        // Save the updated Kanji
//        kanjiRepository.save(kanji);
//
//        // Return a response entity
//        return ResponseEntity.ok().body("Kanji updated successfully");
//    }

}
