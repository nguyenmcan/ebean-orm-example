package org.example.domain;

import io.ebean.annotation.Cache;

import javax.persistence.*;

/**
 * @author nguyencan
 * @date 2019-05-23
 */
@Cache
@Entity
public class Address {

  @Id
  private long id;

  private String name;

  @Version
  private long version;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }
}
