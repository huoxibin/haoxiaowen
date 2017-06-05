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
 * 文件：jetsennet.jue2.beans.PpnDevAlarm.java
 * 日 期：Mon Sep 12 14:01:43 CST 2016
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
@ClassMapping(tableName = "PPN_DEV_ALARM", keyGenerator = "uuid")
public class PpnDevAlarm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_ALARM_DESC = "ALARM_DESC";
	public static String PROP_ALARM_FIELD1 = "ALARM_FIELD1";
	public static String PROP_ALARM_FIELD2 = "ALARM_FIELD2";
	public static String PROP_ALARM_ID = "ALARM_ID";
	public static String PROP_ALARM_LEVEL = "ALARM_LEVEL";
	public static String PROP_ALARM_MODE = "ALARM_MODE";
	public static String PROP_ALARM_OID = "ALARM_OID";
	public static String PROP_ALARM_TIME = "ALARM_TIME";
	public static String PROP_CHECK_FIELD1 = "CHECK_FIELD1";
	public static String PROP_CHECK_STATUS = "CHECK_STATUS";
	public static String PROP_CHECK_TIME = "CHECK_TIME";
	public static String PROP_CHECK_USER = "CHECK_USER";
	public static String PROP_DEV_ID = "DEV_ID";
	
	/** primary key field of alarmId */
	@FieldMapping(columnName = "ALARM_ID", columnType = 12, primary = true)
	private String alarmId;
	@FieldMapping(columnName = "ALARM_DESC", columnType = 12)
	private String alarmDesc;
	@FieldMapping(columnName = "ALARM_FIELD1", columnType = 12)
	private String alarmField1;
	@FieldMapping(columnName = "ALARM_FIELD2", columnType = 12)
	private String alarmField2;
	@FieldMapping(columnName = "ALARM_LEVEL", columnType = 2)
	private Integer alarmLevel;
	@FieldMapping(columnName = "ALARM_MODE", columnType = 2)
	private Integer alarmMode;
	@FieldMapping(columnName = "ALARM_OID", columnType = 12)
	private String alarmOid;
	@FieldMapping(columnName = "ALARM_TIME", columnType = 93)
	private Date alarmTime;
	@FieldMapping(columnName = "CHECK_FIELD1", columnType = 12)
	private String checkField1;
	@FieldMapping(columnName = "CHECK_STATUS", columnType = 2)
	private Integer checkStatus;
	@FieldMapping(columnName = "CHECK_TIME", columnType = 93)
	private Date checkTime;
	@FieldMapping(columnName = "CHECK_USER", columnType = 12)
	private String checkUser;
	/** foreign key field of PPN_DEV_DEVICE.DEV_ID */
	@FieldMapping(columnName = "DEV_ID", columnType = 12)
	private String devId;
	
	public PpnDevAlarm() {
		super();
	}

	public PpnDevAlarm(String alarmId) {
		this.alarmId = alarmId;
	}

	public PpnDevAlarm(String alarmDesc, Integer alarmLevel, Date alarmTime, String devId) {
		this.alarmDesc = alarmDesc;
		this.alarmLevel = alarmLevel;
		this.alarmTime = alarmTime;
		this.devId = devId;
	}

	/**
	 * @return the alarmDesc
	 */
	public String getAlarmDesc() {
		return this.alarmDesc;
	}
	
	/**
	 * @param alarmDesc the alarmDesc to set
	 */
	public void setAlarmDesc(String value) {
		this.alarmDesc = value;
	}

	/**
	 * @return the alarmField1
	 */
	public String getAlarmField1() {
		return this.alarmField1;
	}
	
	/**
	 * @param alarmField1 the alarmField1 to set
	 */
	public void setAlarmField1(String value) {
		this.alarmField1 = value;
	}

	/**
	 * @return the alarmField2
	 */
	public String getAlarmField2() {
		return this.alarmField2;
	}
	
	/**
	 * @param alarmField2 the alarmField2 to set
	 */
	public void setAlarmField2(String value) {
		this.alarmField2 = value;
	}

	/**
	 * @return the alarmId
	 */
	public String getAlarmId() {
		return this.alarmId;
	}
	
	/**
	 * @param alarmId the alarmId to set
	 */
	public void setAlarmId(String value) {
		this.alarmId = value;
	}

	/**
	 * @return the alarmLevel
	 */
	public Integer getAlarmLevel() {
		return this.alarmLevel;
	}
	
	/**
	 * @param alarmLevel the alarmLevel to set
	 */
	public void setAlarmLevel(Integer value) {
		this.alarmLevel = value;
	}

	/**
	 * @return the alarmMode
	 */
	public Integer getAlarmMode() {
		return this.alarmMode;
	}
	
	/**
	 * @param alarmMode the alarmMode to set
	 */
	public void setAlarmMode(Integer value) {
		this.alarmMode = value;
	}

	/**
	 * @return the alarmOid
	 */
	public String getAlarmOid() {
		return this.alarmOid;
	}
	
	/**
	 * @param alarmOid the alarmOid to set
	 */
	public void setAlarmOid(String value) {
		this.alarmOid = value;
	}

	/**
	 * @return the alarmTime
	 */
	public Date getAlarmTime() {
		return this.alarmTime;
	}
	
	/**
	 * @param alarmTime the alarmTime to set
	 */
	public void setAlarmTime(Date value) {
		this.alarmTime = value;
	}

	/**
	 * @return the checkField1
	 */
	public String getCheckField1() {
		return this.checkField1;
	}
	
	/**
	 * @param checkField1 the checkField1 to set
	 */
	public void setCheckField1(String value) {
		this.checkField1 = value;
	}

	/**
	 * @return the checkStatus
	 */
	public Integer getCheckStatus() {
		return this.checkStatus;
	}
	
	/**
	 * @param checkStatus the checkStatus to set
	 */
	public void setCheckStatus(Integer value) {
		this.checkStatus = value;
	}

	/**
	 * @return the checkTime
	 */
	public Date getCheckTime() {
		return this.checkTime;
	}
	
	/**
	 * @param checkTime the checkTime to set
	 */
	public void setCheckTime(Date value) {
		this.checkTime = value;
	}

	/**
	 * @return the checkUser
	 */
	public String getCheckUser() {
		return this.checkUser;
	}
	
	/**
	 * @param checkUser the checkUser to set
	 */
	public void setCheckUser(String value) {
		this.checkUser = value;
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
		if ((o == null) || !(o instanceof PpnDevAlarm)) {
			return false;
		}
		PpnDevAlarm other = (PpnDevAlarm)o;
		if (null == this.alarmId) {
			if (other.alarmId != null)
				return false;
		} else if (!this.alarmId.equals(other.alarmId))
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
		result = prime * result + ((alarmId == null) ? 0 : alarmId.hashCode());
		return result;
	}
	
}