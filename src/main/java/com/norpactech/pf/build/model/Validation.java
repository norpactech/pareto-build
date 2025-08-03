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
 * API Model Class: Validation - Validations
 */
public class Validation {

  private UUID id;
  private UUID idTenant;
  private UUID idRtValidationType;
  private String name;
  private String description;
  private String errorMsg;
  private String expression;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
  private Boolean isActive;

  public Validation () {}

  public Validation (
    UUID id,
    UUID idTenant,
    UUID idRtValidationType,
    String name,
    String description,
    String errorMsg,
    String expression,
    Date createdAt,
    String createdBy,
    Date updatedAt,
    String updatedBy,
    Boolean isActive)
 {
    this.id = id;
    this.idTenant = idTenant;
    this.idRtValidationType = idRtValidationType;
    this.name = name;
    this.description = description;
    this.errorMsg = errorMsg;
    this.expression = expression;
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
    
  public UUID getIdTenant() {
    return this.idTenant;
  }
    
  public UUID setIdTenant(UUID idTenant) {
    return this.idTenant = idTenant;
  }    
    
  public UUID getIdRtValidationType() {
    return this.idRtValidationType;
  }
    
  public UUID setIdRtValidationType(UUID idRtValidationType) {
    return this.idRtValidationType = idRtValidationType;
  }    
    
  public String getName() {
    return this.name;
  }
    
  public String setName(String name) {
    return this.name = name;
  }    
    
  public String getDescription() {
    return this.description;
  }
    
  public String setDescription(String description) {
    return this.description = description;
  }    
    
  public String getErrorMsg() {
    return this.errorMsg;
  }
    
  public String setErrorMsg(String errorMsg) {
    return this.errorMsg = errorMsg;
  }    
    
  public String getExpression() {
    return this.expression;
  }
    
  public String setExpression(String expression) {
    return this.expression = expression;
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