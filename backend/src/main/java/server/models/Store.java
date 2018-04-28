package server.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Store {
  @Id
  @GeneratedValue
  private Integer id;
  @Column
  private Integer student_id;
  @Column
  private boolean item1_purchased;
  @Column
  private boolean item2_purchased;
  @Column
  private boolean item3_purchased;
  @Column
  private boolean item4_purchased;
  @Column
  private boolean item5_purchased;

  public Store(){
    super();
  }

  public Store(Integer student_id, boolean item1_purchased, boolean item2_purchased, boolean item3_purchased, boolean item4_purchased, boolean item5_purchased) {
    this.student_id = student_id;
    this.item1_purchased = item1_purchased;
    this.item2_purchased = item2_purchased;
    this.item3_purchased = item3_purchased;
    this.item4_purchased = item4_purchased;
    this.item5_purchased = item5_purchased;
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

  public boolean getItem1_purchased(){
    return item1_purchased;
  }
  public void setItem1_purchased(boolean item1_purchased){
    this.item1_purchased = item1_purchased;
  }
  public boolean getItem2_purchased(){
    return item2_purchased;
  }
  public void setItem2_purchased(boolean item2_purchased){
    this.item2_purchased = item2_purchased;
  }
  public boolean getItem3_purchased(){
    return item3_purchased;
  }
  public void setItem3_purchased(boolean item3_purchased){
    this.item3_purchased = item3_purchased;
  }
  public boolean getItem4_purchased(){
    return item4_purchased;
  }
  public void setItem4_purchased(boolean item4_purchased){
    this.item4_purchased = item4_purchased;
  }
  public boolean getItem5_purchased(){
    return item5_purchased;
  }
  public void setItem5_purchased(boolean item5_purchased){
    this.item5_purchased = item5_purchased;
  }


}
