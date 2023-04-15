package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.UserModel;

import java.awt.print.Pageable;
import java.util.List;

public interface UserRepository extends JpaRepository <UserModel, Long> {
    Page<UserModel> findAllBy(Pageable pageable);
    List<UserModel> findByFirstName (String firstName);
    List<UserModel> findByLastName (String lastName);
    List<UserModel> findBySpec (String spec);
    List<UserModel> findByAdress (String adress);

}
