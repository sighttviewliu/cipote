package com.client;

import com.model.UserGroup;

public interface UserGroupMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_group
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_group
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	int insert(UserGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_group
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	int insertSelective(UserGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_group
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	UserGroup selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_group
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	int updateByPrimaryKeySelective(UserGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_group
	 * @mbg.generated  Tue Jan 09 18:29:23 CET 2018
	 */
	int updateByPrimaryKey(UserGroup record);
}