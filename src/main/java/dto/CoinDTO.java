package dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@Getter
@Setter

public class CoinDTO {


    private Integer id;
    private String symbol;
    private Integer priceUsd;

    public CoinDTO(Integer id, String symbol, Integer priceUsd) {
        this.id = id;
        this.symbol = symbol;
        this.priceUsd = priceUsd;
    }

    public CoinDTO() {
    }

    @Override
    public String toString() {
        return "CoinDTO{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", priceUsd=" + priceUsd +
                '}';
    }
}
