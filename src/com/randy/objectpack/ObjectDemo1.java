package com.randy.objectpack;

import java.util.Objects;

/**
 * @author randy
 * @date 2023/4/26 11:05
 */
public class ObjectDemo1 {

  private String name;

  public static void main(String[] args) {

    ObjectDemo1 od = new ObjectDemo1("Randy");
    od.sayClass();

    System.out.println(Objects.isNull(od));
    System.out.println(Objects.equals(od, "Randy"));
  }

  public ObjectDemo1(String name) {
    this.name = name;
  }

  public void sayClass() {
    System.out.println(this.getClass());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "ObjectDemo1{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ObjectDemo1 that = (ObjectDemo1) o;
    return Objects.equals(name, that.name);
  }
}
