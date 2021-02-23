package io.github.danielpine.staging.vo;

public class Emp {
    private String name;
    private String age;
    private String salary;
    private String desc;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAge() {
	return age;
    }

    public void setAge(String age) {
	this.age = age;
    }

    public String getSalary() {
	return salary;
    }

    public void setSalary(String salary) {
	this.salary = salary;
    }

    public String getDesc() {
	return desc;
    }

    public void setDesc(String desc) {
	this.desc = desc;
    }

    public Emp(String name, String age, String salary, String desc) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.desc = desc;
    }

}
