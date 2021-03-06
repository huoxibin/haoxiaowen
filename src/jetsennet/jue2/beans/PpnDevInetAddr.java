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
 * 文件：jetsennet.jue2.beans.PpnDevInetAddr.java
 * 日 期：Mon Sep 12 14:02:26 CST 2016
 */
package jetsennet.jue2.beans;

import java.io.Serializable;
import org.uorm.orm.annotation.ClassMapping;
import org.uorm.orm.annotation.FieldMapping;

/**
 *
 * this file is generated by the uorm pojo tools.
 *
 * @author <a href="mailto:xunchangguo@gmail.com">郭训常</a>
 * @version 1.0.0
 */
@ClassMapping(tableName = "PPN_DEV_INET_ADDR", keyGenerator = "uuid")
public class PpnDevInetAddr implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_ADDR_CODE = "ADDR_CODE";
	public static String PROP_ADDR_FIELD1 = "ADDR_FIELD1";
	public static String PROP_ADDR_FIELD2 = "ADDR_FIELD2";
	public static String PROP_ADDR_ID = "ADDR_ID";
	public static String PROP_ADDR_IP = "ADDR_IP";
	public static String PROP_ADDR_IS_KEY = "ADDR_IS_KEY";
	public static String PROP_ADDR_MAC = "ADDR_MAC";
	public static String PROP_ADDR_MASK = "ADDR_MASK";
	public static String PROP_ADDR_NAME = "ADDR_NAME";
	public static String PROP_ADDR_STATUS = "ADDR_STATUS";
	public static String PROP_ADDR_TYPE = "ADDR_TYPE";
	public static String PROP_DEV_ID = "DEV_ID";
	
	/** primary key field of addrId */
	@FieldMapping(columnName = "ADDR_ID", columnType = 12, primary = true)
	private String addrId;
	@FieldMapping(columnName = "ADDR_CODE", columnType = 12)
	private String addrCode;
	@FieldMapping(columnName = "ADDR_FIELD1", columnType = 12)
	private String addrField1;
	@FieldMapping(columnName = "ADDR_FIELD2", columnType = 12)
	private String addrField2;
	@FieldMapping(columnName = "ADDR_IP", columnType = 12)
	private String addrIp;
	@FieldMapping(columnName = "ADDR_IS_KEY", columnType = 2)
	private Integer addrIsKey;
	@FieldMapping(columnName = "ADDR_MAC", columnType = 12)
	private String addrMac;
	@FieldMapping(columnName = "ADDR_MASK", columnType = 12)
	private String addrMask;
	@FieldMapping(columnName = "ADDR_NAME", columnType = 12)
	private String addrName;
	@FieldMapping(columnName = "ADDR_STATUS", columnType = 2)
	private Integer addrStatus;
	@FieldMapping(columnName = "ADDR_TYPE", columnType = 2)
	private Integer addrType;
	/** foreign key field of PPN_DEV_DEVICE.DEV_ID */
	@FieldMapping(columnName = "DEV_ID", columnType = 12)
	private String devId;
	
	public PpnDevInetAddr() {
		super();
	}

	public PpnDevInetAddr(String addrId) {
		this.addrId = addrId;
	}

	public PpnDevInetAddr(String addrCode, String addrIp, Integer addrIsKey, String addrMac, Integer addrStatus, String devId) {
		this.addrCode = addrCode;
		this.addrIp = addrIp;
		this.addrIsKey = addrIsKey;
		this.addrMac = addrMac;
		this.addrStatus = addrStatus;
		this.devId = devId;
	}

	/**
	 * @return the addrCode
	 */
	public String getAddrCode() {
		return this.addrCode;
	}
	
	/**
	 * @param addrCode the addrCode to set
	 */
	public void setAddrCode(String value) {
		this.addrCode = value;
	}

	/**
	 * @return the addrField1
	 */
	public String getAddrField1() {
		return this.addrField1;
	}
	
	/**
	 * @param addrField1 the addrField1 to set
	 */
	public void setAddrField1(String value) {
		this.addrField1 = value;
	}

	/**
	 * @return the addrField2
	 */
	public String getAddrField2() {
		return this.addrField2;
	}
	
	/**
	 * @param addrField2 the addrField2 to set
	 */
	public void setAddrField2(String value) {
		this.addrField2 = value;
	}

	/**
	 * @return the addrId
	 */
	public String getAddrId() {
		return this.addrId;
	}
	
	/**
	 * @param addrId the addrId to set
	 */
	public void setAddrId(String value) {
		this.addrId = value;
	}

	/**
	 * @return the addrIp
	 */
	public String getAddrIp() {
		return this.addrIp;
	}
	
	/**
	 * @param addrIp the addrIp to set
	 */
	public void setAddrIp(String value) {
		this.addrIp = value;
	}

	/**
	 * @return the addrIsKey
	 */
	public Integer getAddrIsKey() {
		return this.addrIsKey;
	}
	
	/**
	 * @param addrIsKey the addrIsKey to set
	 */
	public void setAddrIsKey(Integer value) {
		this.addrIsKey = value;
	}

	/**
	 * @return the addrMac
	 */
	public String getAddrMac() {
		return this.addrMac;
	}
	
	/**
	 * @param addrMac the addrMac to set
	 */
	public void setAddrMac(String value) {
		this.addrMac = value;
	}

	/**
	 * @return the addrMask
	 */
	public String getAddrMask() {
		return this.addrMask;
	}
	
	/**
	 * @param addrMask the addrMask to set
	 */
	public void setAddrMask(String value) {
		this.addrMask = value;
	}

	/**
	 * @return the addrName
	 */
	public String getAddrName() {
		return this.addrName;
	}
	
	/**
	 * @param addrName the addrName to set
	 */
	public void setAddrName(String value) {
		this.addrName = value;
	}

	/**
	 * @return the addrStatus
	 */
	public Integer getAddrStatus() {
		return this.addrStatus;
	}
	
	/**
	 * @param addrStatus the addrStatus to set
	 */
	public void setAddrStatus(Integer value) {
		this.addrStatus = value;
	}

	/**
	 * @return the addrType
	 */
	public Integer getAddrType() {
		return this.addrType;
	}
	
	/**
	 * @param addrType the addrType to set
	 */
	public void setAddrType(Integer value) {
		this.addrType = value;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnDevInetAddr)) {
			return false;
		}
		PpnDevInetAddr other = (PpnDevInetAddr)o;
		if (null == this.addrId) {
			if (other.addrId != null)
				return false;
		} else if (!this.addrId.equals(other.addrId))
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
		result = prime * result + ((addrId == null) ? 0 : addrId.hashCode());
		return result;
	}
	
}