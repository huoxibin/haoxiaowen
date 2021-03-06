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
 * 文件：jetsennet.jue2.beans.PpnRentMonCfg.java
 * 日 期：Thu Dec 29 16:57:19 CST 2016
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
@ClassMapping(tableName = "PPN_RENT_MON_CFG", keyGenerator = "uuid")
public class PpnRentMonCfg implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_BASHPATH = "BASHPATH";
	public static String PROP_CFF_CODE = "CFF_CODE";
	public static String PROP_CFG_CREATE_TIME = "CFG_CREATE_TIME";
	public static String PROP_CFG_DESC = "CFG_DESC";
	public static String PROP_CFG_FIELD1 = "CFG_FIELD1";
	public static String PROP_CFG_ID = "CFG_ID";
	public static String PROP_CFG_NANE = "CFG_NANE";
	public static String PROP_CFG_STATUS = "CFG_STATUS";
	public static String PROP_CFG_TYPE = "CFG_TYPE";
	public static String PROP_MON_SERVER_CTLPORT = "MON_SERVER_CTLPORT";
	public static String PROP_MON_SERVER_HOST = "MON_SERVER_HOST";
	public static String PROP_MON_SERVER_IMGPORT = "MON_SERVER_IMGPORT";
	public static String PROP_MON_SERVER_PORT = "MON_SERVER_PORT";
	public static String PROP_MON_SERVER_TIMER = "MON_SERVER_TIMER";
	
	/** primary key field of cfgId */
	@FieldMapping(columnName = "CFG_ID", columnType = 12, primary = true)
	private String cfgId;
	@FieldMapping(columnName = "BASHPATH", columnType = 12)
	private String bashpath;
	@FieldMapping(columnName = "CFF_CODE", columnType = 12)
	private String cffCode;
	@FieldMapping(columnName = "CFG_CREATE_TIME", columnType = 93)
	private Date cfgCreateTime;
	@FieldMapping(columnName = "CFG_DESC", columnType = 12)
	private String cfgDesc;
	@FieldMapping(columnName = "CFG_FIELD1", columnType = 12)
	private String cfgField1;
	@FieldMapping(columnName = "CFG_NANE", columnType = 12)
	private String cfgNane;
	@FieldMapping(columnName = "CFG_STATUS", columnType = 2)
	private Integer cfgStatus;
	@FieldMapping(columnName = "CFG_TYPE", columnType = 2)
	private Integer cfgType;
	@FieldMapping(columnName = "MON_SERVER_CTLPORT", columnType = 12)
	private String monServerCtlport;
	@FieldMapping(columnName = "MON_SERVER_HOST", columnType = 12)
	private String monServerHost;
	@FieldMapping(columnName = "MON_SERVER_IMGPORT", columnType = 12)
	private String monServerImgport;
	@FieldMapping(columnName = "MON_SERVER_PORT", columnType = 12)
	private String monServerPort;
	@FieldMapping(columnName = "MON_SERVER_TIMER", columnType = 2)
	private Integer monServerTimer;
	
	public PpnRentMonCfg() {
		super();
	}

	public PpnRentMonCfg(String cfgId) {
		this.cfgId = cfgId;
	}

	/**
	 * @return the bashpath
	 */
	public String getBashpath() {
		return this.bashpath;
	}
	
	/**
	 * @param bashpath the bashpath to set
	 */
	public void setBashpath(String value) {
		this.bashpath = value;
	}

	/**
	 * @return the cffCode
	 */
	public String getCffCode() {
		return this.cffCode;
	}
	
	/**
	 * @param cffCode the cffCode to set
	 */
	public void setCffCode(String value) {
		this.cffCode = value;
	}

	/**
	 * @return the cfgCreateTime
	 */
	public Date getCfgCreateTime() {
		return this.cfgCreateTime;
	}
	
	/**
	 * @param cfgCreateTime the cfgCreateTime to set
	 */
	public void setCfgCreateTime(Date value) {
		this.cfgCreateTime = value;
	}

	/**
	 * @return the cfgDesc
	 */
	public String getCfgDesc() {
		return this.cfgDesc;
	}
	
	/**
	 * @param cfgDesc the cfgDesc to set
	 */
	public void setCfgDesc(String value) {
		this.cfgDesc = value;
	}

	/**
	 * @return the cfgField1
	 */
	public String getCfgField1() {
		return this.cfgField1;
	}
	
	/**
	 * @param cfgField1 the cfgField1 to set
	 */
	public void setCfgField1(String value) {
		this.cfgField1 = value;
	}

	/**
	 * @return the cfgId
	 */
	public String getCfgId() {
		return this.cfgId;
	}
	
	/**
	 * @param cfgId the cfgId to set
	 */
	public void setCfgId(String value) {
		this.cfgId = value;
	}

	/**
	 * @return the cfgNane
	 */
	public String getCfgNane() {
		return this.cfgNane;
	}
	
	/**
	 * @param cfgNane the cfgNane to set
	 */
	public void setCfgNane(String value) {
		this.cfgNane = value;
	}

	/**
	 * @return the cfgStatus
	 */
	public Integer getCfgStatus() {
		return this.cfgStatus;
	}
	
	/**
	 * @param cfgStatus the cfgStatus to set
	 */
	public void setCfgStatus(Integer value) {
		this.cfgStatus = value;
	}

	/**
	 * @return the cfgType
	 */
	public Integer getCfgType() {
		return this.cfgType;
	}
	
	/**
	 * @param cfgType the cfgType to set
	 */
	public void setCfgType(Integer value) {
		this.cfgType = value;
	}

	/**
	 * @return the monServerCtlport
	 */
	public String getMonServerCtlport() {
		return this.monServerCtlport;
	}
	
	/**
	 * @param monServerCtlport the monServerCtlport to set
	 */
	public void setMonServerCtlport(String value) {
		this.monServerCtlport = value;
	}

	/**
	 * @return the monServerHost
	 */
	public String getMonServerHost() {
		return this.monServerHost;
	}
	
	/**
	 * @param monServerHost the monServerHost to set
	 */
	public void setMonServerHost(String value) {
		this.monServerHost = value;
	}

	/**
	 * @return the monServerImgport
	 */
	public String getMonServerImgport() {
		return this.monServerImgport;
	}
	
	/**
	 * @param monServerImgport the monServerImgport to set
	 */
	public void setMonServerImgport(String value) {
		this.monServerImgport = value;
	}

	/**
	 * @return the monServerPort
	 */
	public String getMonServerPort() {
		return this.monServerPort;
	}
	
	/**
	 * @param monServerPort the monServerPort to set
	 */
	public void setMonServerPort(String value) {
		this.monServerPort = value;
	}

	/**
	 * @return the monServerTimer
	 */
	public Integer getMonServerTimer() {
		return this.monServerTimer;
	}
	
	/**
	 * @param monServerTimer the monServerTimer to set
	 */
	public void setMonServerTimer(Integer value) {
		this.monServerTimer = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnRentMonCfg)) {
			return false;
		}
		PpnRentMonCfg other = (PpnRentMonCfg)o;
		if (null == this.cfgId) {
			if (other.cfgId != null)
				return false;
		} else if (!this.cfgId.equals(other.cfgId))
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
		result = prime * result + ((cfgId == null) ? 0 : cfgId.hashCode());
		return result;
	}
	
}