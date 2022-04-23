package br.com.beckhauser.bankslipgenerator.controllers;

import br.com.beckhauser.bankslipgenerator.repository.BankslipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankslips")
public class BankslipController {

    @Autowired
    private BankslipRepository bankslipRepository;

    @GetMapping
    public String getAllBankslips(){
        return "Pegamo tudo";
    }

    @GetMapping("/{id}")
    public String getBankslip(){
        return "An specific bankslip";
    }

    @Post

}
