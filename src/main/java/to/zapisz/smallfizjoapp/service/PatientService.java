package to.zapisz.smallfizjoapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import to.zapisz.smallfizjoapp.model.PatientModel;
import to.zapisz.smallfizjoapp.model.UserModel;
import to.zapisz.smallfizjoapp.repository.PatientRepository;
import to.zapisz.smallfizjoapp.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    //CREATE
    public void addPatient(PatientModel addPatientModel){
        patientRepository.save(addPatientModel);
    }
    //READ
    public List<PatientModel> getAllPatients(){
        return  patientRepository.findAll();
    }
    //UPDATE
    public void editPatient(PatientModel editPatientModel) {
        patientRepository.save(editPatientModel);
    }
    //DELETE
    public void deletePatient(Long id) {patientRepository.deleteById(id);}

    // FIND BY ID
    public PatientModel getPatientById(Long id) {
        Optional<PatientModel> patient = patientRepository.findById(id);
        if(patient.isPresent()){
            return patientRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }

}
