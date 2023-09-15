package com.example.asterixapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asterix")
public class AsterixController {

    private CharacterRepository characterRepo;

    public AsterixController(CharacterRepository characterRepo){
        this.characterRepo = characterRepo;
    }

    @GetMapping("/character")
    public List<Character> getCharacter(){
        return characterRepo.findAll();
    }
}
