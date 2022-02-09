package repository;

import dto.CoinDTO;
import entity.Coin;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CoinRepository extends CrudRepository<Coin, Integer> {

    CoinDTO getCoinById(int id);
    void save(CoinDTO coinDTO);




//    @Query(value = "SELECT * FROM COIN WHERE ID = ?1")
//    Coin findAllCoinById(Integer id);

}
