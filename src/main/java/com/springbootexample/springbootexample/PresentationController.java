package com.springbootexample.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/presentations")
public class PresentationController {

    private PresentationRepository presentationRepository;


    @Autowired
    public PresentationController(PresentationRepository presentationRepository){
        this.presentationRepository = presentationRepository;
    }

    @PostMapping("/addPresentation")
    public void addPresentation(@RequestBody Presentation presentation){
        presentationRepository.save(presentation);
    }

    @GetMapping
    public List<Presentation> getPresentations(){
        return presentationRepository.findAll();
    }

}
