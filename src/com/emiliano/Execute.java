package com.emiliano;

import lombok.val;

public class Execute {

	public static void main(String[] args) {
		
		val user = new User();
		
		user.setname("Juan");
		
		System.out.println(user.getname());
		
		
	}

}
