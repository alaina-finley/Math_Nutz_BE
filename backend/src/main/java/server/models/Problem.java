package server.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

// @Document(collection="problems") //is this needed
@Entity
public class Problem{
  @Id
  @GeneratedValue
  private Integer id;
  @Column
  private Integer first;
  @Column
  private Integer second;
  @Column
  private Integer operation;
  @Column
  private Integer difficulty;

  public Problem(){
    super();
  }

  public Problem(Integer first, Integer second, Integer operation, Integer difficulty){
    this.first = first;
    this.second = second;
    this.operation = operation;
    this.difficulty = difficulty;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getFirst() {
    return first;
  }

  public void setFirst(Integer first) {
    this.first = first;
  }

  public Integer getSecond() {
    return second;
  }

  public void setSecond(Integer second) {
    this.second = second;
  }

  public Integer getOperation() {
    return operation;
  }

  public void setOperation(Integer operation) {
    this.operation = operation;
  }

  public Integer getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }

}
