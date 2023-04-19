package to.zapisz.smallfizjoapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import to.zapisz.smallfizjoapp.model.CardModel;
import to.zapisz.smallfizjoapp.repository.CardRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;

    //CREATE
    public void addCard(CardModel addCardModel){
        cardRepository.save(addCardModel);
    }
    //READ
    public List<CardModel> getAllCards(){
        return  cardRepository.findAll();
    }
    //UPDATE
    public void editCard(CardModel editCardModel) {
        cardRepository.save(editCardModel);
    }
    //DELETE
    public void deleteCard(Long id) {cardRepository.deleteById(id);}

    // FIND BY ID
    public CardModel getCardById(Long id) {
        Optional<CardModel> card = cardRepository.findById(id);
        if(card.isPresent()){
            return cardRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}
