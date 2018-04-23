package server.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Coins {
  @Id
  @GeneratedValue
  private Integer id;
  @Column
  private Integer student_id;
  @Column
  private Integer total_coins;

  public Coins(){
    super();
  }

  public Coins(Integer student_id, Integer total_coins) {
    this.student_id = student_id;
    this.total_coins = total_coins;
  }

  public Integer getId(){
    return id;
  }
  public void setId(Integer id){
    this.id = id;
  }

  public Integer getStudent_id(){
    return student_id;
  }
  public void setStudent_id(Integer student_id){
    this.student_id = student_id;
  }

  public Integer getTotal_coins(){
    return total_coins;
  }
  public void setTotal_coins(Integer total_coins){
    this.total_coins = total_coins;
  }


}
