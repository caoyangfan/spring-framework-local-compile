package org.springframework.learning;

public class User {

	private String username;
	private Integer age;
	private String sex;
	private double weight;
	private double height;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				", weight=" + weight +
				"kg , height=" + height +
				"cm}";
	}
}
