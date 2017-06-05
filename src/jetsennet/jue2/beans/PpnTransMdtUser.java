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
 * 文件：jetsennet.jue2.beans.PpnTransMdtUser.java
 * 日 期：Thu Aug 04 14:47:02 CST 2016
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
@ClassMapping(tableName = "PPN_TRANS_MDT_USER", keyGenerator = "uuid")
public class PpnTransMdtUser implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_DS_ID = "DS_ID";
	public static String PROP_USER_CODE = "USER_CODE";
	public static String PROP_USER_ID = "USER_ID";
	public static String PROP_USER_MOBILE_TEL = "USER_MOBILE_TEL";
	public static String PROP_USER_NAME = "USER_NAME";
	public static String PROP_USER_ROLE = "USER_ROLE";
	public static String PROP_USER_TEL = "USER_TEL";
	
	/** primary key field of userId */
	@FieldMapping(columnName = "USER_ID", columnType = 12, primary = true)
	private String userId;
	/** foreign key field of PPN_TRANS_DS.DS_ID */
	@FieldMapping(columnName = "DS_ID", columnType = 12)
	private String dsId;
	@FieldMapping(columnName = "USER_CODE", columnType = 12)
	private String userCode;
	@FieldMapping(columnName = "USER_MOBILE_TEL", columnType = 12)
	private String userMobileTel;
	@FieldMapping(columnName = "USER_NAME", columnType = 12)
	private String userName;
	@FieldMapping(columnName = "USER_ROLE", columnType = 12)
	private String userRole;
	@FieldMapping(columnName = "USER_TEL", columnType = 12)
	private String userTel;
	
	public PpnTransMdtUser() {
		super();
	}

	public PpnTransMdtUser(String userId) {
		this.userId = userId;
	}

	public PpnTransMdtUser(String userCode, String userMobileTel, String userName, String userRole, String userTel) {
		this.userCode = userCode;
		this.userMobileTel = userMobileTel;
		this.userName = userName;
		this.userRole = userRole;
		this.userTel = userTel;
	}

	/**
	 * @return the dsId
	 */
	public String getDsId() {
		return this.dsId;
	}
	
	/**
	 * @param dsId the dsId to set
	 */
	public void setDsId(String value) {
		this.dsId = value;
	}

	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return this.userCode;
	}
	
	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String value) {
		this.userCode = value;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return this.userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String value) {
		this.userId = value;
	}

	/**
	 * @return the userMobileTel
	 */
	public String getUserMobileTel() {
		return this.userMobileTel;
	}
	
	/**
	 * @param userMobileTel the userMobileTel to set
	 */
	public void setUserMobileTel(String value) {
		this.userMobileTel = value;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String value) {
		this.userName = value;
	}

	/**
	 * @return the userRole
	 */
	public String getUserRole() {
		return this.userRole;
	}
	
	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(String value) {
		this.userRole = value;
	}

	/**
	 * @return the userTel
	 */
	public String getUserTel() {
		return this.userTel;
	}
	
	/**
	 * @param userTel the userTel to set
	 */
	public void setUserTel(String value) {
		this.userTel = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnTransMdtUser)) {
			return false;
		}
		PpnTransMdtUser other = (PpnTransMdtUser)o;
		if (null == this.userId) {
			if (other.userId != null)
				return false;
		} else if (!this.userId.equals(other.userId))
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
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	
}