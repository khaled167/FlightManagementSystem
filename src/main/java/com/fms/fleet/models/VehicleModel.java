package com.fms.fleet.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

import com.fms.parameters.models.CommonObject;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class VehicleModel extends CommonObject {

}
