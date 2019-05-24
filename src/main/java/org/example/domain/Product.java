package org.example.domain;

import io.ebean.annotation.Cache;

import javax.persistence.*;
import java.util.List;

@Cache
@Entity
public class Customer {

  @Id
  private long id;

  private String name;

  @OrderColumn(name = "priority")
  @OneToMany(cascade = CascadeType.ALL)
  private List<CustomerAddress> customerAddresses;

  @Version
  private long version;

  public Customer(String name) {
    this.name = name;
  }

  public Customer() {
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public List<CustomerAddress> getCustomerAddresses() {
    return customerAddresses;
  }

  public void setCustomerAddresses(List<CustomerAddress> customerAddresses) {
    this.customerAddresses = customerAddresses;
  }
}
