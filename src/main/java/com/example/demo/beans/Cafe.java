package com.example.demo.beans;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Cafe {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;


  @Size(min = 2)
  private String itemName;

  private String user;


  @Min(1)
  private double price;


  @Size(min = 2)
  private String description;

  public String medical;

  public String social;

  public String family;

  public String location;

  private String image;


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id")


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getMedical() {
    return medical;
  }

  public void setMedical(String medical) {
    this.medical = medical;
  }

  public String getSocial() {
    return social;
  }

  public void setSocial(String social) {
    this.social = social;
  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
