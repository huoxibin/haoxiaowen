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
 * 文件：jetsennet.jdlm.beans.PpnRentFile.java
 * 日 期：Tue Dec 13 10:32:59 CST 2016
 */
package jetsennet.jdlm.beans;

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
@ClassMapping(tableName = "PPN_RENT_FILE", keyGenerator = "uuid")
public class PpnRentFile implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_FILE_CODE = "FILE_CODE";
	public static String PROP_FILE_CREATE_TIME = "FILE_CREATE_TIME";
	public static String PROP_FILE_CREATE_USER = "FILE_CREATE_USER";
	public static String PROP_FILE_DESC = "FILE_DESC";
	public static String PROP_FILE_FIELD1 = "FILE_FIELD1";
	public static String PROP_FILE_FIELD2 = "FILE_FIELD2";
	public static String PROP_FILE_ID = "FILE_ID";
	public static String PROP_FILE_IS_DIR = "FILE_IS_DIR";
	public static String PROP_FILE_LOC_HOST = "FILE_LOC_HOST";
	public static String PROP_FILE_LOC_PATH = "FILE_LOC_PATH";
	public static String PROP_FILE_NAME = "FILE_NAME";
	public static String PROP_FILE_NAME_EXT = "FILE_NAME_EXT";
	public static String PROP_FILE_SIZE = "FILE_SIZE";
	public static String PROP_FILE_STATUS = "FILE_STATUS";
	public static String PROP_FILE_TYPE = "FILE_TYPE";
	
	/** primary key field of fileId */
	@FieldMapping(columnName = "FILE_ID", columnType = 12, primary = true)
	private String fileId;
	@FieldMapping(columnName = "FILE_CODE", columnType = 12)
	private String fileCode;
	@FieldMapping(columnName = "FILE_CREATE_TIME", columnType = 93)
	private Date fileCreateTime;
	@FieldMapping(columnName = "FILE_CREATE_USER", columnType = 12)
	private String fileCreateUser;
	@FieldMapping(columnName = "FILE_DESC", columnType = 12)
	private String fileDesc;
	@FieldMapping(columnName = "FILE_FIELD1", columnType = 12)
	private String fileField1;
	@FieldMapping(columnName = "FILE_FIELD2", columnType = 12)
	private String fileField2;
	@FieldMapping(columnName = "FILE_IS_DIR", columnType = 2)
	private Integer fileIsDir;
	@FieldMapping(columnName = "FILE_LOC_HOST", columnType = 12)
	private String fileLocHost;
	@FieldMapping(columnName = "FILE_LOC_PATH", columnType = 12)
	private String fileLocPath;
	@FieldMapping(columnName = "FILE_NAME", columnType = 12)
	private String fileName;
	@FieldMapping(columnName = "FILE_NAME_EXT", columnType = 12)
	private String fileNameExt;
	@FieldMapping(columnName = "FILE_SIZE", columnType = 2)
	private Integer fileSize;
	@FieldMapping(columnName = "FILE_STATUS", columnType = 2)
	private Integer fileStatus;
	@FieldMapping(columnName = "FILE_TYPE", columnType = 2)
	private Integer fileType;
	
	public PpnRentFile() {
		super();
	}

	public PpnRentFile(String fileId) {
		this.fileId = fileId;
	}

	public PpnRentFile(String fileCode, Date fileCreateTime, String fileCreateUser, String fileLocHost, String fileLocPath, String fileName, String fileNameExt, Integer fileStatus, Integer fileType) {
		this.fileCode = fileCode;
		this.fileCreateTime = fileCreateTime;
		this.fileCreateUser = fileCreateUser;
		this.fileLocHost = fileLocHost;
		this.fileLocPath = fileLocPath;
		this.fileName = fileName;
		this.fileNameExt = fileNameExt;
		this.fileStatus = fileStatus;
		this.fileType = fileType;
	}

	/**
	 * @return the fileCode
	 */
	public String getFileCode() {
		return this.fileCode;
	}
	
	/**
	 * @param fileCode the fileCode to set
	 */
	public void setFileCode(String value) {
		this.fileCode = value;
	}

	/**
	 * @return the fileCreateTime
	 */
	public Date getFileCreateTime() {
		return this.fileCreateTime;
	}
	
	/**
	 * @param fileCreateTime the fileCreateTime to set
	 */
	public void setFileCreateTime(Date value) {
		this.fileCreateTime = value;
	}

	/**
	 * @return the fileCreateUser
	 */
	public String getFileCreateUser() {
		return this.fileCreateUser;
	}
	
	/**
	 * @param fileCreateUser the fileCreateUser to set
	 */
	public void setFileCreateUser(String value) {
		this.fileCreateUser = value;
	}

	/**
	 * @return the fileDesc
	 */
	public String getFileDesc() {
		return this.fileDesc;
	}
	
	/**
	 * @param fileDesc the fileDesc to set
	 */
	public void setFileDesc(String value) {
		this.fileDesc = value;
	}

	/**
	 * @return the fileField1
	 */
	public String getFileField1() {
		return this.fileField1;
	}
	
	/**
	 * @param fileField1 the fileField1 to set
	 */
	public void setFileField1(String value) {
		this.fileField1 = value;
	}

	/**
	 * @return the fileField2
	 */
	public String getFileField2() {
		return this.fileField2;
	}
	
	/**
	 * @param fileField2 the fileField2 to set
	 */
	public void setFileField2(String value) {
		this.fileField2 = value;
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
	 * @return the fileIsDir
	 */
	public Integer getFileIsDir() {
		return this.fileIsDir;
	}
	
	/**
	 * @param fileIsDir the fileIsDir to set
	 */
	public void setFileIsDir(Integer value) {
		this.fileIsDir = value;
	}

	/**
	 * @return the fileLocHost
	 */
	public String getFileLocHost() {
		return this.fileLocHost;
	}
	
	/**
	 * @param fileLocHost the fileLocHost to set
	 */
	public void setFileLocHost(String value) {
		this.fileLocHost = value;
	}

	/**
	 * @return the fileLocPath
	 */
	public String getFileLocPath() {
		return this.fileLocPath;
	}
	
	/**
	 * @param fileLocPath the fileLocPath to set
	 */
	public void setFileLocPath(String value) {
		this.fileLocPath = value;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return this.fileName;
	}
	
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String value) {
		this.fileName = value;
	}

	/**
	 * @return the fileNameExt
	 */
	public String getFileNameExt() {
		return this.fileNameExt;
	}
	
	/**
	 * @param fileNameExt the fileNameExt to set
	 */
	public void setFileNameExt(String value) {
		this.fileNameExt = value;
	}

	/**
	 * @return the fileSize
	 */
	public Integer getFileSize() {
		return this.fileSize;
	}
	
	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(Integer value) {
		this.fileSize = value;
	}

	/**
	 * @return the fileStatus
	 */
	public Integer getFileStatus() {
		return this.fileStatus;
	}
	
	/**
	 * @param fileStatus the fileStatus to set
	 */
	public void setFileStatus(Integer value) {
		this.fileStatus = value;
	}

	/**
	 * @return the fileType
	 */
	public Integer getFileType() {
		return this.fileType;
	}
	
	/**
	 * @param fileType the fileType to set
	 */
	public void setFileType(Integer value) {
		this.fileType = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnRentFile)) {
			return false;
		}
		PpnRentFile other = (PpnRentFile)o;
		if (null == this.fileId) {
			if (other.fileId != null)
				return false;
		} else if (!this.fileId.equals(other.fileId))
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
		result = prime * result + ((fileId == null) ? 0 : fileId.hashCode());
		return result;
	}
	
}