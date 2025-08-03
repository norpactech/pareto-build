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
 * API Model Class: Project - Pareto Project
 */
public class Project {

  private UUID id;
  private UUID idTenant;
  private String name;
  private String description;
  private String domain;
  private String artifact;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
  private Boolean isActive;

  public Project () {}

  public Project (
    UUID id,
    UUID idTenant,
    String name,
    String description,
    String domain,
    String artifact,
    Date createdAt,
    String createdBy,
    Date updatedAt,
    String updatedBy,
    Boolean isActive)
 {
    this.id = id;
    this.idTenant = idTenant;
    this.name = name;
    this.description = description;
    this.domain = domain;
    this.artifact = artifact;
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
    
  public String getDomain() {
    return this.domain;
  }
    
  public String setDomain(String domain) {
    return this.domain = domain;
  }    
    
  public String getArtifact() {
    return this.artifact;
  }
    
  public String setArtifact(String artifact) {
    return this.artifact = artifact;
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