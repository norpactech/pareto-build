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
 * API Model Class: DataObject - Object
 */
public class DataObject {

  private UUID id;
  private UUID idSchema;
  private String name;
  private String description;
  private Boolean hasIdentifier;
  private Boolean hasAudit;
  private Boolean hasActive;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
  private Boolean isActive;

  public DataObject () {}

  public DataObject (
    UUID id,
    UUID idSchema,
    String name,
    String description,
    Boolean hasIdentifier,
    Boolean hasAudit,
    Boolean hasActive,
    Date createdAt,
    String createdBy,
    Date updatedAt,
    String updatedBy,
    Boolean isActive)
 {
    this.id = id;
    this.idSchema = idSchema;
    this.name = name;
    this.description = description;
    this.hasIdentifier = hasIdentifier;
    this.hasAudit = hasAudit;
    this.hasActive = hasActive;
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
    
  public UUID getIdSchema() {
    return this.idSchema;
  }
    
  public UUID setIdSchema(UUID idSchema) {
    return this.idSchema = idSchema;
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
    
  public Boolean getHasIdentifier() {
    return this.hasIdentifier;
  }
    
  public Boolean setHasIdentifier(Boolean hasIdentifier) {
    return this.hasIdentifier = hasIdentifier;
  }    
    
  public Boolean getHasAudit() {
    return this.hasAudit;
  }
    
  public Boolean setHasAudit(Boolean hasAudit) {
    return this.hasAudit = hasAudit;
  }    
    
  public Boolean getHasActive() {
    return this.hasActive;
  }
    
  public Boolean setHasActive(Boolean hasActive) {
    return this.hasActive = hasActive;
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