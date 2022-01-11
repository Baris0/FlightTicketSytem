package com.finartz.flightTicketSytem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {

    @CreditCardNumber
    private long cardNumber;

    private int cvv;

    private String date;

}
