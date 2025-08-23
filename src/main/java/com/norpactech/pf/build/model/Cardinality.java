package com.norpactech.pf.build.model;
/**
 * © 2025 Northern Pacific Technologies, LLC. All Rights Reserved. 
 *  
 * For license details, see the LICENSE file in this project root.
 */
import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import java.util.UUID;
/**
 * API Model Class: Cardinality - Object Cardinality
 */
public class Cardinality {

  private UUID id;
  private UUID idProperty;
  private UUID idObjectReference;
  private UUID idRtCardinality;
  private UUID idRtCardinalityStrength;
  private Boolean hasReferentialAction;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
  private Boolean isActive;

  public Cardinality () {}

  public Cardinality (
    UUID id,
    UUID idProperty,
    UUID idObjectReference,
    UUID idRtCardinality,
    UUID idRtCardinalityStrength,
    Boolean hasReferentialAction,
    Date createdAt,
    String createdBy,
    Date updatedAt,
    String updatedBy,
    Boolean isActive)
 {
    this.id = id;
    this.idProperty = idProperty;
    this.idObjectReference = idObjectReference;
    this.idRtCardinality = idRtCardinality;
    this.idRtCardinalityStrength = idRtCardinalityStrength;
    this.hasReferentialAction = hasReferentialAction;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.updatedAt = updatedAt;
    this.updatedBy = updatedBy;
    this.isActive = isActive;
  }

  // Getters and Setters...
    
  public UUID getId() {
    return this.id;
  }
    
  public UUID setId(UUID id) {
    return this.id = id;
  }    
    
  public UUID getIdProperty() {
    return this.idProperty;
  }
    
  public UUID setIdProperty(UUID idProperty) {
    return this.idProperty = idProperty;
  }    
    
  public UUID getIdObjectReference() {
    return this.idObjectReference;
  }
    
  public UUID setIdObjectReference(UUID idObjectReference) {
    return this.idObjectReference = idObjectReference;
  }    
    
  public UUID getIdRtCardinality() {
    return this.idRtCardinality;
  }
    
  public UUID setIdRtCardinality(UUID idRtCardinality) {
    return this.idRtCardinality = idRtCardinality;
  }    
    
  public UUID getIdRtCardinalityStrength() {
    return this.idRtCardinalityStrength;
  }
    
  public UUID setIdRtCardinalityStrength(UUID idRtCardinalityStrength) {
    return this.idRtCardinalityStrength = idRtCardinalityStrength;
  }    
    
  public Boolean getHasReferentialAction() {
    return this.hasReferentialAction;
  }
    
  public Boolean setHasReferentialAction(Boolean hasReferentialAction) {
    return this.hasReferentialAction = hasReferentialAction;
  }    
    
  public Date getCreatedAt() {
    return this.createdAt;
  }
    
  public Date setCreatedAt(Date createdAt) {
    return this.createdAt = createdAt;
  }    
    
  public String getCreatedBy() {
    return this.createdBy;
  }
    
  public String setCreatedBy(String createdBy) {
    return this.createdBy = createdBy;
  }    
    
  public Date getUpdatedAt() {
    return this.updatedAt;
  }
    
  public Date setUpdatedAt(Date updatedAt) {
    return this.updatedAt = updatedAt;
  }    
    
  public String getUpdatedBy() {
    return this.updatedBy;
  }
    
  public String setUpdatedBy(String updatedBy) {
    return this.updatedBy = updatedBy;
  }    
    
  public Boolean getIsActive() {
    return this.isActive;
  }
    
  public Boolean setIsActive(Boolean isActive) {
    return this.isActive = isActive;
  }    
}