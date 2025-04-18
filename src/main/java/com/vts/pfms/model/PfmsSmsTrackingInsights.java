package com.vts.pfms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name ="pfms_sms_track_insights")
public class PfmsSmsTrackingInsights {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long SmsTrackingInsightsId;
	private long SmsTrackingId;
    private long EmpId;
	private String Message;
	private String SmsPurpose;
	private String SmsStatus;
	private long ActionItemP;
	private long ActionItemTP;
	private long ActionItemDP;
	private long MilestoneActionP;
	private long MilestoneActionTP;
	private long MilestoneActionDP;
	private long MeetingActionP;
	private long MeetingActionTP;
	private long MeetingActionDP;
	private String SmsSentDate;
	private String CreatedDate;
}
