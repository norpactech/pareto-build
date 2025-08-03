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
 * API Model Class: GenericPropertyType - Generic Property Types
 */
public class GenericPropertyType {

  private UUID id;
  private UUID idTenant;
  private UUID idGenericDataType;
  private UUID idValidation;
  private String name;
  private String description;
  private Integer length;
  private Integer scale;
  private Boolean isNullable;
  private String defaultValue;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
  private Boolean isActive;

  public GenericPropertyType () {}

  public GenericPropertyType (
    UUID id,
    UUID idTenant,
    UUID idGenericDataType,
    UUID idValidation,
    String name,
    String description,
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
    this.idTenant = idTenant;
    this.idGenericDataType = idGenericDataType;
    this.idValidation = idValidation;
    this.name = name;
    this.description = description;
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
    
  public UUID getIdTenant() {
    return this.idTenant;
  }
    
  public UUID setIdTenant(UUID idTenant) {
    return this.idTenant = idTenant;
  }    
    
  public UUID getIdGenericDataType() {
    return this.idGenericDataType;
  }
    
  public UUID setIdGenericDataType(UUID idGenericDataType) {
    return this.idGenericDataType = idGenericDataType;
  }    
    
  public UUID getIdValidation() {
    return this.idValidation;
  }
    
  public UUID setIdValidation(UUID idValidation) {
    return this.idValidation = idValidation;
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