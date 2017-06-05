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
 * 文件：jetsennet.jdlm.beans.PpnRentOrdAttach.java
 * 日 期：Tue Dec 13 10:34:29 CST 2016
 */
package jetsennet.jdlm.beans;

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
@ClassMapping(tableName = "PPN_RENT_ORD_ATTACH", keyGenerator = "uuid")
public class PpnRentOrdAttach implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_ATTA_FIELD1 = "ATTA_FIELD1";
	public static String PROP_ATTA_ID = "ATTA_ID";
	public static String PROP_ATTA_STATUS = "ATTA_STATUS";
	public static String PROP_ATTA_TYPE = "ATTA_TYPE";
	public static String PROP_FILE_ID = "FILE_ID";
	public static String PROP_ORD_ID = "ORD_ID";
	
	/** primary key field of attaId */
	@FieldMapping(columnName = "ATTA_ID", columnType = 12, primary = true)
	private String attaId;
	@FieldMapping(columnName = "ATTA_FIELD1", columnType = 12)
	private String attaField1;
	@FieldMapping(columnName = "ATTA_STATUS", columnType = 2)
	private Integer attaStatus;
	@FieldMapping(columnName = "ATTA_TYPE", columnType = 2)
	private Integer attaType;
	@FieldMapping(columnName = "FILE_ID", columnType = 12)
	private String fileId;
	@FieldMapping(columnName = "ORD_ID", columnType = 12)
	private String ordId;
	
	public PpnRentOrdAttach() {
		super();
	}

	public PpnRentOrdAttach(String attaId) {
		this.attaId = attaId;
	}

	/**
	 * @return the attaField1
	 */
	public String getAttaField1() {
		return this.attaField1;
	}
	
	/**
	 * @param attaField1 the attaField1 to set
	 */
	public void setAttaField1(String value) {
		this.attaField1 = value;
	}

	/**
	 * @return the attaId
	 */
	public String getAttaId() {
		return this.attaId;
	}
	
	/**
	 * @param attaId the attaId to set
	 */
	public void setAttaId(String value) {
		this.attaId = value;
	}

	/**
	 * @return the attaStatus
	 */
	public Integer getAttaStatus() {
		return this.attaStatus;
	}
	
	/**
	 * @param attaStatus the attaStatus to set
	 */
	public void setAttaStatus(Integer value) {
		this.attaStatus = value;
	}

	/**
	 * @return the attaType
	 */
	public Integer getAttaType() {
		return this.attaType;
	}
	
	/**
	 * @param attaType the attaType to set
	 */
	public void setAttaType(Integer value) {
		this.attaType = value;
	}

	/**
	 * @return the fileId
	 */
	public String getFileId() {
		return this.fileId;
	}
	
	/**
	 * @param fileId the fileId to set
	 */
	public void setFileId(String value) {
		this.fileId = value;
	}

	/**
	 * @return the ordId
	 */
	public String getOrdId() {
		return this.ordId;
	}
	
	/**
	 * @param ordId the ordId to set
	 */
	public void setOrdId(String value) {
		this.ordId = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnRentOrdAttach)) {
			return false;
		}
		PpnRentOrdAttach other = (PpnRentOrdAttach)o;
		if (null == this.attaId) {
			if (other.attaId != null)
				return false;
		} else if (!this.attaId.equals(other.attaId))
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
		result = prime * result + ((attaId == null) ? 0 : attaId.hashCode());
		return result;
	}
	
}