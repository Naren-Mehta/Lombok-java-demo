package com.lombok.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Alian {

	@Getter @Setter
	private int age;
	
	@Getter
	private String name;
	
	@Setter
	private String tech;

}
