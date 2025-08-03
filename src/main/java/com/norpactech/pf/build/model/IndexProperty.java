package com.norpactech.pf.build.model;
/**
 * © 2025 Northern Pacific Technologies, LLC. All Rights Reserved. 
 *  
 * For license details, see the LICENSE file in this project root.
 */
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.UUID;
/**
 * API Model Class: IndexProperty - Index Properties
 */
public class IndexProperty {

  private UUID id;
  private UUID idIndex;
  private UUID idProperty;
  private UUID idRtSortOrder;
  private Integer sequence;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
  private Boolean isActive;

  public IndexProperty () {}

  public IndexProperty (
    UUID id,
    UUID idIndex,
    UUID idProperty,
    UUID idRtSortOrder,
    Integer sequence,
    Date createdAt,
    String createdBy,
    Date updatedAt,
    String updatedBy,
    Boolean isActive)
 {
    this.id = id;
    this.idIndex = idIndex;
    this.idProperty = idProperty;
    this.idRtSortOrder = idRtSortOrder;
    this.sequence = sequence;
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
    
  public UUID getIdIndex() {
    return this.idIndex;
  }
    
  public UUID setIdIndex(UUID idIndex) {
    return this.idIndex = idIndex;
  }    
    
  public UUID getIdProperty() {
    return this.idProperty;
  }
    
  public UUID setIdProperty(UUID idProperty) {
    return this.idProperty = idProperty;
  }    
    
  public UUID getIdRtSortOrder() {
    return this.idRtSortOrder;
  }
    
  public UUID setIdRtSortOrder(UUID idRtSortOrder) {
    return this.idRtSortOrder = idRtSortOrder;
  }    
    
  public Integer getSequence() {
    return this.sequence;
  }
    
  public Integer setSequence(Integer sequence) {
    return this.sequence = sequence;
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