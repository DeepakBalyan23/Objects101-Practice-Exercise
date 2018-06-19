package com.stackroute.exercise1;

import java.math.BigDecimal;

/*Member variable class to initialize Member class*/

public class MemberVariable {

	/*createMemberInstance() creates an object of Member class and return that object*/
	
	public Member createMemberInstance(String name, int age, BigDecimal salary) {
		return new Member(name, age, salary);
	}
}
