package org.example.domain;

import javax.persistence.*;

/**
 * @author nguyencan
 * @date 2019-05-23
 */
@IdClass(ProductCategoryId.class)
@Entity
public class ProductCategory {

  @Id
  @JoinColumn(name = "category_id")
  @ManyToOne
  private Category category;

  @Id
  @JoinColumn(name = "product_id")
  @ManyToOne
  private Product product;

  public ProductCategory() {
  }

  public ProductCategory(Category category, Product product) {
    this.category = category;
    this.product = product;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
