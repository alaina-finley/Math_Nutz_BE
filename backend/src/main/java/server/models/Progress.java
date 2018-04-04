package server.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Progress{
  @Id
  @GeneratedValue
  private Integer id;
  @Column
  private Integer student_id;
  @Column
  private Integer lev11_total;
  @Column
  private Integer lev11_correct;
  @Column
  private Integer lev12_total;
  @Column
  private Integer lev12_correct;
  @Column
  private Integer lev13_total;
  @Column
  private Integer lev13_correct;
  @Column
  private Integer lev21_total;
  @Column
  private Integer lev21_correct;
  @Column
  private Integer lev22_total;
  @Column
  private Integer lev22_correct;
  @Column
  private Integer lev23_total;
  @Column
  private Integer lev23_correct;
  @Column
  private Integer lev31_total;
  @Column
  private Integer lev31_correct;
  @Column
  private Integer lev32_total;
  @Column
  private Integer lev32_correct;
  @Column
  private Integer lev33_total;
  @Column
  private Integer lev33_correct;
  @Column
  private Integer boss_total;
  @Column
  private Integer boss_correct;

  public Progress(){
    super();
  }

  public Progress(Integer student_id, Integer lev11_total, Integer lev11_correct, Integer lev12_total, Integer lev12_correct, Integer lev13_total, Integer lev13_correct, Integer lev21_total, Integer lev21_correct, Integer lev22_total, Integer lev22_correct, Integer lev23_total, Integer lev23_correct, Integer lev31_total, Integer lev31_correct, Integer lev32_total, Integer lev32_correct, Integer lev33_total, Integer lev33_correct, Integer boss_total, Integer boss_correct){
    this.student_id = student_id;
    this.lev11_total = lev11_total;
    this.lev11_correct = lev11_correct;
    this.lev12_total = lev12_total;
    this.lev12_correct = lev12_correct;
    this.lev13_total = lev13_total;
    this.lev13_correct = lev13_correct;

    this.lev21_total = lev21_total;
    this.lev21_correct = lev21_correct;
    this.lev22_total = lev22_total;
    this.lev22_correct = lev22_correct;
    this.lev23_total = lev23_total;
    this.lev23_correct = lev23_correct;

    this.lev31_total = lev31_total;
    this.lev31_correct = lev31_correct;
    this.lev32_total = lev32_total;
    this.lev32_correct = lev32_correct;
    this.lev33_total = lev33_total;
    this.lev33_correct = lev33_correct;

    this.boss_total = boss_total;
    this.boss_correct = boss_correct;

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

  public Integer getLev11_total(){
    return lev11_total;
  }
  public void setLev11_total(Integer lev11_total){
    this.lev11_total = lev11_total;
  }
  public Integer getLev11_correct(){
    return lev11_correct;
  }
  public void setLev11_correct(Integer lev11_correct){
    this.lev11_correct = lev11_correct;
  }

  public Integer getLev12_total(){
    return lev12_total;
  }
  public void setLev12_total(Integer lev12_total){
    this.lev12_total = lev12_total;
  }
  public Integer getLev12_correct(){
    return lev12_correct;
  }
  public void setLev12_correct(Integer lev12_correct){
    this.lev12_correct = lev12_correct;
  }

  public Integer getLev13_total(){
    return lev13_total;
  }
  public void setLev13_total(Integer lev13_total){
    this.lev13_total = lev13_total;
  }
  public Integer getLev13_correct(){
    return lev13_correct;
  }
  public void setLev13_correct(Integer lev13_correct){
    this.lev13_correct = lev13_correct;
  }

  public Integer getLev21_total(){
    return lev21_total;
  }
  public void setLev21_total(Integer lev21_total){
    this.lev21_total = lev21_total;
  }
  public Integer getLev21_correct(){
    return lev21_correct;
  }
  public void setLev21_correct(Integer lev21_correct){
    this.lev21_correct = lev21_correct;
  }

  public Integer getLev22_total(){
    return lev22_total;
  }
  public void setLev22_total(Integer lev22_total){
    this.lev22_total = lev22_total;
  }
  public Integer getLev22_correct(){
    return lev22_correct;
  }
  public void setLev22_correct(Integer lev22_correct){
    this.lev22_correct = lev22_correct;
  }

  public Integer getLev23_total(){
    return lev23_total;
  }
  public void setLev23_total(Integer lev23_total){
    this.lev23_total = lev23_total;
  }
  public Integer getLev23_correct(){
    return lev23_correct;
  }
  public void setLev23_correct(Integer lev23_correct){
    this.lev23_correct = lev23_correct;
  }

  public Integer getLev31_total(){
    return lev31_total;
  }
  public void setLev31_total(Integer lev31_total){
    this.lev31_total = lev31_total;
  }
  public Integer getLev31_correct(){
    return lev31_correct;
  }
  public void setLev31_correct(Integer lev31_correct){
    this.lev31_correct = lev31_correct;
  }

  public Integer getLev32_total(){
    return lev32_total;
  }
  public void setLev32_total(Integer lev32_total){
    this.lev32_total = lev32_total;
  }
  public Integer getLev32_correct(){
    return lev32_correct;
  }
  public void setLev32_correct(Integer lev32_correct){
    this.lev32_correct = lev32_correct;
  }

  public Integer getLev33_total(){
    return lev33_total;
  }
  public void setLev33_total(Integer lev33_total){
    this.lev33_total = lev33_total;
  }
  public Integer getLev33_correct(){
    return lev33_correct;
  }
  public void setLev33_correct(Integer lev33_correct){
    this.lev33_correct = lev33_correct;
  }

  public Integer getBoss_total(){
    return boss_total;
  }
  public void setBoss_total(Integer boss_total){
    this.boss_total = boss_total;
  }
  public Integer getBoss_correct(){
    return boss_correct;
  }
  public void setBoss_correct(Integer boss_correct){
    this.boss_correct = boss_correct;
  }

}
