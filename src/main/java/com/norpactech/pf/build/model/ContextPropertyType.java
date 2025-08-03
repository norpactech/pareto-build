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
 * API Model Class: ContextPropertyType - Context Property Types
 */
public class ContextPropertyType {

  private UUID id;
  private UUID idContext;
  private UUID idGenericPropertyType;
  private UUID idSchema;
  private Integer length;
  private Integer scale;
  private Boolean isNullable;
  private String defaultValue;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
  private Boolean isActive;

  public ContextPropertyType () {}

  public ContextPropertyType (
    UUID id,
    UUID idContext,
    UUID idGenericPropertyType,
    UUID idSchema,
    Integer length,
    Integer scale,
    Boolean isNullable,
    String defaultValue,
    Date createdAt,
    String createdBy,
    Date updatedAt,
    String updatedBy,
    Boolean isActive)
 {
    this.id = id;
    this.idContext = idContext;
    this.idGenericPropertyType = idGenericPropertyType;
    this.idSchema = idSchema;
    this.length = length;
    this.scale = scale;
    this.isNullable = isNullable;
    this.defaultValue = defaultValue;
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
    
  public UUID getIdContext() {
    return this.idContext;
  }
    
  public UUID setIdContext(UUID idContext) {
    return this.idContext = idContext;
  }    
    
  public UUID getIdGenericPropertyType() {
    return this.idGenericPropertyType;
  }
    
  public UUID setIdGenericPropertyType(UUID idGenericPropertyType) {
    return this.idGenericPropertyType = idGenericPropertyType;
  }    
    
  public UUID getIdSchema() {
    return this.idSchema;
  }
    
  public UUID setIdSchema(UUID idSchema) {
    return this.idSchema = idSchema;
  }    
    
  public Integer getLength() {
    return this.length;
  }
    
  public Integer setLength(Integer length) {
    return this.length = length;
  }    
    
  public Integer getScale() {
    return this.scale;
  }
    
  public Integer setScale(Integer scale) {
    return this.scale = scale;
  }    
    
  public Boolean getIsNullable() {
    return this.isNullable;
  }
    
  public Boolean setIsNullable(Boolean isNullable) {
    return this.isNullable = isNullable;
  }    
    
  public String getDefaultValue() {
    return this.defaultValue;
  }
    
  public String setDefaultValue(String defaultValue) {
    return this.defaultValue = defaultValue;
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