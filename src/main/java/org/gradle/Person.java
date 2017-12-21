package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
    private final String lastName;

    public Person(String name) {
        this.name = name;
        this.lastName=name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }

	public String getLastName() {
		return lastName;
	}
    
    
}
