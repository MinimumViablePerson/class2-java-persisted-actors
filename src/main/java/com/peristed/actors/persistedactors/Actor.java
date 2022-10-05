package com.peristed.actors.persistedactors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Integer id;
  public String name;

  public Actor() {
  }
}
