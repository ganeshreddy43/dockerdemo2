package com.neotericdockerdemo2.dockerdemo2.creditcard.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "bill_table",schema = "creditcard")
public class BillPeriodEntity {
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getFromDate() {
        return fromDate;
    }
    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }
    public LocalDate getToDate() {
        return toDate;
    }
    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String status;
}
