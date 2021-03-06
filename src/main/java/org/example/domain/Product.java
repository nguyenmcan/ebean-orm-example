package org.example.domain;

import io.ebean.annotation.Cache;

import javax.persistence.*;
import java.util.List;

@Cache
@Entity
public class Product {

  @Id
  private Long id;

  private String name;

  @OrderColumn(name = "priority")
  @OneToMany(cascade = CascadeType.ALL)
  private List<ProductCategory> productCategories;

  @Version
  private Long version;

  public Product(String name) {
    this.name = name;
  }

  public Product() {
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

  public List<ProductCategory> getProductCategories() {
    return productCategories;
  }

  public void setProductCategories(List<ProductCategory> productCategories) {
    this.productCategories = productCategories;
  }
}
