package com.norpactech.pf.build.model;
/**
 * © 2025 Northern Pacific Technologies, LLC. All Rights Reserved. 
 *  
 * For license details, see the LICENSE file in this project root.
 */
import java.util.UUID;
/**
 * API Model Class: ProjectComponentOmit - M:M Project Component/Data Object
 */
public class ProjectComponentOmit {

  private UUID idProjectComponent;
  private UUID idDataObject;

  public ProjectComponentOmit () {}

  public ProjectComponentOmit (
    UUID idProjectComponent,
    UUID idDataObject)
 {
    this.idProjectComponent = idProjectComponent;
    this.idDataObject = idDataObject;
  }

  // Getters and Setters...
    
  public UUID getIdProjectComponent() {
    return this.idProjectComponent;
  }
    
  public UUID setIdProjectComponent(UUID idProjectComponent) {
    return this.idProjectComponent = idProjectComponent;
  }    
    
  public UUID getIdDataObject() {
    return this.idDataObject;
  }
    
  public UUID setIdDataObject(UUID idDataObject) {
    return this.idDataObject = idDataObject;
  }    
}