package to.zapisz.smallfizjoapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import to.zapisz.smallfizjoapp.model.TherapistModel;
import to.zapisz.smallfizjoapp.repository.TherapistRepository;


import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TherapistService {
    private final TherapistRepository therapistRepository;

    //CREATE
    public void addTherapist(TherapistModel addTherapistModel){
        therapistRepository.save(addTherapistModel);
    }
    //READ
    public List<TherapistModel> getAllTherapists(){
        return  therapistRepository.findAll();
    }
    //UPDATE
    public void editTherapist(TherapistModel editTherapistModel) {
        therapistRepository.save(editTherapistModel);
    }
    //DELETE
    public void deleteTherapist(Long id) {therapistRepository.deleteById(id);}

    // FIND BY ID
    public TherapistModel getTherapistById(Long id) {
        Optional<TherapistModel> therapist = therapistRepository.findById(id);
        if(therapist.isPresent()){
            return therapistRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}
