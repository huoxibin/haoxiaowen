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
 * 文件：jetsennet.jue2.beans.PpnDevKeywords.java
 * 日 期：Mon Sep 12 14:02:36 CST 2016
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
@ClassMapping(tableName = "PPN_DEV_KEYWORDS", keyGenerator = "uuid")
public class PpnDevKeywords implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_DEV_ID = "DEV_ID";
	public static String PROP_KW_CODE = "KW_CODE";
	public static String PROP_KW_CREATE_TIME = "KW_CREATE_TIME";
	public static String PROP_KW_ID = "KW_ID";
	public static String PROP_KW_STATUS = "KW_STATUS";
	
	/** primary key field of kwId */
	@FieldMapping(columnName = "KW_ID", columnType = 12, primary = true)
	private String kwId;
	/** foreign key field of PPN_DEV_DEVICE.DEV_ID */
	@FieldMapping(columnName = "DEV_ID", columnType = 12)
	private String devId;
	@FieldMapping(columnName = "KW_CODE", columnType = 12)
	private String kwCode;
	@FieldMapping(columnName = "KW_CREATE_TIME", columnType = 93)
	private Date kwCreateTime;
	@FieldMapping(columnName = "KW_STATUS", columnType = 2)
	private Integer kwStatus;
	
	public PpnDevKeywords() {
		super();
	}

	public PpnDevKeywords(String kwId) {
		this.kwId = kwId;
	}

	public PpnDevKeywords(String devId, String kwCode, Date kwCreateTime, Integer kwStatus) {
		this.devId = devId;
		this.kwCode = kwCode;
		this.kwCreateTime = kwCreateTime;
		this.kwStatus = kwStatus;
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
	 * @return the kwCode
	 */
	public String getKwCode() {
		return this.kwCode;
	}
	
	/**
	 * @param kwCode the kwCode to set
	 */
	public void setKwCode(String value) {
		this.kwCode = value;
	}

	/**
	 * @return the kwCreateTime
	 */
	public Date getKwCreateTime() {
		return this.kwCreateTime;
	}
	
	/**
	 * @param kwCreateTime the kwCreateTime to set
	 */
	public void setKwCreateTime(Date value) {
		this.kwCreateTime = value;
	}

	/**
	 * @return the kwId
	 */
	public String getKwId() {
		return this.kwId;
	}
	
	/**
	 * @param kwId the kwId to set
	 */
	public void setKwId(String value) {
		this.kwId = value;
	}

	/**
	 * @return the kwStatus
	 */
	public Integer getKwStatus() {
		return this.kwStatus;
	}
	
	/**
	 * @param kwStatus the kwStatus to set
	 */
	public void setKwStatus(Integer value) {
		this.kwStatus = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnDevKeywords)) {
			return false;
		}
		PpnDevKeywords other = (PpnDevKeywords)o;
		if (null == this.kwId) {
			if (other.kwId != null)
				return false;
		} else if (!this.kwId.equals(other.kwId))
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
		result = prime * result + ((kwId == null) ? 0 : kwId.hashCode());
		return result;
	}
	
}