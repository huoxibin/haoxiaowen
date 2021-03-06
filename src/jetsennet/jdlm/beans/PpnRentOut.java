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
 * 文件：jetsennet.jue2.beans.PpnRentOut.java
 * 日 期：Thu Dec 15 11:34:25 CST 2016
 */
package jetsennet.jdlm.beans;

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
@ClassMapping(tableName = "PPN_RENT_OUT", keyGenerator = "uuid")
public class PpnRentOut implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_ORD_CODE = "ORD_CODE";
	public static String PROP_OUT_CHECK_DESC = "OUT_CHECK_DESC";
	public static String PROP_OUT_CHECK_TIME = "OUT_CHECK_TIME";
	public static String PROP_OUT_CHECK_USER = "OUT_CHECK_USER";
	public static String PROP_OUT_CODE = "OUT_CODE";
	public static String PROP_OUT_COLN_CODE = "OUT_COLN_CODE";
	public static String PROP_OUT_CREATE_TIME = "OUT_CREATE_TIME";
	public static String PROP_OUT_DEPT_CODE = "OUT_DEPT_CODE";
	public static String PROP_OUT_DESC = "OUT_DESC";
	public static String PROP_OUT_END_TIME = "OUT_END_TIME";
	public static String PROP_OUT_FIELD1 = "OUT_FIELD1";
	public static String PROP_OUT_FIELD2 = "OUT_FIELD2";
	public static String PROP_OUT_ID = "OUT_ID";
	public static String PROP_OUT_KEEPER = "OUT_KEEPER";
	public static String PROP_OUT_NAME = "OUT_NAME";
	public static String PROP_OUT_START_TIME = "OUT_START_TIME";
	public static String PROP_OUT_STATUS = "OUT_STATUS";
	public static String PROP_OUT_TYPE = "OUT_TYPE";
	public static String PROP_OUT_USER = "OUT_USER";
	public static String PROP_OUT_USER_NAME = "OUT_USER_NAME";
	public static String PROP_OUT_USER_TEL = "OUT_USER_TEL";
	
	/** primary key field of outId */
	@FieldMapping(columnName = "OUT_ID", columnType = 12, primary = true)
	private String outId;
	@FieldMapping(columnName = "ORD_CODE", columnType = 12)
	private String ordCode;
	@FieldMapping(columnName = "OUT_CHECK_DESC", columnType = 12)
	private String outCheckDesc;
	@FieldMapping(columnName = "OUT_CHECK_TIME", columnType = 93)
	private Date outCheckTime;
	@FieldMapping(columnName = "OUT_CHECK_USER", columnType = 12)
	private String outCheckUser;
	@FieldMapping(columnName = "OUT_CODE", columnType = 12)
	private String outCode;
	@FieldMapping(columnName = "OUT_COLN_CODE", columnType = 12)
	private String outColnCode;
	@FieldMapping(columnName = "OUT_CREATE_TIME", columnType = 93)
	private Date outCreateTime;
	@FieldMapping(columnName = "OUT_DEPT_CODE", columnType = 12)
	private String outDeptCode;
	@FieldMapping(columnName = "OUT_DESC", columnType = 12)
	private String outDesc;
	@FieldMapping(columnName = "OUT_END_TIME", columnType = 93)
	private Date outEndTime;
	@FieldMapping(columnName = "OUT_FIELD1", columnType = 12)
	private String outField1;
	@FieldMapping(columnName = "OUT_FIELD2", columnType = 12)
	private String outField2;
	@FieldMapping(columnName = "OUT_KEEPER", columnType = 12)
	private String outKeeper;
	@FieldMapping(columnName = "OUT_NAME", columnType = 12)
	private String outName;
	@FieldMapping(columnName = "OUT_START_TIME", columnType = 93)
	private Date outStartTime;
	@FieldMapping(columnName = "OUT_STATUS", columnType = 2)
	private Integer outStatus;
	@FieldMapping(columnName = "OUT_TYPE", columnType = 2)
	private Integer outType;
	@FieldMapping(columnName = "OUT_USER", columnType = 12)
	private String outUser;
	@FieldMapping(columnName = "OUT_USER_NAME", columnType = 12)
	private String outUserName;
	@FieldMapping(columnName = "OUT_USER_TEL", columnType = 12)
	private String outUserTel;
	
	public PpnRentOut() {
		super();
	}

	public PpnRentOut(String outId) {
		this.outId = outId;
	}

	/**
	 * @return the ordCode
	 */
	public String getOrdCode() {
		return this.ordCode;
	}
	
	/**
	 * @param ordCode the ordCode to set
	 */
	public void setOrdCode(String value) {
		this.ordCode = value;
	}

	/**
	 * @return the outCheckDesc
	 */
	public String getOutCheckDesc() {
		return this.outCheckDesc;
	}
	
	/**
	 * @param outCheckDesc the outCheckDesc to set
	 */
	public void setOutCheckDesc(String value) {
		this.outCheckDesc = value;
	}

	/**
	 * @return the outCheckTime
	 */
	public Date getOutCheckTime() {
		return this.outCheckTime;
	}
	
	/**
	 * @param outCheckTime the outCheckTime to set
	 */
	public void setOutCheckTime(Date value) {
		this.outCheckTime = value;
	}

	/**
	 * @return the outCheckUser
	 */
	public String getOutCheckUser() {
		return this.outCheckUser;
	}
	
	/**
	 * @param outCheckUser the outCheckUser to set
	 */
	public void setOutCheckUser(String value) {
		this.outCheckUser = value;
	}

	/**
	 * @return the outCode
	 */
	public String getOutCode() {
		return this.outCode;
	}
	
	/**
	 * @param outCode the outCode to set
	 */
	public void setOutCode(String value) {
		this.outCode = value;
	}

	/**
	 * @return the outColnCode
	 */
	public String getOutColnCode() {
		return this.outColnCode;
	}
	
	/**
	 * @param outColnCode the outColnCode to set
	 */
	public void setOutColnCode(String value) {
		this.outColnCode = value;
	}

	/**
	 * @return the outCreateTime
	 */
	public Date getOutCreateTime() {
		return this.outCreateTime;
	}
	
	/**
	 * @param outCreateTime the outCreateTime to set
	 */
	public void setOutCreateTime(Date value) {
		this.outCreateTime = value;
	}

	/**
	 * @return the outDeptCode
	 */
	public String getOutDeptCode() {
		return this.outDeptCode;
	}
	
	/**
	 * @param outDeptCode the outDeptCode to set
	 */
	public void setOutDeptCode(String value) {
		this.outDeptCode = value;
	}

	/**
	 * @return the outDesc
	 */
	public String getOutDesc() {
		return this.outDesc;
	}
	
	/**
	 * @param outDesc the outDesc to set
	 */
	public void setOutDesc(String value) {
		this.outDesc = value;
	}

	/**
	 * @return the outEndTime
	 */
	public Date getOutEndTime() {
		return this.outEndTime;
	}
	
	/**
	 * @param outEndTime the outEndTime to set
	 */
	public void setOutEndTime(Date value) {
		this.outEndTime = value;
	}

	/**
	 * @return the outField1
	 */
	public String getOutField1() {
		return this.outField1;
	}
	
	/**
	 * @param outField1 the outField1 to set
	 */
	public void setOutField1(String value) {
		this.outField1 = value;
	}

	/**
	 * @return the outField2
	 */
	public String getOutField2() {
		return this.outField2;
	}
	
	/**
	 * @param outField2 the outField2 to set
	 */
	public void setOutField2(String value) {
		this.outField2 = value;
	}

	/**
	 * @return the outId
	 */
	public String getOutId() {
		return this.outId;
	}
	
	/**
	 * @param outId the outId to set
	 */
	public void setOutId(String value) {
		this.outId = value;
	}

	/**
	 * @return the outKeeper
	 */
	public String getOutKeeper() {
		return this.outKeeper;
	}
	
	/**
	 * @param outKeeper the outKeeper to set
	 */
	public void setOutKeeper(String value) {
		this.outKeeper = value;
	}

	/**
	 * @return the outName
	 */
	public String getOutName() {
		return this.outName;
	}
	
	/**
	 * @param outName the outName to set
	 */
	public void setOutName(String value) {
		this.outName = value;
	}

	/**
	 * @return the outStartTime
	 */
	public Date getOutStartTime() {
		return this.outStartTime;
	}
	
	/**
	 * @param outStartTime the outStartTime to set
	 */
	public void setOutStartTime(Date value) {
		this.outStartTime = value;
	}

	/**
	 * @return the outStatus
	 */
	public Integer getOutStatus() {
		return this.outStatus;
	}
	
	/**
	 * @param outStatus the outStatus to set
	 */
	public void setOutStatus(Integer value) {
		this.outStatus = value;
	}

	/**
	 * @return the outType
	 */
	public Integer getOutType() {
		return this.outType;
	}
	
	/**
	 * @param outType the outType to set
	 */
	public void setOutType(Integer value) {
		this.outType = value;
	}

	/**
	 * @return the outUser
	 */
	public String getOutUser() {
		return this.outUser;
	}
	
	/**
	 * @param outUser the outUser to set
	 */
	public void setOutUser(String value) {
		this.outUser = value;
	}

	/**
	 * @return the outUserName
	 */
	public String getOutUserName() {
		return this.outUserName;
	}
	
	/**
	 * @param outUserName the outUserName to set
	 */
	public void setOutUserName(String value) {
		this.outUserName = value;
	}

	/**
	 * @return the outUserTel
	 */
	public String getOutUserTel() {
		return this.outUserTel;
	}
	
	/**
	 * @param outUserTel the outUserTel to set
	 */
	public void setOutUserTel(String value) {
		this.outUserTel = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnRentOut)) {
			return false;
		}
		PpnRentOut other = (PpnRentOut)o;
		if (null == this.outId) {
			if (other.outId != null)
				return false;
		} else if (!this.outId.equals(other.outId))
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
		result = prime * result + ((outId == null) ? 0 : outId.hashCode());
		return result;
	}
	
}