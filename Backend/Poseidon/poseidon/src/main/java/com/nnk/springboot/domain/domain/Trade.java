package com.nnk.springboot.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.sql.Timestamp;


@Entity
@Table(name = "trade")
public class Trade {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private Integer tradeId;
   @NotNull
   private String account;
   @NotNull
   private String type;
   @Positive
   private Double buyQuantity;
   @Positive
   private Double sellQuantity;
   @Positive
   private Double sellPrice;
   private String benchmark;
   private Timestamp tradeDate;
   private String security;
   private String status;
   private String trader;
   private String book;
   private String creationName;
   private Timestamp creationDate;
   private String revisionName;
   private Timestamp revisionDate;
   private String dealName;
   private String dealType;
   private String sourceListId;
   private String side;
}
