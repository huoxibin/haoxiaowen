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
 * 文件：jetsennet.ppn.bean.PpnPgmSeg.java
 * 日 期：Sat Jul 30 15:02:49 CST 2016
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
@ClassMapping(tableName = "PPN_PGM_SEG", keyGenerator = "uuid")
public class PpnPgmSeg implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_PGM_ID = "PGM_ID";
	public static String PROP_SEG_CREATE_TIME = "SEG_CREATE_TIME";
	public static String PROP_SEG_DURATION = "SEG_DURATION";
	public static String PROP_SEG_ID = "SEG_ID";
	public static String PROP_SEG_INDEX = "SEG_INDEX";
	public static String PROP_SEG_MARK_IN = "SEG_MARK_IN";
	public static String PROP_SEG_MARK_OUT = "SEG_MARK_OUT";
	public static String PROP_SEG_NAME = "SEG_NAME";
	public static String PROP_SEG_STATUS = "SEG_STATUS";
	public static String PROP_SRC_FILED1 = "SRC_FILED1";
	public static String PROP_SRC_FILED2 = "SRC_FILED2";
	
	/** primary key field of segId */
	@FieldMapping(columnName = "SEG_ID", columnType = 12, primary = true)
	private String segId;
	@FieldMapping(columnName = "PGM_ID", columnType = 12)
	private String pgmId;
	@FieldMapping(columnName = "SEG_CREATE_TIME", columnType = 93)
	private Date segCreateTime;
	@FieldMapping(columnName = "SEG_DURATION", columnType = 2)
	private Integer segDuration;
	@FieldMapping(columnName = "SEG_INDEX", columnType = 2)
	private Integer segIndex;
	@FieldMapping(columnName = "SEG_MARK_IN", columnType = 12)
	private String segMarkIn;
	@FieldMapping(columnName = "SEG_MARK_OUT", columnType = 12)
	private String segMarkOut;
	@FieldMapping(columnName = "SEG_NAME", columnType = 12)
	private String segName;
	@FieldMapping(columnName = "SEG_STATUS", columnType = 12)
	private String segStatus;
	@FieldMapping(columnName = "SRC_FILED1", columnType = 12)
	private String srcFiled1;
	@FieldMapping(columnName = "SRC_FILED2", columnType = 12)
	private String srcFiled2;
	
	public PpnPgmSeg() {
		super();
	}

	public PpnPgmSeg(String segId) {
		this.segId = segId;
	}

	/**
	 * @return the pgmId
	 */
	public String getPgmId() {
		return this.pgmId;
	}
	
	/**
	 * @param pgmId the pgmId to set
	 */
	public void setPgmId(String value) {
		this.pgmId = value;
	}

	/**
	 * @return the segCreateTime
	 */
	public Date getSegCreateTime() {
		return this.segCreateTime;
	}
	
	/**
	 * @param segCreateTime the segCreateTime to set
	 */
	public void setSegCreateTime(Date value) {
		this.segCreateTime = value;
	}

	/**
	 * @return the segDuration
	 */
	public Integer getSegDuration() {
		return this.segDuration;
	}
	
	/**
	 * @param segDuration the segDuration to set
	 */
	public void setSegDuration(Integer value) {
		this.segDuration = value;
	}

	/**
	 * @return the segId
	 */
	public String getSegId() {
		return this.segId;
	}
	
	/**
	 * @param segId the segId to set
	 */
	public void setSegId(String value) {
		this.segId = value;
	}

	/**
	 * @return the segIndex
	 */
	public Integer getSegIndex() {
		return this.segIndex;
	}
	
	/**
	 * @param segIndex the segIndex to set
	 */
	public void setSegIndex(Integer value) {
		this.segIndex = value;
	}

	/**
	 * @return the segMarkIn
	 */
	public String getSegMarkIn() {
		return this.segMarkIn;
	}
	
	/**
	 * @param segMarkIn the segMarkIn to set
	 */
	public void setSegMarkIn(String value) {
		this.segMarkIn = value;
	}

	/**
	 * @return the segMarkOut
	 */
	public String getSegMarkOut() {
		return this.segMarkOut;
	}
	
	/**
	 * @param segMarkOut the segMarkOut to set
	 */
	public void setSegMarkOut(String value) {
		this.segMarkOut = value;
	}

	/**
	 * @return the segName
	 */
	public String getSegName() {
		return this.segName;
	}
	
	/**
	 * @param segName the segName to set
	 */
	public void setSegName(String value) {
		this.segName = value;
	}

	/**
	 * @return the segStatus
	 */
	public String getSegStatus() {
		return this.segStatus;
	}
	
	/**
	 * @param segStatus the segStatus to set
	 */
	public void setSegStatus(String value) {
		this.segStatus = value;
	}

	/**
	 * @return the srcFiled1
	 */
	public String getSrcFiled1() {
		return this.srcFiled1;
	}
	
	/**
	 * @param srcFiled1 the srcFiled1 to set
	 */
	public void setSrcFiled1(String value) {
		this.srcFiled1 = value;
	}

	/**
	 * @return the srcFiled2
	 */
	public String getSrcFiled2() {
		return this.srcFiled2;
	}
	
	/**
	 * @param srcFiled2 the srcFiled2 to set
	 */
	public void setSrcFiled2(String value) {
		this.srcFiled2 = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnPgmSeg)) {
			return false;
		}
		PpnPgmSeg other = (PpnPgmSeg)o;
		if (null == this.segId) {
			if (other.segId != null)
				return false;
		} else if (!this.segId.equals(other.segId))
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
		result = prime * result + ((segId == null) ? 0 : segId.hashCode());
		return result;
	}
	
}