package com.nitin.activemq.activemqeaxample.model;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = SeoEvent.class)
public class SeoEvent {
	private String transactionId;

	private String corelationId;

	private String timeStamp;

	private CallDirectionEnum callDirection;

	private EnviromentEnum enviroment;

	private String hostName;

	private BusinessDomainEnum businessDomain;

	private String sourceSystemId;

	private MessageTypeEnum messageType;

	private String messageName;

	private String microServiceName;

	public SeoEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeoEvent(String transactionId, String corelationId, String timeStamp, CallDirectionEnum callDirection,
			EnviromentEnum enviroment, String hostName, BusinessDomainEnum businessDomain, String sourceSystemId,
			MessageTypeEnum messageType, String messageName) {
		super();
		this.transactionId = transactionId;
		this.corelationId = corelationId;
		this.timeStamp = timeStamp;
		this.callDirection = callDirection;
		this.enviroment = enviroment;
		this.hostName = hostName;
		this.businessDomain = businessDomain;
		this.sourceSystemId = sourceSystemId;
		this.messageType = messageType;
		this.messageName = messageName;
	}

	public String getMicroServiceName() {
		return microServiceName;
	}

	public void setMicroServiceName(String microServiceName) {
		this.microServiceName = microServiceName;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getCorelationId() {
		return corelationId;
	}

	public void setCorelationId(String corelationId) {
		this.corelationId = corelationId;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public CallDirectionEnum getCallDirection() {
		return callDirection;
	}

	public void setCallDirection(CallDirectionEnum callDirection) {
		this.callDirection = callDirection;
	}

	public EnviromentEnum getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(EnviromentEnum enviroment) {
		this.enviroment = enviroment;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public BusinessDomainEnum getBusinessDomain() {
		return businessDomain;
	}

	public void setBusinessDomain(BusinessDomainEnum businessDomain) {
		this.businessDomain = businessDomain;
	}

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public MessageTypeEnum getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageTypeEnum messageType) {
		this.messageType = messageType;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	@Override
	public String toString() {

		JSONObject jsonInfo = new JSONObject();

		try {
			jsonInfo.put("sourceSystemId", this.sourceSystemId);
			jsonInfo.put("messageType", messageType);
			jsonInfo.put("messageName", messageName);
			jsonInfo.put("timeStamp", timeStamp);
			jsonInfo.put("callDirection", callDirection);
			jsonInfo.put("enviroment", enviroment);
			jsonInfo.put("businessDomain", businessDomain);
			jsonInfo.put("hostName", hostName);
			jsonInfo.put("transactionId", transactionId);
			jsonInfo.put("corelationId", corelationId);

		} catch (JSONException e1) {
		}
		return jsonInfo.toString();
	}

}