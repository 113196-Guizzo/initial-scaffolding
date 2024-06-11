package ar.edu.utn.frc.tup.lc.iii.services;

import ar.edu.utn.frc.tup.lc.iii.models.Dummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {
    // diseño un metodo para recuperar el player por el id desde en controlador al servicio
    Dummy getDummy(Long id);

List<Dummy> getDummyList();

    // diseño un metodo para guardar un nuevo player
    Dummy createDummy(Dummy dummy);
    Dummy updateDummy(Dummy dummy);

    void deleteDummy (Dummy dummy);

}
