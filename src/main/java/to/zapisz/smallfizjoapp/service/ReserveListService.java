package to.zapisz.smallfizjoapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import to.zapisz.smallfizjoapp.model.ReserveListModel;
import to.zapisz.smallfizjoapp.repository.ReservedListRepository;


import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReserveListService {
    private final ReservedListRepository reserveListRepository;

    //CREATE
    public void addReserveList(ReserveListModel addReserveListModel){
        reserveListRepository.save(addReserveListModel);
    }
    //READ
    public List<ReserveListModel> getAllReserveLists(){
        return reserveListRepository.findAll();
    }
    //UPDATE
    public void editReserveList(ReserveListModel editReserveListModel) {
        reserveListRepository.save(editReserveListModel);
    }
    //DELETE
    public void deleteReserveList(Long id) {reserveListRepository.deleteById(id);}

    // FIND BY ID
    public ReserveListModel getReserveListById(Long id) {
        Optional<ReserveListModel> reserveList = reserveListRepository.findById(id);
        if(reserveList.isPresent()){
            return reserveListRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}
