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
 * 文件：jetsennet.ppn.bean.PpnBcProg.java
 * 日 期：Tue Aug 02 20:42:05 CST 2016
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
@ClassMapping(tableName = "PPN_MSG ", keyGenerator = "uuid")
public class PpnMsg implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String MSG_ID = "MSG_ID";
	public static String MSG_PARENT_ID = "MSG_PARENT_ID";
	public static String MSG_TYPE = "MSG_TYPE";
	public static String MSG_STATUS = "MSG_STATUS";
	public static String MSG_DESC = "MSG_DESC";
	public static String MSG_USER = "MSG_USER";
	public static String MSG_TIME = "MSG_TIME";
	public static String MSG_SEND_TO = "MSG_SEND_TO";
	public static String MSG_SEND_TO_NAME = "MSG_SEND_TO_NAME";
	public static String MSG_LEVEL = "MSG_LEVEL";
	public static String MSG_OBJ_NAME = "MSG_OBJ_NAME";
	public static String MSG_OBJ_VALUE = "MSG_OBJ_VALUE";
	public static String MSG_FIELD1 = "MSG_FIELD1";
	public static String MSG_FIELD3 = "MSG_FIELD3";
	
	
	/** primary key field of progId */
	@FieldMapping(columnName = "MSG_ID", columnType = 12, primary = true)
	private String msgId;
	@FieldMapping(columnName = "MSG_PARENT_ID", columnType = 12)
	private String  msgParentId;
	@FieldMapping(columnName = "MSG_TYPE", columnType = 2)
	private Integer msgType;
	@FieldMapping(columnName = "MSG_STATUS", columnType = 2)
	private Integer msgStatus=1;
	@FieldMapping(columnName = "MSG_DESC", columnType = 12)
	private String msgDesc;
	@FieldMapping(columnName = "MSG_USER", columnType = 12)
	private String  msgUser;
	@FieldMapping(columnName = "MSG_TIME", columnType = 93)
	private Date msgTime;
	@FieldMapping(columnName = "MSG_SEND_TO", columnType = 12)
	private String msgSendTo;
	@FieldMapping(columnName = "MSG_LEVEL", columnType = 2)
	private Integer msgLevel;
	@FieldMapping(columnName = "MSG_OBJ_NAME", columnType = 12)
	private String msgObjName;
	@FieldMapping(columnName = "MSG_OBJ_VALUE", columnType = 12)
	private String msgObjValue;
	@FieldMapping(columnName = "MSG_FIELD1", columnType = 12)
	private String msgField1;
	@FieldMapping(columnName = "MSG_FIELD3", columnType = 12)
	private String msgField3;
	@FieldMapping(columnName = "MSG_SEND_TO_NAME", columnType = 12)
	private String msgSendToName;
	
	
	public PpnMsg() {
		super();
	}

	public PpnMsg(String msgId) {
		this.msgId = msgId;
	}


	
	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgParentId() {
		return msgParentId;
	}

	public void setMsgParentId(String msgParentId) {
		this.msgParentId = msgParentId;
	}

	public Integer getMsgType() {
		return msgType;
	}

	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}

	public String getMsgSendToName() {
		return msgSendToName;
	}

	public void setMsgSendToName(String msgSendToName) {
		this.msgSendToName = msgSendToName;
	}

	public Integer getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(Integer msgStatus) {
		this.msgStatus = msgStatus;
	}

	public String getMsgDesc() {
		return msgDesc;
	}

	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}

	public String getMsgUser() {
		return msgUser;
	}

	public void setMsgUser(String msgUser) {
		this.msgUser = msgUser;
	}

	public Date getMsgTime() {
		return msgTime;
	}

	public void setMsgTime(Date msgTime) {
		this.msgTime = msgTime;
	}

	public String getMsgSendTo() {
		return msgSendTo;
	}

	public void setMsgSendTo(String msgSendTo) {
		this.msgSendTo = msgSendTo;
	}

	public Integer getMsgLevel() {
		return msgLevel;
	}

	public void setMsgLevel(Integer msgLevel) {
		this.msgLevel = msgLevel;
	}

	public String getMsgObjName() {
		return msgObjName;
	}

	public void setMsgObjName(String msgObjName) {
		this.msgObjName = msgObjName;
	}

	public String getMsgObjValue() {
		return msgObjValue;
	}

	public void setMsgObjValue(String msgObjValue) {
		this.msgObjValue = msgObjValue;
	}

	public String getMsgField1() {
		return msgField1;
	}

	public void setMsgField1(String msgField1) {
		this.msgField1 = msgField1;
	}

	public String getMsgField3() {
		return msgField3;
	}

	public void setMsgField3(String msgField3) {
		this.msgField3 = msgField3;
	}

	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnMsg)) {
			return false;
		}
		PpnMsg other = (PpnMsg)o;
		if (null == this.msgId) {
			if (other.msgId != null)
				return false;
		} else if (!this.msgId.equals(other.msgId))
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
		result = prime * result + ((msgId == null) ? 0 : msgId.hashCode());
		return result;
	}
	
}