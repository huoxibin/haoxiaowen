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
 * 文件：jetsennet.jdlm.beans.PpnRentMaint2Obj.java
 * 日 期：Fri Dec 30 09:40:14 CST 2016
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
@ClassMapping(tableName = "PPN_RENT_MAINT_2_OBJ", keyGenerator = "uuid")
public class PpnRentMaint2Obj implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_M2O_ID = "M2O_ID";
	public static String PROP_MAINT_ID = "MAINT_ID";
	public static String PROP_OBJ_ID = "OBJ_ID";
	
	/** primary key field of m2oId */
	@FieldMapping(columnName = "M2O_ID", columnType = 12, primary = true)
	private String m2oId;
	@FieldMapping(columnName = "MAINT_ID", columnType = 12)
	private String maintId;
	@FieldMapping(columnName = "OBJ_ID", columnType = 12)
	private String objId;
	
	public PpnRentMaint2Obj() {
		super();
	}

	public PpnRentMaint2Obj(String m2oId) {
		this.m2oId = m2oId;
	}

	public PpnRentMaint2Obj(String maintId, String objId) {
		this.maintId = maintId;
		this.objId = objId;
	}

	/**
	 * @return the m2oId
	 */
	public String getM2oId() {
		return this.m2oId;
	}
	
	/**
	 * @param m2oId the m2oId to set
	 */
	public void setM2oId(String value) {
		this.m2oId = value;
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
	 * @return the objId
	 */
	public String getObjId() {
		return this.objId;
	}
	
	/**
	 * @param objId the objId to set
	 */
	public void setObjId(String value) {
		this.objId = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnRentMaint2Obj)) {
			return false;
		}
		PpnRentMaint2Obj other = (PpnRentMaint2Obj)o;
		if (null == this.m2oId) {
			if (other.m2oId != null)
				return false;
		} else if (!this.m2oId.equals(other.m2oId))
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
		result = prime * result + ((m2oId == null) ? 0 : m2oId.hashCode());
		return result;
	}
	
}