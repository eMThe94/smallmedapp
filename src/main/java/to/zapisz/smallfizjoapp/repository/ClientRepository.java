package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.ClientModel;

import java.awt.print.Pageable;
import java.util.List;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {

    Page<ClientModel> findAllBy(Pageable pageable);
//    List<ClientModel> findByFirstName(String firstName);
//    List<ClientModel> findByLastName (String lastName);
//    List<ClientModel> findByGender (String gender);
}
