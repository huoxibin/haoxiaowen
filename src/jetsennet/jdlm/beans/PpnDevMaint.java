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
 * 文件：jetsennet.jdlm.beans.PpnDevMaint.java
 * 日 期：Fri Dec 30 09:40:12 CST 2016
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
@ClassMapping(tableName = "PPN_DEV_MAINT", keyGenerator = "uuid")
public class PpnDevMaint implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_MAINT_CODE = "MAINT_CODE";
	public static String PROP_MAINT_DEAL_USER = "MAINT_DEAL_USER";
	public static String PROP_MAINT_DESC = "MAINT_DESC";
	public static String PROP_MAINT_END_TIME = "MAINT_END_TIME";
	public static String PROP_MAINT_FEE_DESC = "MAINT_FEE_DESC";
	public static String PROP_MAINT_FEE_STATUS = "MAINT_FEE_STATUS";
	public static String PROP_MAINT_FIELD1 = "MAINT_FIELD1";
	public static String PROP_MAINT_ID = "MAINT_ID";
	public static String PROP_MAINT_REASON = "MAINT_REASON";
	public static String PROP_MAINT_REQ_TIME = "MAINT_REQ_TIME";
	public static String PROP_MAINT_REQ_UNIT_NAME = "MAINT_REQ_UNIT_NAME";
	public static String PROP_MAINT_REQ_USER = "MAINT_REQ_USER";
	public static String PROP_MAINT_REQ_USER_TEL = "MAINT_REQ_USER_TEL";
	public static String PROP_MAINT_STATION = "MAINT_STATION";
	public static String PROP_MAINT_STATUS = "MAINT_STATUS";
	public static String PROP_MAINT_TOTAL_FEE = "MAINT_TOTAL_FEE";
	public static String PROP_MAINT_TYPE = "MAINT_TYPE";
	
	/** primary key field of maintId */
	@FieldMapping(columnName = "MAINT_ID", columnType = 12, primary = true)
	private String maintId;
	@FieldMapping(columnName = "MAINT_CODE", columnType = 12)
	private String maintCode;
	@FieldMapping(columnName = "MAINT_DEAL_USER", columnType = 12)
	private String maintDealUser;
	@FieldMapping(columnName = "MAINT_DESC", columnType = 12)
	private String maintDesc;
	@FieldMapping(columnName = "MAINT_END_TIME", columnType = 93)
	private Date maintEndTime;
	@FieldMapping(columnName = "MAINT_FEE_DESC", columnType = 12)
	private String maintFeeDesc;
	@FieldMapping(columnName = "MAINT_FEE_STATUS", columnType = 2)
	private Integer maintFeeStatus;
	@FieldMapping(columnName = "MAINT_FIELD1", columnType = 12)
	private String maintField1;
	@FieldMapping(columnName = "MAINT_REASON", columnType = 12)
	private String maintReason;
	@FieldMapping(columnName = "MAINT_REQ_TIME", columnType = 93)
	private Date maintReqTime;
	@FieldMapping(columnName = "MAINT_REQ_UNIT_NAME", columnType = 12)
	private String maintReqUnitName;
	@FieldMapping(columnName = "MAINT_REQ_USER", columnType = 12)
	private String maintReqUser;
	@FieldMapping(columnName = "MAINT_REQ_USER_TEL", columnType = 12)
	private String maintReqUserTel;
	@FieldMapping(columnName = "MAINT_STATION", columnType = 12)
	private String maintStation;
	@FieldMapping(columnName = "MAINT_STATUS", columnType = 2)
	private Integer maintStatus;
	@FieldMapping(columnName = "MAINT_TOTAL_FEE", columnType = 2)
	private Integer maintTotalFee;
	@FieldMapping(columnName = "MAINT_TYPE", columnType = 12)
	private String maintType;
	
	public PpnDevMaint() {
		super();
	}

	public PpnDevMaint(String maintId) {
		this.maintId = maintId;
	}

	public PpnDevMaint(String maintCode, String maintReason, Date maintReqTime, String maintReqUser, Integer maintStatus, String maintType) {
		this.maintCode = maintCode;
		this.maintReason = maintReason;
		this.maintReqTime = maintReqTime;
		this.maintReqUser = maintReqUser;
		this.maintStatus = maintStatus;
		this.maintType = maintType;
	}

	/**
	 * @return the maintCode
	 */
	public String getMaintCode() {
		return this.maintCode;
	}
	
	/**
	 * @param maintCode the maintCode to set
	 */
	public void setMaintCode(String value) {
		this.maintCode = value;
	}

	/**
	 * @return the maintDealUser
	 */
	public String getMaintDealUser() {
		return this.maintDealUser;
	}
	
	/**
	 * @param maintDealUser the maintDealUser to set
	 */
	public void setMaintDealUser(String value) {
		this.maintDealUser = value;
	}

	/**
	 * @return the maintDesc
	 */
	public String getMaintDesc() {
		return this.maintDesc;
	}
	
	/**
	 * @param maintDesc the maintDesc to set
	 */
	public void setMaintDesc(String value) {
		this.maintDesc = value;
	}

	/**
	 * @return the maintEndTime
	 */
	public Date getMaintEndTime() {
		return this.maintEndTime;
	}
	
	/**
	 * @param maintEndTime the maintEndTime to set
	 */
	public void setMaintEndTime(Date value) {
		this.maintEndTime = value;
	}

	/**
	 * @return the maintFeeDesc
	 */
	public String getMaintFeeDesc() {
		return this.maintFeeDesc;
	}
	
	/**
	 * @param maintFeeDesc the maintFeeDesc to set
	 */
	public void setMaintFeeDesc(String value) {
		this.maintFeeDesc = value;
	}

	/**
	 * @return the maintFeeStatus
	 */
	public Integer getMaintFeeStatus() {
		return this.maintFeeStatus;
	}
	
	/**
	 * @param maintFeeStatus the maintFeeStatus to set
	 */
	public void setMaintFeeStatus(Integer value) {
		this.maintFeeStatus = value;
	}

	/**
	 * @return the maintField1
	 */
	public String getMaintField1() {
		return this.maintField1;
	}
	
	/**
	 * @param maintField1 the maintField1 to set
	 */
	public void setMaintField1(String value) {
		this.maintField1 = value;
	}

	/**
	 * @return the maintId
	 */
	public String getMaintId() {
		return this.maintId;
	}
	
	/**
	 * @param maintId the maintId to set
	 */
	public void setMaintId(String value) {
		this.maintId = value;
	}

	/**
	 * @return the maintReason
	 */
	public String getMaintReason() {
		return this.maintReason;
	}
	
	/**
	 * @param maintReason the maintReason to set
	 */
	public void setMaintReason(String value) {
		this.maintReason = value;
	}

	/**
	 * @return the maintReqTime
	 */
	public Date getMaintReqTime() {
		return this.maintReqTime;
	}
	
	/**
	 * @param maintReqTime the maintReqTime to set
	 */
	public void setMaintReqTime(Date value) {
		this.maintReqTime = value;
	}

	/**
	 * @return the maintReqUnitName
	 */
	public String getMaintReqUnitName() {
		return this.maintReqUnitName;
	}
	
	/**
	 * @param maintReqUnitName the maintReqUnitName to set
	 */
	public void setMaintReqUnitName(String value) {
		this.maintReqUnitName = value;
	}

	/**
	 * @return the maintReqUser
	 */
	public String getMaintReqUser() {
		return this.maintReqUser;
	}
	
	/**
	 * @param maintReqUser the maintReqUser to set
	 */
	public void setMaintReqUser(String value) {
		this.maintReqUser = value;
	}

	/**
	 * @return the maintReqUserTel
	 */
	public String getMaintReqUserTel() {
		return this.maintReqUserTel;
	}
	
	/**
	 * @param maintReqUserTel the maintReqUserTel to set
	 */
	public void setMaintReqUserTel(String value) {
		this.maintReqUserTel = value;
	}

	/**
	 * @return the maintStation
	 */
	public String getMaintStation() {
		return this.maintStation;
	}
	
	/**
	 * @param maintStation the maintStation to set
	 */
	public void setMaintStation(String value) {
		this.maintStation = value;
	}

	/**
	 * @return the maintStatus
	 */
	public Integer getMaintStatus() {
		return this.maintStatus;
	}
	
	/**
	 * @param maintStatus the maintStatus to set
	 */
	public void setMaintStatus(Integer value) {
		this.maintStatus = value;
	}

	/**
	 * @return the maintTotalFee
	 */
	public Integer getMaintTotalFee() {
		return this.maintTotalFee;
	}
	
	/**
	 * @param maintTotalFee the maintTotalFee to set
	 */
	public void setMaintTotalFee(Integer value) {
		this.maintTotalFee = value;
	}

	/**
	 * @return the maintType
	 */
	public String getMaintType() {
		return this.maintType;
	}
	
	/**
	 * @param maintType the maintType to set
	 */
	public void setMaintType(String value) {
		this.maintType = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnDevMaint)) {
			return false;
		}
		PpnDevMaint other = (PpnDevMaint)o;
		if (null == this.maintId) {
			if (other.maintId != null)
				return false;
		} else if (!this.maintId.equals(other.maintId))
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
		result = prime * result + ((maintId == null) ? 0 : maintId.hashCode());
		return result;
	}
	
}