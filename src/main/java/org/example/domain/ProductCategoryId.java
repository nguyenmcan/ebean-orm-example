package org.example.domain;

import javax.persistence.Embeddable;

/**
 * @author nguyencan
 * @date 2019-05-23
 */
@Embeddable
public class ProductCategoryId {

  private long customerId;
  private long addressId;

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }

}
