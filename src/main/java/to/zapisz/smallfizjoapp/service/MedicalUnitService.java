package to.zapisz.smallfizjoapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import to.zapisz.smallfizjoapp.model.MedicalUnitModel;
import to.zapisz.smallfizjoapp.repository.MedicalUnitRepository;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class MedicalUnitService {
    private final MedicalUnitRepository medicalUnitRepository;

    //CREATE
    public void addMedicalUnit(MedicalUnitModel medicalUnitModel){
        medicalUnitRepository.save(medicalUnitModel);
    }
    //READ
    public List<MedicalUnitModel> getAllMedicalUnits(){
        return  medicalUnitRepository.findAll();
    }
    //UPDATE
    public void editMedicalUnit(MedicalUnitModel editMedicalUnitModel) {
        medicalUnitRepository.save(editMedicalUnitModel);
    }
    //DELETE
    public void deleteMedicalUnit(Long id) {medicalUnitRepository.deleteById(id);}

    public MedicalUnitModel getMedicalUnitById(Long id) {
        Optional<MedicalUnitModel> medicalUnit = medicalUnitRepository.findById(id);
        if(medicalUnit.isPresent()){
            return medicalUnitRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }

}
