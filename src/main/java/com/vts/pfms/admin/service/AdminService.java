package com.vts.pfms.admin.service;

import java.util.List;

import com.vts.pfms.admin.dto.EmployeeDesigDto;
import com.vts.pfms.admin.dto.PfmsLoginRoleSecurityDto;
import com.vts.pfms.admin.dto.PfmsRtmddoDto;
import com.vts.pfms.admin.dto.UserManageAdd;
import com.vts.pfms.admin.model.AuditPatches;
import com.vts.pfms.admin.model.DivisionMaster;
import com.vts.pfms.admin.model.Expert;
import com.vts.pfms.admin.model.PfmsRtmddo;
import com.vts.pfms.login.Login;
public interface AdminService {

	public List<Object[]> LoginTypeList() throws Exception;
	public List<Object[]> EmployeeList() throws Exception;
	public List<Object[]> RoleList() throws Exception;
	public List<Object[]> EmployeeList1(String LabCode) throws Exception;
	public List<Object[]> LoginTypeList1()throws Exception;
	public Long LoginTypeAddSubmit(PfmsLoginRoleSecurityDto loginrolesecurity,String UserId) throws Exception;
	public Long LoginTypeRevoke(String LoginId,String UserId) throws Exception;
	public List<Object[]> LoginTypeEditData(String LoginId) throws Exception;
	public Long LoginTypeEditSubmit(PfmsLoginRoleSecurityDto loginrolesecurity,String LoginId,String UserId) throws Exception;
	public List<Object[]> NotificationList(String EmpId) throws Exception;
	public List<Object[]> EmployeeListAll() throws Exception;
	public List<Object[]> Rtmddo() throws Exception;
	public long RtmddoInsert(PfmsRtmddoDto dto)throws Exception;
	public List<Object[]> DivisionList()throws Exception;
	public Login UserManagerEditData(String LoginId )throws Exception;
	public int UserManagerDelete(String LoginId,String Userid)throws Exception;
	public Long UserManagerInsert(UserManageAdd UserManageAdd, String LogId)throws Exception;
	public Long UserManagerInsertFromExcel(UserManageAdd UserManageAdd, String Userid) throws Exception;
	public int UserManagerUpdate(UserManageAdd UserManageAdd,String Userid)throws Exception;
	public List<Object[]> GetExpertList() throws Exception;
	public List<Object[]> GetDesignation() throws Exception;
	public int[] checkAbility( String p0, String p1) throws Exception;
	public int checkAbility2( String p0,  String p1) throws Exception;
	public Long addExpert( Expert p0) throws Exception;
	public Long ExpertRevoke( String p0,  String p1) throws Exception;
	public List<Object[]> getEditDetails( String p0) throws Exception;
	public Long editExpert( Expert p0) throws Exception;
	public List<Object[]> AuditStampingList(String loginid,String Fromdateparam,String Todateparam)  throws Exception ;
	public List<Object[]> UsernameList() throws Exception ;
	public List<Object[]> UserManagerList()throws Exception;
	public int UserNamePresentCount(String UserName )throws Exception;
	public List<Object[]> presentEmpList()throws Exception;
	public List<Object[]> DesignationList() throws Exception;
	public Object[] DesignationData(String desigid) throws Exception;
	public long DesignationEditSubmit(EmployeeDesigDto dto) throws Exception;
	public long DesignationAddSubmit(EmployeeDesigDto dto) throws Exception;
	public Object[] DesignationAddCheck(String desigcode, String designation) throws Exception;
	public Object[] DesignationEditCheck(String desigcode, String designation, String desigid) throws Exception;
	public List<Object[]> DivisionMasterList(String LabCode)throws Exception;
    public List<Object[]> DivisionGroupList() throws Exception;
	public List<Object[]> DivisionHeadList()  throws Exception;
	public List<Object[]> DivisionMasterEditData(String DivisionId) throws Exception;
	public Object[] DivisionAddCheck(String dCode, String dName) throws Exception;
	public long DivisionAddSubmit(DivisionMaster dmo)throws Exception;
	public int DivisionMasterUpdate(DivisionMaster add, String userid)throws Exception;
	public List<Object[]> LoginTypeRoles() throws Exception;
	public List<Object[]> FormDetailsList(String LoginType,String ModuleId) throws Exception;
	public List<Object[]> FormModulesList() throws Exception;
	public Long FormRoleActive(String formroleaccessid) throws Exception;
	public Object[] EmployeeData(String empid) throws Exception;
	public List<Object[]> LoginEditEmpList(String LabCode) throws Exception;
	public String GenExpertNo() throws Exception;
	public List<Object[]> AllLabList() throws Exception;
	public Long LabHqChange(String FormRoleAccessId, String Value ) throws Exception;
	public int updateformroleaccess(String formroleaccessid,String detailsid,String isactive,String logintype, String UserId)throws Exception;
	public int resetPassword(String lid,String UserId, String labcode) throws Exception;
	public int insertEmployeeData() throws Exception;
	public List<Object[]> StatsEmployeeList(String logintype, String division, String labCode)throws Exception;
	public List<Object[]> getEmployeeWiseCount(long employeeId, String fromDate, String toDate)throws Exception;
	public List<Object[]> initiationApprovalAuthority(String labcode) throws Exception;
	public PfmsRtmddo getApprovalAuthById(String RtmddoId) throws Exception;
	public int approvalAuthRevoke(String RtmddoId) throws Exception;
	public List<Object[]> MailConfigurationList()throws Exception;
	public long DeleteMailConfiguration(long MailConfigurationId, String ModifiedBy)throws Exception;
	public long AddMailConfiguration(String userName, String password, String hostType, String createdBy,String Host,String port)throws Exception;
	public Object[] MailConfigurationEditList(long MailConfigurationId)throws Exception;
	public long UpdateMailConfiguration(long MailConfigurationId,String userName,String hostType, String modifiedBy,String Host,String Port,String Password)throws Exception;

	public List<Object[]> lastUpdate();

	public Object weeklyupdate(int object, String object2, String dateofupdate, String procurement, String actionpoints,
			String riskdetails, String meeting, String mile, int projectid);

	public List<Object[]> ProjectListPD(String empId) throws Exception;

	public List<Object[]> ProjectListIC(String empId) throws Exception;
	public List<Object[]> hasroleAccess(String string, String logintype)throws Exception;
	public List<Object[]> getFormUrlList(String loginType,String formdetaild);
	public List<Object[]> getAllUrlList(String loginType);
	public List<Object[]> AuditPatchesList() throws Exception;
	public int AuditPatchAddSubmit(AuditPatches dto) throws Exception;
	public AuditPatches getAuditPatchById(Long attachId);
	public List<Object[]> getFormId(String requestUrlSegment);
	public List<Object[]> checkDivisionMasterId(String divisionId) throws Exception;

}