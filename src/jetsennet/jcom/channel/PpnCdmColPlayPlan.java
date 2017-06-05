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
 * 文件：jetsennet.ppn.trm.bean.PpnCdmColPlayPlan.java
 * 日 期：Thu Aug 04 19:28:36 CST 2016
 */
package jetsennet.jcom.channel;

import java.io.Serializable;
import java.util.Date;
import org.uorm.orm.annotation.ClassMapping;
import org.uorm.orm.annotation.FieldMapping;


@ClassMapping(tableName = "PPN_CDM_COL_PLAY_PLAN", keyGenerator = "uuid")
public class PpnCdmColPlayPlan implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_COL_CREATE_TIME = "COL_CREATE_TIME";
	public static String PROP_COL_ID = "COL_ID";
	public static String PROP_CREATE_TYPE = "CREATE_TYPE";
	public static String PROP_PERIOD_BEGIN_DATE = "PERIOD_BEGIN_DATE";
	public static String PROP_PERIOD_CODE = "PERIOD_CODE";
	public static String PROP_PERIOD_COMMENT = "PERIOD_COMMENT";
	public static String PROP_PERIOD_END_DATE = "PERIOD_END_DATE";
	public static String PROP_PERIOD_TYPE = "PERIOD_TYPE";
	public static String PROP_PLAN_AUDIO_LANG_CODE = "PLAN_AUDIO_LANG_CODE";
	public static String PROP_PLAN_AUDIO_LANG_NAME = "PLAN_AUDIO_LANG_NAME";
	public static String PROP_PLAN_BEGIN_TIME = "PLAN_BEGIN_TIME";
	public static String PROP_PLAN_CHAN_CODE = "PLAN_CHAN_CODE";
	public static String PROP_PLAN_CODE = "PLAN_CODE";
	public static String PROP_PLAN_DURATION = "PLAN_DURATION";
	public static String PROP_PLAN_FIELD1 = "PLAN_FIELD1";
	public static String PROP_PLAN_FIELD2 = "PLAN_FIELD2";
	public static String PROP_PLAN_ID = "PLAN_ID";
	public static String PROP_PLAN_IS_FIRST_PLAY = "PLAN_IS_FIRST_PLAY";
	public static String PROP_PLAN_IS_LIVE = "PLAN_IS_LIVE";
	public static String PROP_PLAN_LIMIT_ADSEG_SUM = "PLAN_LIMIT_ADSEG_SUM";
	public static String PROP_PLAN_LIMIT_ADTIME_LENGTH = "PLAN_LIMIT_ADTIME_LENGTH";
	public static String PROP_PLAN_PARENT_CODE = "PLAN_PARENT_CODE";
	public static String PROP_PLAN_SUBTITLE_LANG_CODE = "PLAN_SUBTITLE_LANG_CODE";
	public static String PROP_PLAN_SUBTITLE_LANG_NAME = "PLAN_SUBTITLE_LANG_NAME";
	public static String PROP_PLAN_WEEKDAY = "PLAN_WEEKDAY";
	
	/** primary key field of planId */
	@FieldMapping(columnName = "PLAN_ID", columnType = 12, primary = true)
	private String planId;
	@FieldMapping(columnName = "COL_CREATE_TIME", columnType = 93)
	private Date colCreateTime;
	/** foreign key field of PPN_CDM_COLUMN.COL_ID */
	@FieldMapping(columnName = "COL_ID", columnType = 12)
	private String colId;
	@FieldMapping(columnName = "CREATE_TYPE", columnType = 2)
	private Integer createType;
	@FieldMapping(columnName = "PERIOD_BEGIN_DATE", columnType = 12)
	private String periodBeginDate;
	@FieldMapping(columnName = "PERIOD_CODE", columnType = 12)
	private String periodCode;
	@FieldMapping(columnName = "PERIOD_COMMENT", columnType = 12)
	private String periodComment;
	@FieldMapping(columnName = "PERIOD_END_DATE", columnType = 12)
	private String periodEndDate;
	@FieldMapping(columnName = "PERIOD_TYPE", columnType = 2)
	private Integer periodType;
	@FieldMapping(columnName = "PLAN_AUDIO_LANG_CODE", columnType = 12)
	private String planAudioLangCode;
	@FieldMapping(columnName = "PLAN_AUDIO_LANG_NAME", columnType = 12)
	private String planAudioLangName;
	@FieldMapping(columnName = "PLAN_BEGIN_TIME", columnType = 12)
	private String planBeginTime;
	@FieldMapping(columnName = "PLAN_CHAN_CODE", columnType = 12)
	private String planChanCode;
	@FieldMapping(columnName = "PLAN_CODE", columnType = 12)
	private String planCode;
	@FieldMapping(columnName = "PLAN_DURATION", columnType = 12)
	private String planDuration;
	@FieldMapping(columnName = "PLAN_FIELD1", columnType = 12)
	private String planField1;
	@FieldMapping(columnName = "PLAN_FIELD2", columnType = 12)
	private String planField2;
	@FieldMapping(columnName = "PLAN_IS_FIRST_PLAY", columnType = 2)
	private Integer planIsFirstPlay;
	@FieldMapping(columnName = "PLAN_IS_LIVE", columnType = 2)
	private Integer planIsLive;
	@FieldMapping(columnName = "PLAN_LIMIT_ADSEG_SUM", columnType = 2)
	private Integer planLimitAdsegSum;
	@FieldMapping(columnName = "PLAN_LIMIT_ADTIME_LENGTH", columnType = 12)
	private String planLimitAdtimeLength;
	@FieldMapping(columnName = "PLAN_PARENT_CODE", columnType = 12)
	private String planParentCode;
	@FieldMapping(columnName = "PLAN_SUBTITLE_LANG_CODE", columnType = 12)
	private String planSubtitleLangCode;
	@FieldMapping(columnName = "PLAN_SUBTITLE_LANG_NAME", columnType = 12)
	private String planSubtitleLangName;
	@FieldMapping(columnName = "PLAN_WEEKDAY", columnType = 12)
	private String planWeekday;
	
	public PpnCdmColPlayPlan() {
		super();
	}

	public PpnCdmColPlayPlan(String planId) {
		this.planId = planId;
	}

	public PpnCdmColPlayPlan(String planChanCode, String planCode) {
		this.planChanCode = planChanCode;
		this.planCode = planCode;
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

	/**
	 * @return the periodBeginDate
	 */
	public String getPeriodBeginDate() {
		return this.periodBeginDate;
	}
	
	/**
	 * @param periodBeginDate the periodBeginDate to set
	 */
	public void setPeriodBeginDate(String value) {
		this.periodBeginDate = value;
	}

	/**
	 * @return the periodCode
	 */
	public String getPeriodCode() {
		return this.periodCode;
	}
	
	/**
	 * @param periodCode the periodCode to set
	 */
	public void setPeriodCode(String value) {
		this.periodCode = value;
	}

	/**
	 * @return the periodComment
	 */
	public String getPeriodComment() {
		return this.periodComment;
	}
	
	/**
	 * @param periodComment the periodComment to set
	 */
	public void setPeriodComment(String value) {
		this.periodComment = value;
	}

	/**
	 * @return the periodEndDate
	 */
	public String getPeriodEndDate() {
		return this.periodEndDate;
	}
	
	/**
	 * @param periodEndDate the periodEndDate to set
	 */
	public void setPeriodEndDate(String value) {
		this.periodEndDate = value;
	}

	/**
	 * @return the periodType
	 */
	public Integer getPeriodType() {
		return this.periodType;
	}
	
	/**
	 * @param periodType the periodType to set
	 */
	public void setPeriodType(Integer value) {
		this.periodType = value;
	}

	/**
	 * @return the planAudioLangCode
	 */
	public String getPlanAudioLangCode() {
		return this.planAudioLangCode;
	}
	
	/**
	 * @param planAudioLangCode the planAudioLangCode to set
	 */
	public void setPlanAudioLangCode(String value) {
		this.planAudioLangCode = value;
	}

	/**
	 * @return the planAudioLangName
	 */
	public String getPlanAudioLangName() {
		return this.planAudioLangName;
	}
	
	/**
	 * @param planAudioLangName the planAudioLangName to set
	 */
	public void setPlanAudioLangName(String value) {
		this.planAudioLangName = value;
	}

	/**
	 * @return the planBeginTime
	 */
	public String getPlanBeginTime() {
		return this.planBeginTime;
	}
	
	/**
	 * @param planBeginTime the planBeginTime to set
	 */
	public void setPlanBeginTime(String value) {
		this.planBeginTime = value;
	}

	/**
	 * @return the planChanCode
	 */
	public String getPlanChanCode() {
		return this.planChanCode;
	}
	
	/**
	 * @param planChanCode the planChanCode to set
	 */
	public void setPlanChanCode(String value) {
		this.planChanCode = value;
	}

	/**
	 * @return the planCode
	 */
	public String getPlanCode() {
		return this.planCode;
	}
	
	/**
	 * @param planCode the planCode to set
	 */
	public void setPlanCode(String value) {
		this.planCode = value;
	}

	/**
	 * @return the planDuration
	 */
	public String getPlanDuration() {
		return this.planDuration;
	}
	
	/**
	 * @param planDuration the planDuration to set
	 */
	public void setPlanDuration(String value) {
		this.planDuration = value;
	}

	/**
	 * @return the planField1
	 */
	public String getPlanField1() {
		return this.planField1;
	}
	
	/**
	 * @param planField1 the planField1 to set
	 */
	public void setPlanField1(String value) {
		this.planField1 = value;
	}

	/**
	 * @return the planField2
	 */
	public String getPlanField2() {
		return this.planField2;
	}
	
	/**
	 * @param planField2 the planField2 to set
	 */
	public void setPlanField2(String value) {
		this.planField2 = value;
	}

	/**
	 * @return the planId
	 */
	public String getPlanId() {
		return this.planId;
	}
	
	/**
	 * @param planId the planId to set
	 */
	public void setPlanId(String value) {
		this.planId = value;
	}

	/**
	 * @return the planIsFirstPlay
	 */
	public Integer getPlanIsFirstPlay() {
		return this.planIsFirstPlay;
	}
	
	/**
	 * @param planIsFirstPlay the planIsFirstPlay to set
	 */
	public void setPlanIsFirstPlay(Integer value) {
		this.planIsFirstPlay = value;
	}

	/**
	 * @return the planIsLive
	 */
	public Integer getPlanIsLive() {
		return this.planIsLive;
	}
	
	/**
	 * @param planIsLive the planIsLive to set
	 */
	public void setPlanIsLive(Integer value) {
		this.planIsLive = value;
	}

	/**
	 * @return the planLimitAdsegSum
	 */
	public Integer getPlanLimitAdsegSum() {
		return this.planLimitAdsegSum;
	}
	
	/**
	 * @param planLimitAdsegSum the planLimitAdsegSum to set
	 */
	public void setPlanLimitAdsegSum(Integer value) {
		this.planLimitAdsegSum = value;
	}

	/**
	 * @return the planLimitAdtimeLength
	 */
	public String getPlanLimitAdtimeLength() {
		return this.planLimitAdtimeLength;
	}
	
	/**
	 * @param planLimitAdtimeLength the planLimitAdtimeLength to set
	 */
	public void setPlanLimitAdtimeLength(String value) {
		this.planLimitAdtimeLength = value;
	}

	/**
	 * @return the planParentCode
	 */
	public String getPlanParentCode() {
		return this.planParentCode;
	}
	
	/**
	 * @param planParentCode the planParentCode to set
	 */
	public void setPlanParentCode(String value) {
		this.planParentCode = value;
	}

	/**
	 * @return the planSubtitleLangCode
	 */
	public String getPlanSubtitleLangCode() {
		return this.planSubtitleLangCode;
	}
	
	/**
	 * @param planSubtitleLangCode the planSubtitleLangCode to set
	 */
	public void setPlanSubtitleLangCode(String value) {
		this.planSubtitleLangCode = value;
	}

	/**
	 * @return the planSubtitleLangName
	 */
	public String getPlanSubtitleLangName() {
		return this.planSubtitleLangName;
	}
	
	/**
	 * @param planSubtitleLangName the planSubtitleLangName to set
	 */
	public void setPlanSubtitleLangName(String value) {
		this.planSubtitleLangName = value;
	}

	/**
	 * @return the planWeekday
	 */
	public String getPlanWeekday() {
		return this.planWeekday;
	}
	
	/**
	 * @param planWeekday the planWeekday to set
	 */
	public void setPlanWeekday(String value) {
		this.planWeekday = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnCdmColPlayPlan)) {
			return false;
		}
		PpnCdmColPlayPlan other = (PpnCdmColPlayPlan)o;
		if (null == this.planId) {
			if (other.planId != null)
				return false;
		} else if (!this.planId.equals(other.planId))
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
		result = prime * result + ((planId == null) ? 0 : planId.hashCode());
		return result;
	}
	
}