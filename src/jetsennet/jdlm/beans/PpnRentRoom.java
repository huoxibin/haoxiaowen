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
 * 文件：jetsennet.jdlm.beans.PpnRentRoom.java
 * 日 期：Thu Nov 10 10:14:53 CST 2016
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
@ClassMapping(tableName = "PPN_RENT_ROOM", keyGenerator = "uuid")
public class PpnRentRoom implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_ROOM_CODE = "ROOM_CODE";
	public static String PROP_ROOM_CREATE_TIME = "ROOM_CREATE_TIME";
	public static String PROP_ROOM_DESC = "ROOM_DESC";
	public static String PROP_ROOM_FIELD1 = "ROOM_FIELD1";
	public static String PROP_ROOM_FIELD2 = "ROOM_FIELD2";
	public static String PROP_ROOM_ID = "ROOM_ID";
	public static String PROP_ROOM_LOCATION = "ROOM_LOCATION";
	public static String PROP_ROOM_NAME = "ROOM_NAME";
	public static String PROP_ROOM_STATUS = "ROOM_STATUS";
	public static String PROP_ROOM_TYPE = "ROOM_TYPE";
	
	/** primary key field of roomId */
	@FieldMapping(columnName = "ROOM_ID", columnType = 12, primary = true)
	private String roomId;
	@FieldMapping(columnName = "ROOM_CODE", columnType = 12)
	private String roomCode;
	@FieldMapping(columnName = "ROOM_CREATE_TIME", columnType = 93)
	private Date roomCreateTime;
	@FieldMapping(columnName = "ROOM_DESC", columnType = 12)
	private String roomDesc;
	@FieldMapping(columnName = "ROOM_FIELD1", columnType = 12)
	private String roomField1;
	@FieldMapping(columnName = "ROOM_FIELD2", columnType = 12)
	private String roomField2;
	@FieldMapping(columnName = "ROOM_LOCATION", columnType = 12)
	private String roomLocation;
	@FieldMapping(columnName = "ROOM_NAME", columnType = 12)
	private String roomName;
	@FieldMapping(columnName = "ROOM_STATUS", columnType = 2)
	private Integer roomStatus;
	@FieldMapping(columnName = "ROOM_TYPE", columnType = 2)
	private Integer roomType;
	
	public PpnRentRoom() {
		super();
	}

	public PpnRentRoom(String roomId) {
		this.roomId = roomId;
	}

	public PpnRentRoom(String roomCode, String roomName, Integer roomStatus) {
		this.roomCode = roomCode;
		this.roomName = roomName;
		this.roomStatus = roomStatus;
	}

	/**
	 * @return the roomCode
	 */
	public String getRoomCode() {
		return this.roomCode;
	}
	
	/**
	 * @param roomCode the roomCode to set
	 */
	public void setRoomCode(String value) {
		this.roomCode = value;
	}

	/**
	 * @return the roomCreateTime
	 */
	public Date getRoomCreateTime() {
		return this.roomCreateTime;
	}
	
	/**
	 * @param roomCreateTime the roomCreateTime to set
	 */
	public void setRoomCreateTime(Date value) {
		this.roomCreateTime = value;
	}

	/**
	 * @return the roomDesc
	 */
	public String getRoomDesc() {
		return this.roomDesc;
	}
	
	/**
	 * @param roomDesc the roomDesc to set
	 */
	public void setRoomDesc(String value) {
		this.roomDesc = value;
	}

	/**
	 * @return the roomField1
	 */
	public String getRoomField1() {
		return this.roomField1;
	}
	
	/**
	 * @param roomField1 the roomField1 to set
	 */
	public void setRoomField1(String value) {
		this.roomField1 = value;
	}

	/**
	 * @return the roomField2
	 */
	public String getRoomField2() {
		return this.roomField2;
	}
	
	/**
	 * @param roomField2 the roomField2 to set
	 */
	public void setRoomField2(String value) {
		this.roomField2 = value;
	}

	/**
	 * @return the roomId
	 */
	public String getRoomId() {
		return this.roomId;
	}
	
	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(String value) {
		this.roomId = value;
	}

	/**
	 * @return the roomLocation
	 */
	public String getRoomLocation() {
		return this.roomLocation;
	}
	
	/**
	 * @param roomLocation the roomLocation to set
	 */
	public void setRoomLocation(String value) {
		this.roomLocation = value;
	}

	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return this.roomName;
	}
	
	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String value) {
		this.roomName = value;
	}

	/**
	 * @return the roomStatus
	 */
	public Integer getRoomStatus() {
		return this.roomStatus;
	}
	
	/**
	 * @param roomStatus the roomStatus to set
	 */
	public void setRoomStatus(Integer value) {
		this.roomStatus = value;
	}

	/**
	 * @return the roomType
	 */
	public Integer getRoomType() {
		return this.roomType;
	}
	
	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(Integer value) {
		this.roomType = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof PpnRentRoom)) {
			return false;
		}
		PpnRentRoom other = (PpnRentRoom)o;
		if (null == this.roomId) {
			if (other.roomId != null)
				return false;
		} else if (!this.roomId.equals(other.roomId))
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
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		return result;
	}
	
}