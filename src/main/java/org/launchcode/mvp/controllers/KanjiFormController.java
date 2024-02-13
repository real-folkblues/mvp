package org.launchcode.mvp.controllers;

import jakarta.servlet.http.HttpSession;
import org.launchcode.mvp.data.KanjiFormRepository;
import org.launchcode.mvp.models.KanjiForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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


    @RequestMapping
    public class kanjiForm {

    private int kanjiFormID;
    private String kanjiFormType; (all variables/fields/methods tbd)
    private String kanjiFormName;
    private ArrayList<String> setNewKanjiForm = new ArrayList<>();

    public kanjiForm(int kanjiFormID, String kanjiFormType, String kanjiFormName){
        this.kanjiFormType = kanjiFormType;
        this.kanjiFormName = kanjiFormName;

    }



    @PostMapping("/")
    public ResponseEntity<?> processForm(@RequestBody KanjiDTO kanjiDTO, Errors errors, HttpSession session,
                                         KanjiForm kanjiForm) {
        kanjiForm = new KanjiForm(KanjiDTO.getKanji());

        //looking up kanji in the db
        KanjiForm kanjiForm = new kanjiFormRepository (KanjiDTO.getKanji(), KanjiDTO.getPassword());

        System.out.println(kanjiDTO.getKanjiForm);

        if (kanjiForm == null || !kanjiForm.isMatchingKanji()) {
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
//            headers.add("Set-Cookie", "JSESSIONID=" + session.getId());
        //headers.add("Set-Cookie", "username=" + session.getAttribute(theUser.getUsername()));
        //"; HttpOnly; SameSite=None; Secure
        headers.add("User-ID", kanjiForm.getKanji());


        return new ResponseEntity<>(kanjiForm, HttpStatus.OK);
    }
//
    }

    @GetMapping("/getKanjiForms")
    public ResponseEntity<?> getKanjiFormObjects() {
        return new ResponseEntity<>(kanjiFormRepository.findAll(), HttpStatus.OK);
    }

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
    public ResponseEntity<?> updateKanjiForm(@PathVariable int id, @RequestBody KanjiFormDTO kanjiFormDTO){

        Optional<kanjiForm> updateKanjiForm = KanjiFormRepository.findById(id);

        if (updateKanjiForm.isPresent()) {
            updateKanjiForm.get().setName(kanjiFormDTO.getKanji());
            updateKanjiForm.get().setAbv(kanjiFormDTO.getVocab());
            updateKanjiForm.get().setTastingNotes(kanjiFormDTO.getParticles());
            KanjiFormRepository.save(updateKanjiForm.get());
        }

        return new ResponseEntity<>(KanjiFormRepository.findAll(), HttpStatus.OK);
    }


}

