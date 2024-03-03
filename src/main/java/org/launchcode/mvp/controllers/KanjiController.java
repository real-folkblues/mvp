package org.launchcode.mvp.controllers;

import jakarta.servlet.http.HttpSession;
import org.launchcode.mvp.data.KanjiRepository;
import org.launchcode.mvp.models.Kanji;
import org.launchcode.mvp.models.dto.KanjiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin (origins = "http://localhost:8080")
@RestController
public class KanjiController {

    @Autowired
    private KanjiRepository kanjiRepository;

    @PostMapping("/")
    public ResponseEntity<?> saveKanji(@RequestBody KanjiDTO kanjiDTO, Errors errors,
                                       HttpSession session) {
        //error checking
        if (erros.hasErrors()) {
            //returns a bad request

            return ResponseEntity.badRequest().body("Validation errors occurred");
        }


        // Turns KanjiDTO to Kanji entity
        Kanji savedKanji = new Kanji(kanjiDTO.getKanji());
        //saves entity to the database
        kanjiRepository.save(savedKanji);

        //return response entity with applicable status
        return new ResponseEntity<>(kanjiDTO, HttpStatus.OK);
    }

//   @PutMapping("/updateKanji/{id}")
//   public ResponseEntity<?> updateKanji(@PathVariable long id, @RequestBody KanjiDTO kanjiDTO) {
//       // Check if the Kanji exists
//
//     String kanji = kanjiDTO.getKanji();
//       Optional<Kanji> updateKanji = kanjiRepository.findById((int) id);
//
//       if (updateKanji.isPresent()) {
//           updateKanji.get().setKanji(kanjiDTO.getKanji());
//           kanjiRepository.save(updateKanji.get());
//       }
//       return new ResponseEntity<>(kanjiRepository.findByKanji(kanji),HttpStatus.OK);
//   }

}
