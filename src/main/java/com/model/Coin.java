package com.model;

public class Coin {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coin.id
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coin.name
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coin.short_name
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	private String shortName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coin.id
	 * @return  the value of coin.id
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coin.id
	 * @param id  the value for coin.id
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coin.name
	 * @return  the value of coin.name
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coin.name
	 * @param name  the value for coin.name
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coin.short_name
	 * @return  the value of coin.short_name
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coin.short_name
	 * @param shortName  the value for coin.short_name
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
}