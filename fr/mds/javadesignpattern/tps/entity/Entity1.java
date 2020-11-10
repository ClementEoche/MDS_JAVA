package fr.mds.javadesignpattern.tps.entity;

import fr.mds.javadesignpattern.tps.utils.IdHandler;

public class Entity1 {
  private long id;
  private String data;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = IdHandler.getInstance().getUniqueId();
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Entity1 [id=" + id + ", data=" + data + "]";
  }
}
