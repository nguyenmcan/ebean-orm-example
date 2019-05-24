package org.example.domain;

import io.ebean.Ebean;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


/**
 * When running tests in the IDE install the "Enhancement plugin".
 * <p>
 * http://ebean-orm.github.io/docs/setup/enhancement#ide
 */
public class CustomerTest {

  /**
   * Use the Ebean singleton (effectively using the "default server").
   */
  @Test
  public void insert_via_ebean() {
    Product product1 = new Product("Product 01");
    Ebean.save(product1);

    assertNotNull(product1.getId());

    Category category1 = new Category("Category 01");
    Ebean.save(category1);

    assertNotNull(category1.getId());
  }

}
