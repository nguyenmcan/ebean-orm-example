package org.example.domain;

import javax.persistence.*;

/**
 * @author nguyencan
 * @date 2019-05-23
 */
@IdClass(CustomerAddressId.class)
@Entity
public class CustomerAddress {

  @Id
  @JoinColumn(name = "address_id")
  @ManyToOne
  private Address address;

  @Id
  @JoinColumn(name = "customer_id")
  @ManyToOne
  private Customer customer;

  public CustomerAddress() {
  }

  public CustomerAddress(Address address, Customer customer) {
    this.address = address;
    this.customer = customer;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
