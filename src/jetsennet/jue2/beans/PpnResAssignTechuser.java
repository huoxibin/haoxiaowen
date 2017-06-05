/*
 * Copyright 2010-2016 the original author or authors.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 文件：jetsennet.jue2.beans.PpnResAssignTechuser.java
 * 日 期：Thu Aug 04 14:46:54 CST 2016
 */
package jetsennet.jue2.beans;

import java.io.Serializable;
import java.util.Date;
import org.uorm.orm.annotation.ClassMapping;
import org.uorm.orm.annotation.FieldMapping;

/**
 *
 * this file is generated by the uorm pojo tools.
 *
 * @author <a href="mailto:xunchangguo@gmail.com">郭训常</a>
 * @version 1.0.0
 */
@ClassMapping(tableName = "PPN_RES_ASSIGN_TECHUSER", keyGenerator = "uuid")
public class PpnResAssignTechuser implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_ASSIGN_ID = "ASSIGN_ID";
	public static String PROP_TU_CREATE_TIME = "TU_CREATE_TIME";
	public static String PROP_TU_CREATE_USER = "TU_CREATE_USER";
	public static String PROP_TU_FIELD1 = "TU_FIELD1";
	public static String PROP_TU_FIELD2 = "TU_FIELD2";
	public static String PROP_TU_ID = "TU_ID";
	public static String PROP_TU_REMARK = "TU_REMARK";
	public static String PROP_TU_STATUS = "TU_STATUS";
	public static String PROP_TU_TYPE = "TU_TYPE";
	public static String PROP_TU_USERCODE = "TU_USERCODE";
	
	/** primary key field of tuId */
	@FieldMapping(columnName = "TU_ID", columnType = 12, primary = true)
	private String tuId;
	/** foreign key field of PPN_RES_ASSIGNMENT.ASSIGN_ID */
	@FieldMapping(columnName = "ASSIGN_ID", columnType = 12)
	private String assignId;
	@FieldMapping(columnName = "TU_CREATE_TIME", columnType = 93)
	private Date tuCreateTime;
	@FieldMapping(columnName = "TU_CREATE_USER", columnType = 12)
	private String tuCreateUser;
	@FieldMapping(columnName = "TU_FIELD1", columnType = 12)
	private String tuField1;
	@FieldMapping(columnName = "TU_FIELD2", columnType = 12)
	private String tuField2;
	@FieldMapping(columnName = "TU_REMARK", columnType = 12)
	private String tuRemark;
	@FieldMapping(columnName = "TU_STATUS", columnType = 2)
	private Integer tuStatus;
	@FieldMapping(columnName = "TU_TYPE", columnType = 2)
	private Integer tuType;
	@FieldMapping(columnName = "TU_USERCODE", columnType = 12)
	private String tuUsercode;
	
	public PpnResAssignTechuser() {
		super();
	}

	public PpnResAssignTechuser(String tuId) {
		this.tuId = tuId;
	}

	/**
	 * @return the assignId
	 */
	public String getAssignId() {
		return this.assignId;
	}
	
	/**
	 * @param assignId the assignId to set
	 */
	public void setAssignId(String value) {
		this.assignId = value;
	}

	/**
	 * @return the tuCreateTime
	 */
	public Date getTuCreateTime() {
		return this.tuCreateTime;
	}
	
	/**
	 * @param tuCreateTime the tuCreateTime to set
	 */
	public void setTuCreateTime(Date value) {
		this.tuCreateTime = value;
	}

	/**
	 * @return the tuCreateUser
	 */
	public String getTuCreateUser() {
		return this.tuCreateUser;
	}
	
	/**
	 * @param tuCreateUser the tuCreateUser to set
	 */
	public void setTuCreateUser(String value) {
		this.tuCreateUser = value;
	}

	/**
	 * @return the tuField1
	 */
	public String getTuField1() {
		return this.tuField1;
	}
	
	/**
	 * @param tuField1 the tuField1 to set
	 */
	public void setTuField1(String value) {
		this.tuField1 = value;
	}

	/**
	 * @return the tuField2
	 */
	public String getTuField2() {
		return this.tuField2;
	}
	
	/**
	 * @param tuField2 the tuField2 to set
	 */
	public void setTuField2(String value) {
		this.tuField2 = value;
	}

	/**
	 * @return the tuId
	 */
	public String getTuId() {
		return this.tuId;
	}
	
	/**
	 * @param tuId the tuId to set
	 */
	public void setTuId(String value) {
		this.tuId = value;
	}

	/**
	 * @return the tuRemark
	 */
	public String getTuRemark() {
		return this.tuRemark;
	}
	
	/**
	 * @param tuRemark the tuRemark to set
	 */
	public void setTuRemark(String value) {
		this.tuRemark = value;
	}

	/**
	 * @return the tuStatus
	 */
	public Integer getTuStatus() {
		return this.tuStatus;
	}
	
	/**
	 * @param tuStatus the tuStatus to set
	 */
	public void setTuStatus(Integer value) {
		this.tuStatus = value;
	}

	/**
	 * @return the tuType
	 */
	public Integer getTuType() {
		return this.tuType;
	}
	
	/**
	 * @param tuType the tuType to set
	 */
	public void setTuType(Integer value) {
		this.tuType = value;
	}

	/**
	 * @return the tuUsercode
	 */
	public String getTuUsercode() {
		return this.tuUsercode;
	}
	
	/**
	 * @param tuUsercode the tuUsercode to set
	 */
	public void setTuUsercode(String value) {
		this.tuUsercode = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnResAssignTechuser)) {
			return false;
		}
		PpnResAssignTechuser other = (PpnResAssignTechuser)o;
		if (null == this.tuId) {
			if (other.tuId != null)
				return false;
		} else if (!this.tuId.equals(other.tuId))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tuId == null) ? 0 : tuId.hashCode());
		return result;
	}
	
}