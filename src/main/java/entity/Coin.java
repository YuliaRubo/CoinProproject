package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="coin")
@Setter
@Getter


public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Column(name = "price_usd")
    private Integer priceUsd;

    public Coin(Integer id, String symbol, Integer priceUsd) {
        this.id = id;
        this.symbol = symbol;
        this.priceUsd = priceUsd;
    }

    public Coin() {
    }

    @Override
    public String toString() {
        return "Coin{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", priceUsd=" + priceUsd +
                '}';
    }
}

