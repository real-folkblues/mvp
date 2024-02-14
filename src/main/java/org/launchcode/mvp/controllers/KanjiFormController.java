package org.launchcode.mvp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.servlet.http.HttpSession;
import org.launchcode.mvp.data.KanjiFormRepository;
import org.launchcode.mvp.models.KanjiForm;
import org.launchcode.mvp.models.dto.KanjiDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping
@RestController
public class KanjiFormController {

    // mySQL database
     private KanjiFormRepository kanjiFormRepository;

     @Autowired
     private JpaRepository jpaRepository;

    public KanjiFormController(KanjiFormRepository kanjiFormRepository) {
        this.kanjiFormRepository = kanjiFormRepository;
    }

    @PostMapping("/app/client")
    public ResponseEntity<?> submitForm(@RequestBody KanjiDTO kanjiDTO, Errors errors, HttpSession session) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body("Validation errors occurred");
        }


        // Converting from DTO to entity
        KanjiForm kanjiForm = new KanjiForm();
        kanjiForm.setKanji(kanjiDTO.getKanji());


        // Saved KanjiForm entity to the database
        kanjiFormRepository.save(kanjiForm);

        //session attributes
        session.setAttribute("kanjiFormId", kanjiForm.getId());

        // return status message
        return ResponseEntity.ok().body("Form submitted successfully");
    }
//
//    @PutMapping("/updateKanjiForm/{id}")
//    public ResponseEntity<?> updateKanjiForm(@PathVariable long id, @RequestBody KanjiDTO kanjiDTO) {
//
//        Optional<KanjiForm> kanjiFormOptional = kanjiFormRepository.findById(id);
//        if (!kanjiFormOptional.isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//
//
//        KanjiForm kanjiForm = kanjiFormOptional.get();
//        kanjiForm.setKanji(kanjiDTO.getKanji());
//
//
//
//        kanjiFormRepository.save(kanjiForm);
//
//
//        return ResponseEntity.ok().body("KanjiForm updated successfully");
//    }
//
//    @DeleteMapping("/deleteKanjiForm/{id}")
//    public ResponseEntity<?> deleteKanjiForm(@PathVariable long id) {
//
//        Optional<KanjiForm> kanjiFormOptional = kanjiFormRepository.findById(id);
//        if (!kanjiFormOptional.isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        // this is where it actually deletes it in the database
//        kanjiFormRepository.delete(kanjiFormOptional.get());
//
//        // return status message
//        return ResponseEntity.ok().body("KanjiForm deleted successfully");
//    }

}

