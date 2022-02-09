package service;

import dto.CoinDTO;
import entity.Coin;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.CoinRepository;

@Slf4j
@Service
public class CoinServiceImpl implements CoinService {

    private CoinRepository coinRepository;
    @Autowired
    public CoinServiceImpl(CoinRepository coinRepository) {
        this.coinRepository = coinRepository;
    }

    @Override
    @Transactional
    public CoinDTO getCoinById(int id) {
        Coin coin = coinRepository.findById(id).get();
        return new CoinDTO(coin.getId(), coin.getSymbol(), coin.getPriceUsd());
    }

    @Override
    @Transactional
    public void save(@NotNull CoinDTO coinDTO){
    coinRepository.save(new Coin(coinDTO.getId(), coinDTO.getSymbol(), coinDTO.getPriceUsd()));
    }


//    @Override
//    public void save(CoinDTO coinDTO) {
//    coinRepository.save( );
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public List<CoinDTO> getAllCoin() {
//        return null;
//    }
}
