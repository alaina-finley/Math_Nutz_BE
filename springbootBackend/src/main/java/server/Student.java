package server;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Student {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  @Column
  private String username;
  @Column
  private String password;
  @Column
  private Integer total;
  @Column
  private Integer correct;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Integer getCorrect() {
    return correct;
  }

  public void setCorrect(Integer correct) {
    this.correct = correct;
  }
}
