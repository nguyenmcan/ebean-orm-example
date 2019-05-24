package org.example.domain;

import io.ebean.annotation.Cache;

import javax.persistence.*;

/**
 * @author nguyencan
 * @date 2019-05-23
 */
@Cache
@Entity
public class Category {

  @Id
  private Long id;

  private String name;

  @Version
  private Long version;

  public Category() {
  }

  public Category(String name) {
    this.name = name;
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
}
