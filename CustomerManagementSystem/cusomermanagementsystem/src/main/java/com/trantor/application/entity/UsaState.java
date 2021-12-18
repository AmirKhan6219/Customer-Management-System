package com.trantor.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USA_STATE_TBL")
public class UsaState {
	
	@Id
	@Column(name = "state_no")
	private Integer state_No;
	
	@Column(name = "state_name")
	private String state_Name;

}
