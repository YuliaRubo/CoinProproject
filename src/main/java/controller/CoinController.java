package controller;

import dto.CoinDTO;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import service.CoinService;


@Log
@Controller
public class CoinController{

    private CoinService coinService;

    @Autowired
    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @GetMapping("/getById")
    public void getCoinById(@RequestParam("id") int id){
        System.out.println(coinService.getCoinById(id));
    }

    @PostMapping("/save")
    public void saveCoin(@RequestBody CoinDTO coinDTO){
        coinService.save(coinDTO);
    }


    }



