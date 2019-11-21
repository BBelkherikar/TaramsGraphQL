package com.tarams.graphql.vo;

import lombok.Data;
import com.tarams.graphql.enums.Animal;

@Data
public class Pet {
    private long id;

    private String name;

    private Animal type;

    private int age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getType() {
		return type;
	}

	public void setType(Animal type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	
	
    
    
}