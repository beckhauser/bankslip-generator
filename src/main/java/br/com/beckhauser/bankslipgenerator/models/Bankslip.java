package br.com.beckhauser.bankslipgenerator.models;

import br.com.beckhauser.bankslipgenerator.enums.BankslipStatus;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
public class Bankslip {

    @Id
    private UUID id;
    private Date date;
    private BigDecimal total_in_cents;
    private String customer;
    @Enumerated(EnumType.STRING)
    private BankslipStatus status = BankslipStatus.PENDING;

}
