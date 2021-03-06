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
 * 文件：jetsennet.jue2.beans.PpnDevDevice.java
 * 日 期：Thu Dec 29 15:45:43 CST 2016
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
@ClassMapping(tableName = "PPN_DEV_DEVICE", keyGenerator = "uuid")
public class PpnDevDevice implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_DEV_CODE = "DEV_CODE";
	public static String PROP_DEV_CREATE_TIME = "DEV_CREATE_TIME";
	public static String PROP_DEV_DESC = "DEV_DESC";
	public static String PROP_DEV_FIELD1 = "DEV_FIELD1";
	public static String PROP_DEV_FIELD2 = "DEV_FIELD2";
	public static String PROP_DEV_HOST_NAME = "DEV_HOST_NAME";
	public static String PROP_DEV_ID = "DEV_ID";
	public static String PROP_DEV_IS_INET = "DEV_IS_INET";
	public static String PROP_DEV_LOCATION = "DEV_LOCATION";
	public static String PROP_DEV_MAC_ADDRESS = "DEV_MAC_ADDRESS";
	public static String PROP_DEV_NAME = "DEV_NAME";
	public static String PROP_DEV_STATUS = "DEV_STATUS";
	public static String PROP_DEV_TYPE = "DEV_TYPE";
	public static String PROP_DEV_USER = "DEV_USER";
	
	/** primary key field of devId */
	@FieldMapping(columnName = "DEV_ID", columnType = 12, primary = true)
	private String devId;
	@FieldMapping(columnName = "DEV_CODE", columnType = 12)
	private String devCode;
	@FieldMapping(columnName = "DEV_CREATE_TIME", columnType = 93)
	private Date devCreateTime;
	@FieldMapping(columnName = "DEV_DESC", columnType = 12)
	private String devDesc;
	@FieldMapping(columnName = "DEV_FIELD1", columnType = 12)
	private String devField1;
	@FieldMapping(columnName = "DEV_FIELD2", columnType = 12)
	private String devField2;
	@FieldMapping(columnName = "DEV_HOST_NAME", columnType = 12)
	private String devHostName;
	@FieldMapping(columnName = "DEV_IS_INET", columnType = 2)
	private Integer devIsInet;
	@FieldMapping(columnName = "DEV_LOCATION", columnType = 12)
	private String devLocation;
	@FieldMapping(columnName = "DEV_MAC_ADDRESS", columnType = 12)
	private String devMacAddress;
	@FieldMapping(columnName = "DEV_NAME", columnType = 12)
	private String devName;
	@FieldMapping(columnName = "DEV_STATUS", columnType = 2)
	private Integer devStatus;
	@FieldMapping(columnName = "DEV_TYPE", columnType = 12)
	private String devType;
	@FieldMapping(columnName = "DEV_USER", columnType = 12)
	private String devUser;
	
	public PpnDevDevice() {
		super();
	}

	public PpnDevDevice(String devId) {
		this.devId = devId;
	}

	public PpnDevDevice(Date devCreateTime, Integer devIsInet, String devName, Integer devStatus, String devType) {
		this.devCreateTime = devCreateTime;
		this.devIsInet = devIsInet;
		this.devName = devName;
		this.devStatus = devStatus;
		this.devType = devType;
	}

	/**
	 * @return the devCode
	 */
	public String getDevCode() {
		return this.devCode;
	}
	
	/**
	 * @param devCode the devCode to set
	 */
	public void setDevCode(String value) {
		this.devCode = value;
	}

	/**
	 * @return the devCreateTime
	 */
	public Date getDevCreateTime() {
		return this.devCreateTime;
	}
	
	/**
	 * @param devCreateTime the devCreateTime to set
	 */
	public void setDevCreateTime(Date value) {
		this.devCreateTime = value;
	}

	/**
	 * @return the devDesc
	 */
	public String getDevDesc() {
		return this.devDesc;
	}
	
	/**
	 * @param devDesc the devDesc to set
	 */
	public void setDevDesc(String value) {
		this.devDesc = value;
	}

	/**
	 * @return the devField1
	 */
	public String getDevField1() {
		return this.devField1;
	}
	
	/**
	 * @param devField1 the devField1 to set
	 */
	public void setDevField1(String value) {
		this.devField1 = value;
	}

	/**
	 * @return the devField2
	 */
	public String getDevField2() {
		return this.devField2;
	}
	
	/**
	 * @param devField2 the devField2 to set
	 */
	public void setDevField2(String value) {
		this.devField2 = value;
	}

	/**
	 * @return the devHostName
	 */
	public String getDevHostName() {
		return this.devHostName;
	}
	
	/**
	 * @param devHostName the devHostName to set
	 */
	public void setDevHostName(String value) {
		this.devHostName = value;
	}

	/**
	 * @return the devId
	 */
	public String getDevId() {
		return this.devId;
	}
	
	/**
	 * @param devId the devId to set
	 */
	public void setDevId(String value) {
		this.devId = value;
	}

	/**
	 * @return the devIsInet
	 */
	public Integer getDevIsInet() {
		return this.devIsInet;
	}
	
	/**
	 * @param devIsInet the devIsInet to set
	 */
	public void setDevIsInet(Integer value) {
		this.devIsInet = value;
	}

	/**
	 * @return the devLocation
	 */
	public String getDevLocation() {
		return this.devLocation;
	}
	
	/**
	 * @param devLocation the devLocation to set
	 */
	public void setDevLocation(String value) {
		this.devLocation = value;
	}

	/**
	 * @return the devMacAddress
	 */
	public String getDevMacAddress() {
		return this.devMacAddress;
	}
	
	/**
	 * @param devMacAddress the devMacAddress to set
	 */
	public void setDevMacAddress(String value) {
		this.devMacAddress = value;
	}

	/**
	 * @return the devName
	 */
	public String getDevName() {
		return this.devName;
	}
	
	/**
	 * @param devName the devName to set
	 */
	public void setDevName(String value) {
		this.devName = value;
	}

	/**
	 * @return the devStatus
	 */
	public Integer getDevStatus() {
		return this.devStatus;
	}
	
	/**
	 * @param devStatus the devStatus to set
	 */
	public void setDevStatus(Integer value) {
		this.devStatus = value;
	}

	/**
	 * @return the devType
	 */
	public String getDevType() {
		return this.devType;
	}
	
	/**
	 * @param devType the devType to set
	 */
	public void setDevType(String value) {
		this.devType = value;
	}

	/**
	 * @return the devUser
	 */
	public String getDevUser() {
		return this.devUser;
	}
	
	/**
	 * @param devUser the devUser to set
	 */
	public void setDevUser(String value) {
		this.devUser = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnDevDevice)) {
			return false;
		}
		PpnDevDevice other = (PpnDevDevice)o;
		if (null == this.devId) {
			if (other.devId != null)
				return false;
		} else if (!this.devId.equals(other.devId))
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
		result = prime * result + ((devId == null) ? 0 : devId.hashCode());
		return result;
	}
	
}