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
        Coin coin = new Coin(coinDTO.getId(),coinDTO.getSymbol(),coinDTO.getPriceUsd());
    if(coinDTO.getId()==0){
        coin.setId(coinDTO.getId());

        coinRepository.save(coin);
    }
}

    @Override
    public void delete(int id) {
        coinRepository.deleteById(id);
    }
}
