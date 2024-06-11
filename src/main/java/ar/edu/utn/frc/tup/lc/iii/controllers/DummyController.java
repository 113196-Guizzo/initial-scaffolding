package ar.edu.utn.frc.tup.lc.iii.controllers;

import ar.edu.utn.frc.tup.lc.iii.dtos.DummyDto;
import ar.edu.utn.frc.tup.lc.iii.models.Dummy;
import ar.edu.utn.frc.tup.lc.iii.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {
    @Autowired
    private DummyService dummyService; // llamamos al servicio a través de la interfaz

    @GetMapping("/dummy")
    public ResponseEntity<DummyDto> getDummyList() { // necesito devolver un player mediante su id
        List<Dummy> dummyList = dummyService.getDummyList();
        return null;// encapsulo dentro de response
    }
    @GetMapping("/{id}")
    public ResponseEntity<DummyDto> getDummyList(@PathVariable Long id) { // necesito devolver un player mediante su id
        Dummy dummy = dummyService.getDummy(id);
        return null;// encapsulo dentro de response
    }
    @PostMapping ("")
    public ResponseEntity<DummyDto> createDummy(DummyDto dummyDto ) { // necesito devolver un player mediante su id
        Dummy createDummy = dummyService.createDummy (null);
        return null;// encapsulo dentro de response
    }

    @PutMapping ("")
    public ResponseEntity<DummyDto> updateDummy(DummyDto dummyDto ) { // necesito devolver un player mediante su id
        Dummy updateDummy = dummyService.updateDummy (null);
        return null;// encapsulo dentro de response
    }
    @DeleteMapping ("")
    public ResponseEntity<Void> deleteDummy(DummyDto dummyDto ) { // necesito devolver un player mediante su id
        dummyService.deleteDummy (null);
        return null;// encapsulo dentro de response
    }
}
