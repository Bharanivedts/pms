package com.vts.pfms.print.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.vts.pfms.committee.model.Committee;
import com.vts.pfms.committee.model.CommitteeMeetingDPFMFrozen;
import com.vts.pfms.committee.model.PfmsNotification;
import com.vts.pfms.milestone.model.MilestoneActivityLevelConfiguration;
import com.vts.pfms.model.LabMaster;
import com.vts.pfms.print.model.CommitteeProjectBriefingFrozen;
import com.vts.pfms.print.model.FavouriteSlidesModel;
import com.vts.pfms.print.model.InitiationSanction;
import com.vts.pfms.print.model.InitiationsanctionCopyAddr;
import com.vts.pfms.print.model.PfmsBriefingTransaction;
import com.vts.pfms.print.model.ProjectOverallFinance;
import com.vts.pfms.print.model.ProjectSlideFreeze;
import com.vts.pfms.print.model.ProjectSlides;
import com.vts.pfms.print.model.RecDecDetails;
import com.vts.pfms.print.model.TechImages;
import com.vts.pfms.project.model.PfmsProjectData;

public interface PrintDao {

	public Object[] LabList(String LabCode) throws Exception;
	public List<Object[]> PfmsInitiationList(String InitiationId) throws Exception;
	public List<Object[]> GetCostBreakList(String InitiationId ,String projecttypeid)throws Exception;
	public LabMaster LabDetailes(String LabCod)throws Exception;
	public List<Object[]> ProjectIntiationDetailsList(String InitiationId) throws Exception;
	public List<Object[]> CostDetailsList(String InitiationId) throws Exception;
	public List<Object[]> ProjectInitiationScheduleList(String InitiationId) throws Exception;
	public List<Object[]> ProjectsList() throws Exception;
	public Object[] ProjectAttributes(String projectid) throws Exception;
	public List<Object[]> EBAndPMRCCount(String projectid) throws Exception;
	public List<Object[]> Milestones(String projectid,String committeeid) throws Exception;
	public List<Object[]> MilestoneSubsystems(String projectid) throws Exception;
	public List<Object[]> LastPMRCActions(String projectid,String committeeid) throws Exception;
	public List<Object[]> OldPMRCActions(String projectid, String committeeid) throws Exception;
	public List<Object[]> ProjectDetails(String ProjectId) throws Exception;
	public List<Object[]> GanttChartList(String ProjectId) throws Exception;
	public Object[] ProjectDataDetails(String projectid) throws Exception;
	public List<Object[]> OldPMRCIssuesList(String projectid) throws Exception;
	public List<Object[]> ProcurementStatusList(String projectid)throws Exception;
	public List<Object[]> RiskMatirxData(String projectid) throws Exception;
	public List<Object[]> LoginProjectDetailsList(String empid,String Logintype,String LabCode) throws Exception;
	public Object[] LastPMRCDecisions(String committeeid, String projectid) throws Exception;
	public List<Object[]> ActionPlanSixMonths(String projectid, int interval) throws Exception;
	public List<Object[]> LastPMRCActions1(String projectid, String committeeid) throws Exception;
	public List<String> ProjectsubProjectIdList(String projectid) throws Exception;
	public List<Object[]> ReviewMeetingList(String projectid, String committeecode) throws Exception;
	public Object[] TechWorkData(String projectid) throws Exception;
	public List<Object[]> ProjectRevList(String projectid) throws Exception;
	public List<Object[]> getMeetingSchedules(String ProjectId,String Month,String Year)throws Exception;
	public Object[] CommitteeScheduleEditData(String CommitteeScheduleId) throws Exception;
	public long getLastPmrcId(String projectid,String committeeid,String scheduleId) throws Exception;
	public long getNextScheduleId(String projectid,String committeeid) throws Exception;
	public int updateBriefingPaperFrozen(long schduleid) throws Exception;
	public int updateBriefingPaperFrozen(long schduleid,String BriefingPaperFrozen, String PresentationFrozen, String MinutesFrozen) throws Exception;
	public String getNextScheduleFrozen(long schduleid) throws Exception;
	public List<Object[]> MilestoneActivityStatus() throws Exception;
	public List<Object[]> MilestonesChange(String projectid, String milestoneactivitystatusid) throws Exception;
	public List<Object[]> GetProjectInitiationSanList() throws Exception;
	public Object[] GetProjectInitiationdata(String projectintitiationid)throws Exception;
	public List<Object[]> GetItemList(String projectid)throws Exception;
	public List<Object[]> GetAuthorityList()throws Exception;
	public List<Object[]> GetinitiationCopyAddr() throws Exception;
	public List<Object[]> GetinitiationDeptList ()throws Exception;
	public Long AddInitiationSanction(InitiationSanction initiationsac) throws Exception;
	public Long AddCopyAddress(InitiationsanctionCopyAddr copyaddress) throws Exception;
	public Object[] GetInitiationSanctionData(String initiationId)throws Exception;
	public List<Object[]> GetCopyAddressList (String initiationId)throws Exception;
	public int DeleteCopyAddress(String initiationsancoptid) throws Exception;
	public Long EditInitiationSanction(InitiationSanction initiationsac) throws Exception;
	public Object[] MileStoneLevelId(String ProjectId, String CommitteeId) throws Exception;
	public Long MilestoneLevelInsert(MilestoneActivityLevelConfiguration mod) throws Exception;
	public Long MilestoneLevelUpdate(MilestoneActivityLevelConfiguration mod) throws Exception;
	public List<Object[]> BreifingMilestoneDetails(String ProjectId, String CommitteeCode) throws Exception;
	public long insertTechImage(TechImages image) throws Exception;
	public List<TechImages> getTechList(String proId)throws Exception;
	public List<Object[]> SpecialCommitteesList(String LabCode) throws Exception;
	public Committee getCommitteeData(String committeeid) throws Exception;
	public long FreezeBriefingAdd(CommitteeProjectBriefingFrozen briefing)throws Exception;
	public CommitteeProjectBriefingFrozen getFrozenProjectBriefing(String scheduleId) throws Exception;
	public Object[] ProjectCommitteeMeetingsCount(String projectid, String CommitteeCode) throws Exception;
	public List<Object[]> AgendaList(String scheduleId) throws Exception;
	public List<Object[]> AgendaLinkedDocList(String scheduleid) throws Exception;
	public List<Object[]> BriefingScheduleList(String labcode,String committeeshortname, String projectid) throws Exception;
	public Object[] BriefingMeetingVenue(String projectid, String committeeid) throws Exception;
	public Object RequirementList(String initiationId) throws Exception;
	public Object headofaccountsList(String projecttypeid) throws Exception;
	public List<Object[]> GetRecDecDetails(String scheduledid)throws Exception;
	public Long RedDecAdd(RecDecDetails recdec)throws Exception;
	public long RecDecUpdate(RecDecDetails recdec)throws Exception;
	public Object[] GetRecDecData(String recdecid)throws Exception;
	public Object[] GetProjectdata(String projectid)throws Exception;
	public Long AddProjectSlideData( ProjectSlides slide )throws Exception;
	public Object[] GetProjectSildedata(String projectid)throws Exception;
	public ProjectSlides SlideAttachmentDownload(String achmentid) throws Exception;
	public Long EditProjectSlideData(ProjectSlides slide)throws Exception;
	public Long AddFreezeData (ProjectSlideFreeze freeze)throws Exception;
	public List<Object[]> RiskTypes() throws Exception;
	public List<Object[]> getProjectSlideList(String projectid)throws Exception;
	public ProjectSlideFreeze FreezedSlideAttachmentDownload(String achmentid) throws Exception;
	public List<Object[]> GetAllProjectSildedata(String projectid)throws Exception;
	public List<Object[]> GetTodayFreezedSlidedata(String projectid)throws Exception;
	public List<Object[]> CostDetailsListSummary(String initiationId)throws Exception;
	public int ProjectImageDelete(String techImagesId)throws Exception;
	public List<Object[]> totalProjecMilestones(String projectid)throws Exception;
	public int ProjectDecRecDelete(String recdecId) throws Exception;
	public int BriefingPointsUpdate(String point, String activityid, String status)throws Exception;
	public int PresentationNameUpdate(String presentationName, String scheduleid) throws Exception;
	public int MomUpdate(String presentationName, String scheduleid) throws Exception;
	public List<Object[]> getEnvisagedDemandList(String projectid)throws Exception;
	public Object getDirectorName(String labCode)throws Exception;
	public Object[] DoRtmdAdEmpData(String labCode)throws Exception;
	public long updateBreifingStatus(String briefingStatus,String sheduleId)throws Exception;
	public long insertBriefingTrans(PfmsBriefingTransaction briefingTransaction)throws Exception;
	public List<Object[]> getDivisionHeadList()throws Exception;
	public Object[] getDHId(String projectid)throws Exception;
	public Object getGHId(String projectid)throws Exception;
	public long PfmsNotificationAdd(PfmsNotification notification) throws Exception;
	public List<Object[]> BriefingScheduleFwdList(String labCode, String empId)throws Exception;
	public List<Object[]> BriefingScheduleFwdApprovedList(String labCode, String committeecode, String projectid, String empId)throws Exception;
	public Object[] getBriefingData(String sheduleId)throws Exception;
	public Object[] getUserId(String sheduleId)throws Exception;
	public String getEmpName(String empId)throws Exception;
	public List<Object[]> getBriefingRemarks(String sheduleId)throws Exception;
	public List<Object[]> Milestones(String projectid, String committeeCode, String date)throws Exception;
	public List<Object[]> LastPMRCActions(String projectid, String committeeid, String date) throws Exception;
	public List<Object[]> GetFreezingHistory(String projectid)throws Exception;
	public PfmsProjectData getPfmsProjectDataById(String projectId) throws Exception;
	public Long saveFavouriteSlides(FavouriteSlidesModel fSM)throws Exception;
	public List<Object[]> GETFavouriteSlides() throws Exception;
	public Long EditFavouriteSlides(FavouriteSlidesModel fSM)throws Exception;
	public int editTechImage(TechImages image)throws Exception;
	public long addOverallFinace(List<ProjectOverallFinance> list, String projectid)throws Exception;
	public List<Object[]> getrOverallFinance(String proid)throws Exception;
	public List<Object[]> otherMeetingList(String projectid)throws Exception;

}
