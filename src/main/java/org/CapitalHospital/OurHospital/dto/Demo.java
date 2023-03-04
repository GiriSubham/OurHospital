package org.CapitalHospital.OurHospital.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Demo {
	@Id
  private int id;
  private String name; 
  
	
}
