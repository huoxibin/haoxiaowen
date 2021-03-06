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
 * 文件：jetsennet.ppn.bean.PpnTaskStorage.java
 * 日 期：Fri Jul 29 10:10:03 CST 2016
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
@ClassMapping(tableName = "PPN_TASK_STORAGE", keyGenerator = "uuid")
public class PpnTaskStorage implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_STOR_FIELD1 = "STOR_FIELD1";
	public static String PROP_STOR_FIELD2 = "STOR_FIELD2";
	public static String PROP_STOR_ID = "STOR_ID";
	public static String PROP_STOR_LAST_UPDATE_TIME = "STOR_LAST_UPDATE_TIME";
	public static String PROP_STOR_PATH = "STOR_PATH";
	public static String PROP_STOR_QUOTA = "STOR_QUOTA";
	public static String PROP_STOR_QUOTA_MODE = "STOR_QUOTA_MODE";
	public static String PROP_STOR_STATUS = "STOR_STATUS";
	public static String PROP_STOR_USE_TYPE = "STOR_USE_TYPE";
	public static String PROP_TASK_ID = "TASK_ID";
	
	/** primary key field of storId */
	@FieldMapping(columnName = "STOR_ID", columnType = 12, primary = true)
	private String storId;
	@FieldMapping(columnName = "STOR_FIELD1", columnType = 12)
	private String storField1;
	@FieldMapping(columnName = "STOR_FIELD2", columnType = 12)
	private String storField2;
	@FieldMapping(columnName = "STOR_LAST_UPDATE_TIME", columnType = 93)
	private Date storLastUpdateTime;
	@FieldMapping(columnName = "STOR_PATH", columnType = 12)
	private String storPath;
	@FieldMapping(columnName = "STOR_QUOTA", columnType = 2)
	private Integer storQuota;
	@FieldMapping(columnName = "STOR_QUOTA_MODE", columnType = 12)
	private String storQuotaMode;
	@FieldMapping(columnName = "STOR_STATUS", columnType = 2)
	private Integer storStatus;
	@FieldMapping(columnName = "STOR_USE_TYPE", columnType = 2)
	private Integer storUseType;
	/** foreign key field of PPN_TASK.TASK_ID */
	@FieldMapping(columnName = "TASK_ID", columnType = 12)
	private String taskId;
	
	public PpnTaskStorage() {
		super();
	}

	public PpnTaskStorage(String storId) {
		this.storId = storId;
	}

	/**
	 * @return the storField1
	 */
	public String getStorField1() {
		return this.storField1;
	}
	
	/**
	 * @param storField1 the storField1 to set
	 */
	public void setStorField1(String value) {
		this.storField1 = value;
	}

	/**
	 * @return the storField2
	 */
	public String getStorField2() {
		return this.storField2;
	}
	
	/**
	 * @param storField2 the storField2 to set
	 */
	public void setStorField2(String value) {
		this.storField2 = value;
	}

	/**
	 * @return the storId
	 */
	public String getStorId() {
		return this.storId;
	}
	
	/**
	 * @param storId the storId to set
	 */
	public void setStorId(String value) {
		this.storId = value;
	}

	/**
	 * @return the storLastUpdateTime
	 */
	public Date getStorLastUpdateTime() {
		return this.storLastUpdateTime;
	}
	
	/**
	 * @param storLastUpdateTime the storLastUpdateTime to set
	 */
	public void setStorLastUpdateTime(Date value) {
		this.storLastUpdateTime = value;
	}

	/**
	 * @return the storPath
	 */
	public String getStorPath() {
		return this.storPath;
	}
	
	/**
	 * @param storPath the storPath to set
	 */
	public void setStorPath(String value) {
		this.storPath = value;
	}

	/**
	 * @return the storQuota
	 */
	public Integer getStorQuota() {
		return this.storQuota;
	}
	
	/**
	 * @param storQuota the storQuota to set
	 */
	public void setStorQuota(Integer value) {
		this.storQuota = value;
	}

	/**
	 * @return the storQuotaMode
	 */
	public String getStorQuotaMode() {
		return this.storQuotaMode;
	}
	
	/**
	 * @param storQuotaMode the storQuotaMode to set
	 */
	public void setStorQuotaMode(String value) {
		this.storQuotaMode = value;
	}

	/**
	 * @return the storStatus
	 */
	public Integer getStorStatus() {
		return this.storStatus;
	}
	
	/**
	 * @param storStatus the storStatus to set
	 */
	public void setStorStatus(Integer value) {
		this.storStatus = value;
	}

	/**
	 * @return the storUseType
	 */
	public Integer getStorUseType() {
		return this.storUseType;
	}
	
	/**
	 * @param storUseType the storUseType to set
	 */
	public void setStorUseType(Integer value) {
		this.storUseType = value;
	}

	/**
	 * @return the taskId
	 */
	public String getTaskId() {
		return this.taskId;
	}
	
	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(String value) {
		this.taskId = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnTaskStorage)) {
			return false;
		}
		PpnTaskStorage other = (PpnTaskStorage)o;
		if (null == this.storId) {
			if (other.storId != null)
				return false;
		} else if (!this.storId.equals(other.storId))
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
		result = prime * result + ((storId == null) ? 0 : storId.hashCode());
		return result;
	}
	
}