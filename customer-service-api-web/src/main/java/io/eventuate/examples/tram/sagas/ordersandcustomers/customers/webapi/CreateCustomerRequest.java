package io.eventuate.examples.tram.sagas.ordersandcustomers.customers.webapi;

import io.eventuate.examples.tram.sagas.ordersandcustomers.commondomain.Money;

public class CreateCustomerRequest {
  private String name;
  private Money creditLimit;

  public CreateCustomerRequest() {
  }

  public CreateCustomerRequest(String name, Money creditLimit) {

    this.name = name;
    this.creditLimit = creditLimit;
  }


  public String getName() {
    return name;
  }

  public Money getCreditLimit() {
    return creditLimit;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCreditLimit(Money creditLimit) {
    this.creditLimit = creditLimit;
  }
}
