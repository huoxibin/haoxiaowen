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
 * 文件：jetsennet.ppn.bean.PpnTsbTask2file.java
 * 日 期：Tue Jul 26 15:17:08 CST 2016
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
@ClassMapping(tableName = "PPN_TSB_TASK2FILE", keyGenerator = "uuid")
public class PpnTsbTask2file implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_FILE_ID = "FILE_ID";
	public static String PROP_SRC_FILE_PATH = "SRC_FILE_PATH";
	public static String PROP_T2F_CLASS = "T2F_CLASS";
	public static String PROP_T2F_FIELD1 = "T2F_FIELD1";
	public static String PROP_T2F_FIELD2 = "T2F_FIELD2";
	public static String PROP_T2F_FIELD3 = "T2F_FIELD3";
	public static String PROP_T2F_ID = "T2F_ID";
	public static String PROP_TARGET_FILE_PATH = "TARGET_FILE_PATH";
	public static String PROP_TASK_ID = "TASK_ID";
	
	/** primary key field of t2fId */
	@FieldMapping(columnName = "T2F_ID", columnType = 12, primary = true)
	private String t2fId;
	@FieldMapping(columnName = "FILE_ID", columnType = 12)
	private String fileId;
	@FieldMapping(columnName = "SRC_FILE_PATH", columnType = 12)
	private String srcFilePath;
	@FieldMapping(columnName = "T2F_CLASS", columnType = 2)
	private Integer t2fClass;
	@FieldMapping(columnName = "T2F_FIELD1", columnType = 12)
	private String t2fField1;
	@FieldMapping(columnName = "T2F_FIELD2", columnType = 12)
	private String t2fField2;
	@FieldMapping(columnName = "T2F_FIELD3", columnType = 12)
	private String t2fField3;
	@FieldMapping(columnName = "TARGET_FILE_PATH", columnType = 12)
	private String targetFilePath;
	/** foreign key field of PPN_TSB_TASK.TASK_ID */
	@FieldMapping(columnName = "TASK_ID", columnType = 12)
	private String taskId;
	
	public PpnTsbTask2file() {
		super();
	}

	public PpnTsbTask2file(String t2fId) {
		this.t2fId = t2fId;
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
	 * @return the srcFilePath
	 */
	public String getSrcFilePath() {
		return this.srcFilePath;
	}
	
	/**
	 * @param srcFilePath the srcFilePath to set
	 */
	public void setSrcFilePath(String value) {
		this.srcFilePath = value;
	}

	/**
	 * @return the t2fClass
	 */
	public Integer getT2fClass() {
		return this.t2fClass;
	}
	
	/**
	 * @param t2fClass the t2fClass to set
	 */
	public void setT2fClass(Integer value) {
		this.t2fClass = value;
	}

	/**
	 * @return the t2fField1
	 */
	public String getT2fField1() {
		return this.t2fField1;
	}
	
	/**
	 * @param t2fField1 the t2fField1 to set
	 */
	public void setT2fField1(String value) {
		this.t2fField1 = value;
	}

	/**
	 * @return the t2fField2
	 */
	public String getT2fField2() {
		return this.t2fField2;
	}
	
	/**
	 * @param t2fField2 the t2fField2 to set
	 */
	public void setT2fField2(String value) {
		this.t2fField2 = value;
	}

	/**
	 * @return the t2fField3
	 */
	public String getT2fField3() {
		return this.t2fField3;
	}
	
	/**
	 * @param t2fField3 the t2fField3 to set
	 */
	public void setT2fField3(String value) {
		this.t2fField3 = value;
	}

	/**
	 * @return the t2fId
	 */
	public String getT2fId() {
		return this.t2fId;
	}
	
	/**
	 * @param t2fId the t2fId to set
	 */
	public void setT2fId(String value) {
		this.t2fId = value;
	}

	/**
	 * @return the targetFilePath
	 */
	public String getTargetFilePath() {
		return this.targetFilePath;
	}
	
	/**
	 * @param targetFilePath the targetFilePath to set
	 */
	public void setTargetFilePath(String value) {
		this.targetFilePath = value;
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
		if ((o == null) || !(o instanceof PpnTsbTask2file)) {
			return false;
		}
		PpnTsbTask2file other = (PpnTsbTask2file)o;
		if (null == this.t2fId) {
			if (other.t2fId != null)
				return false;
		} else if (!this.t2fId.equals(other.t2fId))
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
		result = prime * result + ((t2fId == null) ? 0 : t2fId.hashCode());
		return result;
	}
	
}