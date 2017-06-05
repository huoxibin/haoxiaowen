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
 * 文件：jetsennet.ppn.trm.bean.PpnCdmColumn.java
 * 日 期：Thu Aug 04 19:26:04 CST 2016
 */
package jetsennet.jcom.channel;

import java.io.Serializable;
import java.util.Date;
import org.uorm.orm.annotation.ClassMapping;
import org.uorm.orm.annotation.FieldMapping;

@ClassMapping(tableName = "PPN_CDM_COLUMN", keyGenerator = "uuid")
public class PpnCdmColumn implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_COL_AFD = "COL_AFD";
	public static String PROP_COL_AUDIO = "COL_AUDIO";
	public static String PROP_COL_CATEGORY_CODE = "COL_CATEGORY_CODE";
	public static String PROP_COL_CATEGORY_NAME = "COL_CATEGORY_NAME";
	public static String PROP_COL_CHAN_CODE = "COL_CHAN_CODE";
	public static String PROP_COL_CODE = "COL_CODE";
	public static String PROP_COL_COMMENT = "COL_COMMENT";
	public static String PROP_COL_COPYRIGHT_PLAN = "COL_COPYRIGHT_PLAN";
	public static String PROP_COL_CREATE_TIME = "COL_CREATE_TIME";
	public static String PROP_COL_DEPT_CODE = "COL_DEPT_CODE";
	public static String PROP_COL_FIELD1 = "COL_FIELD1";
	public static String PROP_COL_FIELD2 = "COL_FIELD2";
	public static String PROP_COL_FOREIGN_NAME = "COL_FOREIGN_NAME";
	public static String PROP_COL_ID = "COL_ID";
	public static String PROP_COL_IS_ARCHIVE = "COL_IS_ARCHIVE";
	public static String PROP_COL_MEDIA_TYPE = "COL_MEDIA_TYPE";
	public static String PROP_COL_MULTIPLE_TYPE = "COL_MULTIPLE_TYPE";
	public static String PROP_COL_NAME = "COL_NAME";
	public static String PROP_COL_NEWS_FLAG = "COL_NEWS_FLAG";
	public static String PROP_COL_PLAY_BEGIN_DATE = "COL_PLAY_BEGIN_DATE";
	public static String PROP_COL_PLAY_END_DATE = "COL_PLAY_END_DATE";
	public static String PROP_COL_PROD_CLASS = "COL_PROD_CLASS";
	public static String PROP_COL_PROD_MODE = "COL_PROD_MODE";
	public static String PROP_COL_PRODUCER = "COL_PRODUCER";
	public static String PROP_COL_PRO_MATERIAL_PRO = "COL_PRO_MATERIAL_PRO";
	public static String PROP_COL_STATUS = "COL_STATUS";
	public static String PROP_COL_SUBTYPE_CODE = "COL_SUBTYPE_CODE";
	public static String PROP_COL_SUBTYPE_NAME = "COL_SUBTYPE_NAME";
	public static String PROP_COL_THROUGH_TYPE = "COL_THROUGH_TYPE";
	public static String PROP_COL_VIDEO = "COL_VIDEO";
	public static String PROP_COL_YEAR_FIRST_PLAY_SUM = "COL_YEAR_FIRST_PLAY_SUM";
	public static String PROP_CREATE_TYPE = "CREATE_TYPE";
	
	/** primary key field of colId */
	@FieldMapping(columnName = "COL_ID", columnType = 12, primary = true)
	private String colId;
	@FieldMapping(columnName = "COL_AFD", columnType = 2)
	private Integer colAfd;
	@FieldMapping(columnName = "COL_AUDIO", columnType = 2)
	private Integer colAudio;
	@FieldMapping(columnName = "COL_CATEGORY_CODE", columnType = 12)
	private String colCategoryCode;
	@FieldMapping(columnName = "COL_CATEGORY_NAME", columnType = 12)
	private String colCategoryName;
	@FieldMapping(columnName = "COL_CHAN_CODE", columnType = 12)
	private String colChanCode;
	@FieldMapping(columnName = "COL_CODE", columnType = 12)
	private String colCode;
	@FieldMapping(columnName = "COL_COMMENT", columnType = 12)
	private String colComment;
	@FieldMapping(columnName = "COL_COPYRIGHT_PLAN", columnType = 12)
	private String colCopyrightPlan;
	@FieldMapping(columnName = "COL_CREATE_TIME", columnType = 93)
	private Date colCreateTime;
	@FieldMapping(columnName = "COL_DEPT_CODE", columnType = 12)
	private String colDeptCode;
	@FieldMapping(columnName = "COL_FIELD1", columnType = 12)
	private String colField1;
	@FieldMapping(columnName = "COL_FIELD2", columnType = 12)
	private String colField2;
	@FieldMapping(columnName = "COL_FOREIGN_NAME", columnType = 12)
	private String colForeignName;
	@FieldMapping(columnName = "COL_IS_ARCHIVE", columnType = 12)
	private String colIsArchive;
	@FieldMapping(columnName = "COL_MEDIA_TYPE", columnType = 2)
	private Integer colMediaType;
	@FieldMapping(columnName = "COL_MULTIPLE_TYPE", columnType = 12)
	private String colMultipleType;
	@FieldMapping(columnName = "COL_NAME", columnType = 12)
	private String colName;
	@FieldMapping(columnName = "COL_NEWS_FLAG", columnType = 2)
	private Integer colNewsFlag;
	@FieldMapping(columnName = "COL_PLAY_BEGIN_DATE", columnType = 12)
	private String colPlayBeginDate;
	@FieldMapping(columnName = "COL_PLAY_END_DATE", columnType = 12)
	private String colPlayEndDate;
	@FieldMapping(columnName = "COL_PROD_CLASS", columnType = 12)
	private String colProdClass;
	@FieldMapping(columnName = "COL_PROD_MODE", columnType = 12)
	private String colProdMode;
	@FieldMapping(columnName = "COL_PRODUCER", columnType = 12)
	private String colProducer;
	@FieldMapping(columnName = "COL_PRO_MATERIAL_PRO", columnType = 12)
	private String colProMaterialPro;
	@FieldMapping(columnName = "COL_STATUS", columnType = 2)
	private Integer colStatus;
	@FieldMapping(columnName = "COL_SUBTYPE_CODE", columnType = 12)
	private String colSubtypeCode;
	@FieldMapping(columnName = "COL_SUBTYPE_NAME", columnType = 12)
	private String colSubtypeName;
	@FieldMapping(columnName = "COL_THROUGH_TYPE", columnType = 2)
	private Integer colThroughType;
	@FieldMapping(columnName = "COL_VIDEO", columnType = 2)
	private Integer colVideo;
	@FieldMapping(columnName = "COL_YEAR_FIRST_PLAY_SUM", columnType = 2)
	private Integer colYearFirstPlaySum;
	@FieldMapping(columnName = "CREATE_TYPE", columnType = 2)
	private Integer createType;
	
	public PpnCdmColumn() {
		super();
	}

	public PpnCdmColumn(String colId) {
		this.colId = colId;
	}

	public PpnCdmColumn(String colCode, String colName) {
		this.colCode = colCode;
		this.colName = colName;
	}

	/**
	 * @return the colAfd
	 */
	public Integer getColAfd() {
		return this.colAfd;
	}
	
	/**
	 * @param colAfd the colAfd to set
	 */
	public void setColAfd(Integer value) {
		this.colAfd = value;
	}

	/**
	 * @return the colAudio
	 */
	public Integer getColAudio() {
		return this.colAudio;
	}
	
	/**
	 * @param colAudio the colAudio to set
	 */
	public void setColAudio(Integer value) {
		this.colAudio = value;
	}

	/**
	 * @return the colCategoryCode
	 */
	public String getColCategoryCode() {
		return this.colCategoryCode;
	}
	
	/**
	 * @param colCategoryCode the colCategoryCode to set
	 */
	public void setColCategoryCode(String value) {
		this.colCategoryCode = value;
	}

	/**
	 * @return the colCategoryName
	 */
	public String getColCategoryName() {
		return this.colCategoryName;
	}
	
	/**
	 * @param colCategoryName the colCategoryName to set
	 */
	public void setColCategoryName(String value) {
		this.colCategoryName = value;
	}

	/**
	 * @return the colChanCode
	 */
	public String getColChanCode() {
		return this.colChanCode;
	}
	
	/**
	 * @param colChanCode the colChanCode to set
	 */
	public void setColChanCode(String value) {
		this.colChanCode = value;
	}

	/**
	 * @return the colCode
	 */
	public String getColCode() {
		return this.colCode;
	}
	
	/**
	 * @param colCode the colCode to set
	 */
	public void setColCode(String value) {
		this.colCode = value;
	}

	/**
	 * @return the colComment
	 */
	public String getColComment() {
		return this.colComment;
	}
	
	/**
	 * @param colComment the colComment to set
	 */
	public void setColComment(String value) {
		this.colComment = value;
	}

	/**
	 * @return the colCopyrightPlan
	 */
	public String getColCopyrightPlan() {
		return this.colCopyrightPlan;
	}
	
	/**
	 * @param colCopyrightPlan the colCopyrightPlan to set
	 */
	public void setColCopyrightPlan(String value) {
		this.colCopyrightPlan = value;
	}

	/**
	 * @return the colCreateTime
	 */
	public Date getColCreateTime() {
		return this.colCreateTime;
	}
	
	/**
	 * @param colCreateTime the colCreateTime to set
	 */
	public void setColCreateTime(Date value) {
		this.colCreateTime = value;
	}

	/**
	 * @return the colDeptCode
	 */
	public String getColDeptCode() {
		return this.colDeptCode;
	}
	
	/**
	 * @param colDeptCode the colDeptCode to set
	 */
	public void setColDeptCode(String value) {
		this.colDeptCode = value;
	}

	/**
	 * @return the colField1
	 */
	public String getColField1() {
		return this.colField1;
	}
	
	/**
	 * @param colField1 the colField1 to set
	 */
	public void setColField1(String value) {
		this.colField1 = value;
	}

	/**
	 * @return the colField2
	 */
	public String getColField2() {
		return this.colField2;
	}
	
	/**
	 * @param colField2 the colField2 to set
	 */
	public void setColField2(String value) {
		this.colField2 = value;
	}

	/**
	 * @return the colForeignName
	 */
	public String getColForeignName() {
		return this.colForeignName;
	}
	
	/**
	 * @param colForeignName the colForeignName to set
	 */
	public void setColForeignName(String value) {
		this.colForeignName = value;
	}

	/**
	 * @return the colId
	 */
	public String getColId() {
		return this.colId;
	}
	
	/**
	 * @param colId the colId to set
	 */
	public void setColId(String value) {
		this.colId = value;
	}

	/**
	 * @return the colIsArchive
	 */
	public String getColIsArchive() {
		return this.colIsArchive;
	}
	
	/**
	 * @param colIsArchive the colIsArchive to set
	 */
	public void setColIsArchive(String value) {
		this.colIsArchive = value;
	}

	/**
	 * @return the colMediaType
	 */
	public Integer getColMediaType() {
		return this.colMediaType;
	}
	
	/**
	 * @param colMediaType the colMediaType to set
	 */
	public void setColMediaType(Integer value) {
		this.colMediaType = value;
	}

	/**
	 * @return the colMultipleType
	 */
	public String getColMultipleType() {
		return this.colMultipleType;
	}
	
	/**
	 * @param colMultipleType the colMultipleType to set
	 */
	public void setColMultipleType(String value) {
		this.colMultipleType = value;
	}

	/**
	 * @return the colName
	 */
	public String getColName() {
		return this.colName;
	}
	
	/**
	 * @param colName the colName to set
	 */
	public void setColName(String value) {
		this.colName = value;
	}

	/**
	 * @return the colNewsFlag
	 */
	public Integer getColNewsFlag() {
		return this.colNewsFlag;
	}
	
	/**
	 * @param colNewsFlag the colNewsFlag to set
	 */
	public void setColNewsFlag(Integer value) {
		this.colNewsFlag = value;
	}

	/**
	 * @return the colPlayBeginDate
	 */
	public String getColPlayBeginDate() {
		return this.colPlayBeginDate;
	}
	
	/**
	 * @param colPlayBeginDate the colPlayBeginDate to set
	 */
	public void setColPlayBeginDate(String value) {
		this.colPlayBeginDate = value;
	}

	/**
	 * @return the colPlayEndDate
	 */
	public String getColPlayEndDate() {
		return this.colPlayEndDate;
	}
	
	/**
	 * @param colPlayEndDate the colPlayEndDate to set
	 */
	public void setColPlayEndDate(String value) {
		this.colPlayEndDate = value;
	}

	/**
	 * @return the colProdClass
	 */
	public String getColProdClass() {
		return this.colProdClass;
	}
	
	/**
	 * @param colProdClass the colProdClass to set
	 */
	public void setColProdClass(String value) {
		this.colProdClass = value;
	}

	/**
	 * @return the colProdMode
	 */
	public String getColProdMode() {
		return this.colProdMode;
	}
	
	/**
	 * @param colProdMode the colProdMode to set
	 */
	public void setColProdMode(String value) {
		this.colProdMode = value;
	}

	/**
	 * @return the colProducer
	 */
	public String getColProducer() {
		return this.colProducer;
	}
	
	/**
	 * @param colProducer the colProducer to set
	 */
	public void setColProducer(String value) {
		this.colProducer = value;
	}

	/**
	 * @return the colProMaterialPro
	 */
	public String getColProMaterialPro() {
		return this.colProMaterialPro;
	}
	
	/**
	 * @param colProMaterialPro the colProMaterialPro to set
	 */
	public void setColProMaterialPro(String value) {
		this.colProMaterialPro = value;
	}

	/**
	 * @return the colStatus
	 */
	public Integer getColStatus() {
		return this.colStatus;
	}
	
	/**
	 * @param colStatus the colStatus to set
	 */
	public void setColStatus(Integer value) {
		this.colStatus = value;
	}

	/**
	 * @return the colSubtypeCode
	 */
	public String getColSubtypeCode() {
		return this.colSubtypeCode;
	}
	
	/**
	 * @param colSubtypeCode the colSubtypeCode to set
	 */
	public void setColSubtypeCode(String value) {
		this.colSubtypeCode = value;
	}

	/**
	 * @return the colSubtypeName
	 */
	public String getColSubtypeName() {
		return this.colSubtypeName;
	}
	
	/**
	 * @param colSubtypeName the colSubtypeName to set
	 */
	public void setColSubtypeName(String value) {
		this.colSubtypeName = value;
	}

	/**
	 * @return the colThroughType
	 */
	public Integer getColThroughType() {
		return this.colThroughType;
	}
	
	/**
	 * @param colThroughType the colThroughType to set
	 */
	public void setColThroughType(Integer value) {
		this.colThroughType = value;
	}

	/**
	 * @return the colVideo
	 */
	public Integer getColVideo() {
		return this.colVideo;
	}
	
	/**
	 * @param colVideo the colVideo to set
	 */
	public void setColVideo(Integer value) {
		this.colVideo = value;
	}

	/**
	 * @return the colYearFirstPlaySum
	 */
	public Integer getColYearFirstPlaySum() {
		return this.colYearFirstPlaySum;
	}
	
	/**
	 * @param colYearFirstPlaySum the colYearFirstPlaySum to set
	 */
	public void setColYearFirstPlaySum(Integer value) {
		this.colYearFirstPlaySum = value;
	}

	/**
	 * @return the createType
	 */
	public Integer getCreateType() {
		return this.createType;
	}
	
	/**
	 * @param createType the createType to set
	 */
	public void setCreateType(Integer value) {
		this.createType = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnCdmColumn)) {
			return false;
		}
		PpnCdmColumn other = (PpnCdmColumn)o;
		if (null == this.colId) {
			if (other.colId != null)
				return false;
		} else if (!this.colId.equals(other.colId))
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
		result = prime * result + ((colId == null) ? 0 : colId.hashCode());
		return result;
	}
	
}