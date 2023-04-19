package to.zapisz.smallfizjoapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import to.zapisz.smallfizjoapp.model.TherapistModel;
import to.zapisz.smallfizjoapp.model.UserModel;
import to.zapisz.smallfizjoapp.repository.TherapistRepository;
import to.zapisz.smallfizjoapp.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    //CREATE
    public void addUser(UserModel addUserModel){
        userRepository.save(addUserModel);
    }
    //READ
    public List<UserModel> getAllUsers(){
        return  userRepository.findAll();
    }
    //UPDATE
    public void editUser(UserModel editUserModel) {
        userRepository.save(editUserModel);
    }
    //DELETE
    public void deleteUser(Long id) {userRepository.deleteById(id);}

    // FIND BY ID
    public UserModel getUserById(Long id) {
        Optional<UserModel> user = userRepository.findById(id);
        if(user.isPresent()){
            return userRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}
