package com.model;

public class ExchangeApi {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column exchange_api.id
	 * 
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column exchange_api.id_exchange
	 * 
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	private Integer idExchange;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column exchange_api.api_url
	 * 
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	private String apiUrl;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column exchange_api.id
	 * 
	 * @return the value of exchange_api.id
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column exchange_api.id
	 * 
	 * @param id
	 *            the value for exchange_api.id
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column exchange_api.id_exchange
	 * 
	 * @return the value of exchange_api.id_exchange
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	public Integer getIdExchange() {
		return idExchange;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column exchange_api.id_exchange
	 * 
	 * @param idExchange
	 *            the value for exchange_api.id_exchange
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	public void setIdExchange(Integer idExchange) {
		this.idExchange = idExchange;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column exchange_api.api_url
	 * 
	 * @return the value of exchange_api.api_url
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	public String getApiUrl() {
		return apiUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column exchange_api.api_url
	 * 
	 * @param apiUrl
	 *            the value for exchange_api.api_url
	 * @mbg.generated Tue Jan 09 18:29:23 CET 2018
	 */
	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExchangeApi [id=").append(id).append(", idExchange=").append(idExchange).append(", apiUrl=")
				.append(apiUrl).append("]");
		return builder.toString();
	}

}