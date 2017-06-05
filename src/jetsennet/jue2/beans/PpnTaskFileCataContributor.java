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
 * 文件：jetsennet.jue2.bean.PpnTaskFileCataContributor.java
 * 日 期：Fri Jul 29 10:17:43 CST 2016
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
@ClassMapping(tableName = "PPN_TASK_FILE_CATA_CONTRIBUTOR", keyGenerator = "uuid")
public class PpnTaskFileCataContributor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_CATA_ID = "CATA_ID";
	public static String PROP_CONTR_FIELD1 = "CONTR_FIELD1";
	public static String PROP_CONTR_FIELD2 = "CONTR_FIELD2";
	public static String PROP_CONTR_ID = "CONTR_ID";
	public static String PROP_CONTR_OTHER_INFO = "CONTR_OTHER_INFO";
	public static String PROP_CONTR_PARALLEL_NAME = "CONTR_PARALLEL_NAME";
	public static String PROP_CONTR_ROLE = "CONTR_ROLE";
	public static String PROP_CONTR_USERCODE = "CONTR_USERCODE";
	public static String PROP_CONTR_USERNAME = "CONTR_USERNAME";
	
	/** primary key field of contrId */
	@FieldMapping(columnName = "CONTR_ID", columnType = 12, primary = true)
	private String contrId;
	/** foreign key field of PPN_TASK_FILE_CATA.CATA_ID */
	@FieldMapping(columnName = "CATA_ID", columnType = 12)
	private String cataId;
	@FieldMapping(columnName = "CONTR_FIELD1", columnType = 12)
	private String contrField1;
	@FieldMapping(columnName = "CONTR_FIELD2", columnType = 12)
	private String contrField2;
	@FieldMapping(columnName = "CONTR_OTHER_INFO", columnType = 12)
	private String contrOtherInfo;
	@FieldMapping(columnName = "CONTR_PARALLEL_NAME", columnType = 12)
	private String contrParallelName;
	@FieldMapping(columnName = "CONTR_ROLE", columnType = 12)
	private String contrRole;
	@FieldMapping(columnName = "CONTR_USERCODE", columnType = 12)
	private String contrUsercode;
	@FieldMapping(columnName = "CONTR_USERNAME", columnType = 12)
	private String contrUsername;
	
	public PpnTaskFileCataContributor() {
		super();
	}

	public PpnTaskFileCataContributor(String contrId) {
		this.contrId = contrId;
	}

	public PpnTaskFileCataContributor(String contrField1, String contrField2) {
		this.contrField1 = contrField1;
		this.contrField2 = contrField2;
	}

	/**
	 * @return the cataId
	 */
	public String getCataId() {
		return this.cataId;
	}
	
	/**
	 * @param cataId the cataId to set
	 */
	public void setCataId(String value) {
		this.cataId = value;
	}

	/**
	 * @return the contrField1
	 */
	public String getContrField1() {
		return this.contrField1;
	}
	
	/**
	 * @param contrField1 the contrField1 to set
	 */
	public void setContrField1(String value) {
		this.contrField1 = value;
	}

	/**
	 * @return the contrField2
	 */
	public String getContrField2() {
		return this.contrField2;
	}
	
	/**
	 * @param contrField2 the contrField2 to set
	 */
	public void setContrField2(String value) {
		this.contrField2 = value;
	}

	/**
	 * @return the contrId
	 */
	public String getContrId() {
		return this.contrId;
	}
	
	/**
	 * @param contrId the contrId to set
	 */
	public void setContrId(String value) {
		this.contrId = value;
	}

	/**
	 * @return the contrOtherInfo
	 */
	public String getContrOtherInfo() {
		return this.contrOtherInfo;
	}
	
	/**
	 * @param contrOtherInfo the contrOtherInfo to set
	 */
	public void setContrOtherInfo(String value) {
		this.contrOtherInfo = value;
	}

	/**
	 * @return the contrParallelName
	 */
	public String getContrParallelName() {
		return this.contrParallelName;
	}
	
	/**
	 * @param contrParallelName the contrParallelName to set
	 */
	public void setContrParallelName(String value) {
		this.contrParallelName = value;
	}

	/**
	 * @return the contrRole
	 */
	public String getContrRole() {
		return this.contrRole;
	}
	
	/**
	 * @param contrRole the contrRole to set
	 */
	public void setContrRole(String value) {
		this.contrRole = value;
	}

	/**
	 * @return the contrUsercode
	 */
	public String getContrUsercode() {
		return this.contrUsercode;
	}
	
	/**
	 * @param contrUsercode the contrUsercode to set
	 */
	public void setContrUsercode(String value) {
		this.contrUsercode = value;
	}

	/**
	 * @return the contrUsername
	 */
	public String getContrUsername() {
		return this.contrUsername;
	}
	
	/**
	 * @param contrUsername the contrUsername to set
	 */
	public void setContrUsername(String value) {
		this.contrUsername = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnTaskFileCataContributor)) {
			return false;
		}
		PpnTaskFileCataContributor other = (PpnTaskFileCataContributor)o;
		if (null == this.contrId) {
			if (other.contrId != null)
				return false;
		} else if (!this.contrId.equals(other.contrId))
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
		result = prime * result + ((contrId == null) ? 0 : contrId.hashCode());
		return result;
	}
	
}