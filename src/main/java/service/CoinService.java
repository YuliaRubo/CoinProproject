package service;

import dto.CoinDTO;
import entity.Coin;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CoinService {

   CoinDTO getCoinById(int id);
    void save(CoinDTO coinDTO);

//    void save(CoinDTO coinDTO);
//
//    void delete(int id);
//
//    List<CoinDTO> getAllCoin();


}
