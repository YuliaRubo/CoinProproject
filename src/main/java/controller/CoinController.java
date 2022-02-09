package controller;

import dto.CoinDTO;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.CoinService;


@Log
@Controller
public class CoinController {

    private CoinService coinService;

    @Autowired
    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @GetMapping("/getById")
    public String getCoinById(@RequestParam("id") int id, Model model) {
        model.addAttribute("coin" , coinService.getCoinById(id));
        return "coin";
    }

    @PostMapping("/save")
    public void saveCoin(@RequestBody CoinDTO coinDTO) {
        coinService.save(coinDTO);
    }

    @GetMapping("/deleteById")
    public void deleteCoinById(@RequestParam("id") int id) {
        coinService.delete(id);
    }
}



