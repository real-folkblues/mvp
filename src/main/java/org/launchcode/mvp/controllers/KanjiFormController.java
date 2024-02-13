package org.launchcode.mvp.controllers;

import jakarta.servlet.http.HttpSession;
import org.launchcode.mvp.data.KanjiFormRepository;


import org.launchcode.mvp.models.KanjiForm;
import org.launchcode.mvp.models.dto.KanjiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

//There may be changes to name of variables, classes, methods, etc. as we further harmonize the project
@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("app/client")
public class KanjiFormController {

    @Autowired
    private KanjiFormRepository kanjiFormRepository;






    @PostMapping("/")
    public ResponseEntity<?> processForm(@RequestBody KanjiDTO kanjiDTO, Errors errors, HttpSession session,
                                         KanjiForm kanjiForm) {
        kanjiForm = new KanjiForm(KanjiDTO.getKanji());

        //looking up kanji in the db
        kanjiForm = new kanjiFormRepository(KanjiDTO.getKanji(), KanjiDTO.getKanji());

        System.out.println(kanjiDTO.getKanjiForm);

        if (!kanjiForm.isMatchingKanji()) {
            errors.rejectValue(
                    "kanji",
                    "invalid",
                    "Try again."
            );
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        //otherwise, set user in session
        session.setAttribute("user", kanjiForm);

        System.out.println(session.getId());


        HttpHeaders headers = new HttpHeaders();
        headers.add("Kanji-ID", kanjiForm.getKanji());


        return new ResponseEntity<>(kanjiForm, HttpStatus.OK);
    }

    }

//    @GetMapping("/getKanjiForm")
//    public ResponseEntity<?> getKanjiFormObjects() {
//
//    }

    @CrossOrigin
    @DeleteMapping("/removeKanjiForm/{id}")
    public ResponseEntity<?> removekanjiForm(@PathVariable int id){
        Optional<kanjiForm> removekanjiForm = kanjiFormRepository.findById(id);

        if(removeKanjiForm.isPresent()){
            System.out.println("kanjiForm is present");
            KanjiFormRepository.delete(removekanjiForm.get());
        }
        return new ResponseEntity<>(KanjiFormRepository.findAll(), HttpStatus.OK);
    }

    @PutMapping("/updateKanjiForm/{id}")
    public ResponseEntity<?> updateKanjiForm(@PathVariable int id, @RequestBody KanjiDTO KanjiDTO){

        Optional<kanjiForm> updateKanjiForm = KanjiFormRepository.findById(id);

        if (updateKanjiForm.isPresent()) {
            updateKanjiForm.get().setKanji(KanjiDTO.getKanji());
//            updateKanjiForm.get().setVocab(KanjiDTO.getVocab());
//            updateKanjiForm.get().setParticles(KanjiDTO.getParticles());
            KanjiFormRepository.save(updateKanjiForm.get());
        }

        return new ResponseEntity<>(KanjiFormRepository.findAll(), HttpStatus.OK);
    }


}

