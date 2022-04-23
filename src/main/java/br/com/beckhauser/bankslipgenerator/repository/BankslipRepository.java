package br.com.beckhauser.bankslipgenerator.repository;

import br.com.beckhauser.bankslipgenerator.models.Bankslip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankslipRepository extends JpaRepository<Bankslip, Long> {
}
