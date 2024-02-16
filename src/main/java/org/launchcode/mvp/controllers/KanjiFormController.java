package org.launchcode.mvp.controllers;

import org.launchcode.mvp.data.KanjiFormRepository;
import org.launchcode.mvp.models.KanjiForm;
import org.launchcode.mvp.models.dto.KanjiDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

import java.util.Optional;

@RestController
public class KanjiFormController {


    private final KanjiFormRepository kanjiFormRepository;

    public KanjiFormController(KanjiFormRepository kanjiFormRepository) {
        this.kanjiFormRepository = kanjiFormRepository;
    }

    @PostMapping("/submitKanjiForm")
    public ResponseEntity<?> processForm(@RequestBody KanjiDTO kanjiDTO, Errors errors, HttpSession session) {
        //error checking
        if (errors.hasErrors()) {
            //returns a bad request
            return ResponseEntity.badRequest().body("Validation errors occurred");
        }


        // Turns KanjiDTO to KanjiForm entity
        KanjiForm kanjiForm = new KanjiForm();
        kanjiForm.setKanji(kanjiDTO.getKanji());


        //saves entity to the database
        kanjiFormRepository.save(kanjiForm);

        //set attributes for session
        session.setAttribute("kanjiFormId", kanjiForm.getId());

        //return response entity with applicable status
        return ResponseEntity.ok().body("Form submitted successfully");
    }

    @PutMapping("/updateKanjiForm/{id}")
    public ResponseEntity<?> updateKanjiEntry(@PathVariable long id, @RequestBody KanjiDTO kanjiDTO) {
        // Check if the KanjiForm exists
        Optional<KanjiForm> kanjiFormOptional = kanjiFormRepository.findById(id);
        if (!kanjiFormOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        // Get the existing KanjiForm and update its fields
        KanjiForm kanjiForm = kanjiFormOptional.get();
        kanjiForm.setKanji(kanjiDTO.getKanji());
        // Update other fields as necessary

        // Save the updated KanjiForm
        kanjiFormRepository.save(kanjiForm);

        // Return a response entity
        return ResponseEntity.ok().body("KanjiForm updated successfully");
    }

}
