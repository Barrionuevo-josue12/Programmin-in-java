package ar.edu.unju.fi.domain;

import java.time.LocalDate;
@Entity
@Table("name" )
public class BankAccount {
    private long id;
    private Long accountNumber;
    private Client client;
    private LocalDate creationDate;
    private double balance;
    private BankAccountStatus status;
    private double extractionLimit;
}
