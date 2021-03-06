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
 * 文件：jetsennet.jue2.bean.PpnBcChange2Item.java
 * 日 期：Fri Jul 22 15:34:28 CST 2016
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
@ClassMapping(tableName = "PPN_BC_CHANGE_2_ITEM", keyGenerator = "uuid")
public class PpnBcChange2Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_C2I = "C2I";
	public static String PROP_CHANGE_ID = "CHANGE_ID";
	public static String PROP_CHANGE_TYPE = "CHANGE_TYPE";
	public static String PROP_ITEM_ID = "ITEM_ID";
	
	/** primary key field of c2i */
	@FieldMapping(columnName = "C2I", columnType = 12, primary = true)
	private String c2i;
	/** foreign key field of PPN_BC_CHANGE.CHANGE_ID */
	@FieldMapping(columnName = "CHANGE_ID", columnType = 12)
	private String changeId;
	@FieldMapping(columnName = "CHANGE_TYPE", columnType = 12)
	private String changeType;
	/** foreign key field of PPN_BC_ITEM.ITEM_ID */
	@FieldMapping(columnName = "ITEM_ID", columnType = 12)
	private String itemId;
	
	public PpnBcChange2Item() {
		super();
	}

	public PpnBcChange2Item(String c2i) {
		this.c2i = c2i;
	}

	/**
	 * @return the c2i
	 */
	public String getC2i() {
		return this.c2i;
	}
	
	/**
	 * @param c2i the c2i to set
	 */
	public void setC2i(String value) {
		this.c2i = value;
	}

	/**
	 * @return the changeId
	 */
	public String getChangeId() {
		return this.changeId;
	}
	
	/**
	 * @param changeId the changeId to set
	 */
	public void setChangeId(String value) {
		this.changeId = value;
	}

	/**
	 * @return the changeType
	 */
	public String getChangeType() {
		return this.changeType;
	}
	
	/**
	 * @param changeType the changeType to set
	 */
	public void setChangeType(String value) {
		this.changeType = value;
	}

	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return this.itemId;
	}
	
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String value) {
		this.itemId = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnBcChange2Item)) {
			return false;
		}
		PpnBcChange2Item other = (PpnBcChange2Item)o;
		if (null == this.c2i) {
			if (other.c2i != null)
				return false;
		} else if (!this.c2i.equals(other.c2i))
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
		result = prime * result + ((c2i == null) ? 0 : c2i.hashCode());
		return result;
	}
	
}