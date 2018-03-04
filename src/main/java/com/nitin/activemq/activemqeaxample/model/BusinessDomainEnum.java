package com.nitin.activemq.activemqeaxample.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = BusinessDomainEnum.class)
public enum BusinessDomainEnum {

	Customer, Ordering, Repair

}
