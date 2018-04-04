package server.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "island_user")
public class User{
  @Id
  @GeneratedValue
  private Integer id;
  @Column
  private String username;
  @Column
  private String password;
  @Column
  private String role;

  public User(){
    super();
  }

  public User(String username, String password, String role){
    this.username = username;
    this.password = password;
    this.role = role;
  }

  public Integer getId(){
    return id;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public String getUsername(){
    return username;
  }

  public void setUsername(String username){
    this.username = username;
  }

  public String getPassword(){
    return password;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public String getRole(){
    return role;
  }

  public void setRole(String role){
    this.role = role;
  }

}
