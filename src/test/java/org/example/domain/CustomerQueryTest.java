package org.example.domain;

import io.ebean.Ebean;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CustomerQueryTest {

  @Test
  public void findById() {
    Product product1 = Ebean.find(Product.class).setUseCache(true).where().eq("id", 1).findOne();

    assertNotNull(product1);

    product1.getProductCategories().forEach(customerAddress -> {
      System.out.println(customerAddress.getCategory());
    });

    Product product2 = Ebean.find(Product.class).setUseCache(true).where().eq("id", 1).findOne();

    assertNotNull(product2);

    product2.getProductCategories().forEach(customerAddress -> {
      System.out.println(customerAddress.getCategory());
    });
  }


}
