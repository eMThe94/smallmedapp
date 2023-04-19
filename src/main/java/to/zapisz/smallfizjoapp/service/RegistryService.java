package to.zapisz.smallfizjoapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import to.zapisz.smallfizjoapp.model.RegistryModel;
import to.zapisz.smallfizjoapp.repository.RegistryRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegistryService {
    private final RegistryRepository registryRepository;

    //CREATE
    public void addUser(RegistryModel addRegistryModel){
        registryRepository.save(addRegistryModel);
    }
    //READ
    public List<RegistryModel> getAllRegistries(){
        return registryRepository.findAll();
    }
    //UPDATE
    public void editRegistry(RegistryModel editRegistryModel) {
        registryRepository.save(editRegistryModel);
    }
    //DELETE
    public void deleteRegistry(Long id) {registryRepository.deleteById(id);}

    // FIND BY ID
    public RegistryModel getRegistryById(Long id) {
        Optional<RegistryModel> registry = registryRepository.findById(id);
        if(registry.isPresent()){
            return registryRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}
