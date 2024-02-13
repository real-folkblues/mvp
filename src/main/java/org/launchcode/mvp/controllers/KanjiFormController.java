package org.launchcode.mvp.controllers;

import org.launchcode.mvp.models.KanjiForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

package org.launchcode.mvp.controllers;
package org.launchcode.mvp.controllers.api;

import org.launchcode.mvp.models.KanjiSearch;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

//There may be changes to name of variables, classes, methods, etc. as we further harmonize the project

@Controller
@RequestMapping
public class KanjiFormController {

    @Autowired
    private KanjiFormRepository kanjiFormRepository



    @PostMapping
    public String renderResult(@RequestParam String kanji, @RequestParam String vocab,
                                 @RequestParam particles, Model model){
        KanjiForm newKanjiForm = new KanjiForm();
        newKanjiForm.setNewKanjiForm();

        Model kanjiForm = model.addAttribute("kanjiForm", newKanjiForm);
        return ""
    }
}


public class kanjiForm {

    private int kanjiFormID;
    private String kanjiFormType; (all variables/fields/methods tbd)
    private String kanjiFormName;
    private ArrayList<String> setNewkanjiForm = new ArrayList<>();

    public kanjiForm(int kanjiFormID, String kanjiFormType, String kanjiFormName){
        this.kanjiFormType = kanjiFormType;
        this.kanjiFormName = kanjiFormName;

    }
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