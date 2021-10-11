package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomResponseWork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomResponseWork implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("shortStartDate")
    private String shortStartDate;

    @JsonProperty("startDate")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
    private LocalDate startDate;

    @JsonProperty("manager")
    private String manager;

    @JsonProperty("workPhone")
    private String workPhone;

    @JsonProperty("tenureDuration")
    private CustomRequestWorkTenureDuration tenureDuration;

    @JsonProperty("durationOfEmployment")
    private CustomRequestWorkTenureDuration durationOfEmployment;

    @JsonProperty("reportsToIdInCompany")
    private String reportsToIdInCompany;

    @JsonProperty("employeeIdInCompany")
    private String employeeIdInCompany;

    @JsonProperty("reportsTo")
    private String reportsTo;

    @JsonProperty("workMobile")
    private String workMobile;

    @JsonProperty("indirectReports")
    private BigDecimal indirectReports;

    @JsonProperty("siteId")
    private BigDecimal siteId;

    @JsonProperty("department")
    private String department;

    @JsonProperty("tenureYears")
    private BigDecimal tenureYears;

    @JsonProperty("businessUnitId")
    private String businessUnitId;

    @JsonProperty("note")
    private String note;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("budgetId")
    private String budgetId;

    @JsonProperty("profitAndCostCenterId")
    private String profitAndCostCenterId;

    @JsonProperty("legalEntity")
    private String legalEntity;

    @JsonProperty("costCenterCost")
    private String costCenterCost;

    @JsonProperty("adRole")
    @Valid
    private List<String> adRole = null;

    @JsonProperty("dottedLineManager")
    private String dottedLineManager;

    @JsonProperty("hrBusinessPartner")
    private String hrBusinessPartner;

    @JsonProperty("businessUnitOrFunction")
    private String businessUnitOrFunction;

    @JsonProperty("hrGeneralist")
    private String hrGeneralist;

    @JsonProperty("customSecondLevelManager")
    private String customSecondLevelManager;

    @JsonProperty("payrollSpecialist")
    private String payrollSpecialist;

    @JsonProperty("isManager")
    private Boolean isManager;

    @JsonProperty("title")
    private String title;

    @JsonProperty("site")
    private String site;

    @JsonProperty("activeEffectiveDate")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
    private LocalDate activeEffectiveDate;

    @JsonProperty("directReports")
    private BigDecimal directReports;

    @JsonProperty("secondLevelManager")
    private String secondLevelManager;

    @JsonProperty("daysOfPreviousService")
    private BigDecimal daysOfPreviousService;

    @JsonProperty("yearsOfService")
    private BigDecimal yearsOfService;

    public CustomResponseWork shortStartDate(String shortStartDate) {
        this.shortStartDate = shortStartDate;
        return this;
    }

    /**
     * Get shortStartDate
     *
     * @return shortStartDate
     */
    @ApiModelProperty(example = "05-01", value = "")


    public String getShortStartDate() {
        return shortStartDate;
    }

    public void setShortStartDate(String shortStartDate) {
        this.shortStartDate = shortStartDate;
    }

    public CustomResponseWork startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get startDate
     *
     * @return startDate
     */
    @ApiModelProperty(example = "Sat May 01 02:00:00 CEST 2021", value = "")

    @Valid

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public CustomResponseWork manager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Get manager
     *
     * @return manager
     */
    @ApiModelProperty(value = "")


    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public CustomResponseWork workPhone(String workPhone) {
        this.workPhone = workPhone;
        return this;
    }

    /**
     * Get workPhone
     *
     * @return workPhone
     */
    @ApiModelProperty(value = "")


    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public CustomResponseWork tenureDuration(CustomRequestWorkTenureDuration tenureDuration) {
        this.tenureDuration = tenureDuration;
        return this;
    }

    /**
     * Get tenureDuration
     *
     * @return tenureDuration
     */
    @ApiModelProperty(value = "")

    @Valid

    public CustomRequestWorkTenureDuration getTenureDuration() {
        return tenureDuration;
    }

    public void setTenureDuration(CustomRequestWorkTenureDuration tenureDuration) {
        this.tenureDuration = tenureDuration;
    }

    public CustomResponseWork durationOfEmployment(CustomRequestWorkTenureDuration durationOfEmployment) {
        this.durationOfEmployment = durationOfEmployment;
        return this;
    }

    /**
     * Get durationOfEmployment
     *
     * @return durationOfEmployment
     */
    @ApiModelProperty(value = "")

    @Valid

    public CustomRequestWorkTenureDuration getDurationOfEmployment() {
        return durationOfEmployment;
    }

    public void setDurationOfEmployment(CustomRequestWorkTenureDuration durationOfEmployment) {
        this.durationOfEmployment = durationOfEmployment;
    }

    public CustomResponseWork reportsToIdInCompany(String reportsToIdInCompany) {
        this.reportsToIdInCompany = reportsToIdInCompany;
        return this;
    }

    /**
     * Get reportsToIdInCompany
     *
     * @return reportsToIdInCompany
     */
    @ApiModelProperty(value = "")


    public String getReportsToIdInCompany() {
        return reportsToIdInCompany;
    }

    public void setReportsToIdInCompany(String reportsToIdInCompany) {
        this.reportsToIdInCompany = reportsToIdInCompany;
    }

    public CustomResponseWork employeeIdInCompany(String employeeIdInCompany) {
        this.employeeIdInCompany = employeeIdInCompany;
        return this;
    }

    /**
     * Get employeeIdInCompany
     *
     * @return employeeIdInCompany
     */
    @ApiModelProperty(value = "")


    public String getEmployeeIdInCompany() {
        return employeeIdInCompany;
    }

    public void setEmployeeIdInCompany(String employeeIdInCompany) {
        this.employeeIdInCompany = employeeIdInCompany;
    }

    public CustomResponseWork reportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
        return this;
    }

    /**
     * Get reportsTo
     *
     * @return reportsTo
     */
    @ApiModelProperty(value = "")


    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public CustomResponseWork workMobile(String workMobile) {
        this.workMobile = workMobile;
        return this;
    }

    /**
     * Get workMobile
     *
     * @return workMobile
     */
    @ApiModelProperty(example = "2425346374", value = "")


    public String getWorkMobile() {
        return workMobile;
    }

    public void setWorkMobile(String workMobile) {
        this.workMobile = workMobile;
    }

    public CustomResponseWork indirectReports(BigDecimal indirectReports) {
        this.indirectReports = indirectReports;
        return this;
    }

    /**
     * Get indirectReports
     *
     * @return indirectReports
     */
    @ApiModelProperty(example = "1", value = "")

    @Valid

    public BigDecimal getIndirectReports() {
        return indirectReports;
    }

    public void setIndirectReports(BigDecimal indirectReports) {
        this.indirectReports = indirectReports;
    }

    public CustomResponseWork siteId(BigDecimal siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * Get siteId
     *
     * @return siteId
     */
    @ApiModelProperty(example = "1482762", value = "")

    @Valid

    public BigDecimal getSiteId() {
        return siteId;
    }

    public void setSiteId(BigDecimal siteId) {
        this.siteId = siteId;
    }

    public CustomResponseWork department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Get department
     *
     * @return department
     */
    @ApiModelProperty(example = "Test", value = "")


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public CustomResponseWork tenureYears(BigDecimal tenureYears) {
        this.tenureYears = tenureYears;
        return this;
    }

    /**
     * Get tenureYears
     *
     * @return tenureYears
     */
    @ApiModelProperty(example = "0", value = "")

    @Valid

    public BigDecimal getTenureYears() {
        return tenureYears;
    }

    public void setTenureYears(BigDecimal tenureYears) {
        this.tenureYears = tenureYears;
    }

    public CustomResponseWork businessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }

    /**
     * Get businessUnitId
     *
     * @return businessUnitId
     */
    @ApiModelProperty(value = "")


    public String getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public CustomResponseWork note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get note
     *
     * @return note
     */
    @ApiModelProperty(value = "")


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CustomResponseWork reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     */
    @ApiModelProperty(value = "")


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public CustomResponseWork budgetId(String budgetId) {
        this.budgetId = budgetId;
        return this;
    }

    /**
     * Get budgetId
     *
     * @return budgetId
     */
    @ApiModelProperty(value = "")


    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public CustomResponseWork profitAndCostCenterId(String profitAndCostCenterId) {
        this.profitAndCostCenterId = profitAndCostCenterId;
        return this;
    }

    /**
     * Get profitAndCostCenterId
     *
     * @return profitAndCostCenterId
     */
    @ApiModelProperty(value = "")


    public String getProfitAndCostCenterId() {
        return profitAndCostCenterId;
    }

    public void setProfitAndCostCenterId(String profitAndCostCenterId) {
        this.profitAndCostCenterId = profitAndCostCenterId;
    }

    public CustomResponseWork legalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
        return this;
    }

    /**
     * Get legalEntity
     *
     * @return legalEntity
     */
    @ApiModelProperty(value = "")


    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    public CustomResponseWork costCenterCost(String costCenterCost) {
        this.costCenterCost = costCenterCost;
        return this;
    }

    /**
     * Get costCenterCost
     *
     * @return costCenterCost
     */
    @ApiModelProperty(value = "")


    public String getCostCenterCost() {
        return costCenterCost;
    }

    public void setCostCenterCost(String costCenterCost) {
        this.costCenterCost = costCenterCost;
    }

    public CustomResponseWork adRole(List<String> adRole) {
        this.adRole = adRole;
        return this;
    }

    public CustomResponseWork addAdRoleItem(String adRoleItem) {
        if (this.adRole == null) {
            this.adRole = new ArrayList<>();
        }
        this.adRole.add(adRoleItem);
        return this;
    }

    /**
     * Get adRole
     *
     * @return adRole
     */
    @ApiModelProperty(value = "")


    public List<String> getAdRole() {
        return adRole;
    }

    public void setAdRole(List<String> adRole) {
        this.adRole = adRole;
    }

    public CustomResponseWork dottedLineManager(String dottedLineManager) {
        this.dottedLineManager = dottedLineManager;
        return this;
    }

    /**
     * Get dottedLineManager
     *
     * @return dottedLineManager
     */
    @ApiModelProperty(value = "")


    public String getDottedLineManager() {
        return dottedLineManager;
    }

    public void setDottedLineManager(String dottedLineManager) {
        this.dottedLineManager = dottedLineManager;
    }

    public CustomResponseWork hrBusinessPartner(String hrBusinessPartner) {
        this.hrBusinessPartner = hrBusinessPartner;
        return this;
    }

    /**
     * Get hrBusinessPartner
     *
     * @return hrBusinessPartner
     */
    @ApiModelProperty(value = "")


    public String getHrBusinessPartner() {
        return hrBusinessPartner;
    }

    public void setHrBusinessPartner(String hrBusinessPartner) {
        this.hrBusinessPartner = hrBusinessPartner;
    }

    public CustomResponseWork businessUnitOrFunction(String businessUnitOrFunction) {
        this.businessUnitOrFunction = businessUnitOrFunction;
        return this;
    }

    /**
     * Get businessUnitOrFunction
     *
     * @return businessUnitOrFunction
     */
    @ApiModelProperty(example = "CTO", value = "")


    public String getBusinessUnitOrFunction() {
        return businessUnitOrFunction;
    }

    public void setBusinessUnitOrFunction(String businessUnitOrFunction) {
        this.businessUnitOrFunction = businessUnitOrFunction;
    }

    public CustomResponseWork hrGeneralist(String hrGeneralist) {
        this.hrGeneralist = hrGeneralist;
        return this;
    }

    /**
     * Get hrGeneralist
     *
     * @return hrGeneralist
     */
    @ApiModelProperty(value = "")


    public String getHrGeneralist() {
        return hrGeneralist;
    }

    public void setHrGeneralist(String hrGeneralist) {
        this.hrGeneralist = hrGeneralist;
    }

    public CustomResponseWork customSecondLevelManager(String customSecondLevelManager) {
        this.customSecondLevelManager = customSecondLevelManager;
        return this;
    }

    /**
     * Get customSecondLevelManager
     *
     * @return customSecondLevelManager
     */
    @ApiModelProperty(value = "")


    public String getCustomSecondLevelManager() {
        return customSecondLevelManager;
    }

    public void setCustomSecondLevelManager(String customSecondLevelManager) {
        this.customSecondLevelManager = customSecondLevelManager;
    }

    public CustomResponseWork payrollSpecialist(String payrollSpecialist) {
        this.payrollSpecialist = payrollSpecialist;
        return this;
    }

    /**
     * Get payrollSpecialist
     *
     * @return payrollSpecialist
     */
    @ApiModelProperty(value = "")


    public String getPayrollSpecialist() {
        return payrollSpecialist;
    }

    public void setPayrollSpecialist(String payrollSpecialist) {
        this.payrollSpecialist = payrollSpecialist;
    }

    public CustomResponseWork isManager(Boolean isManager) {
        this.isManager = isManager;
        return this;
    }

    /**
     * Get isManager
     *
     * @return isManager
     */
    @ApiModelProperty(value = "")


    public Boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    public CustomResponseWork title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     */
    @ApiModelProperty(example = "Admins", value = "")


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CustomResponseWork site(String site) {
        this.site = site;
        return this;
    }

    /**
     * Get site
     *
     * @return site
     */
    @ApiModelProperty(example = "London (Demo)", value = "")


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public CustomResponseWork activeEffectiveDate(LocalDate activeEffectiveDate) {
        this.activeEffectiveDate = activeEffectiveDate;
        return this;
    }

    /**
     * Get activeEffectiveDate
     *
     * @return activeEffectiveDate
     */
    @ApiModelProperty(example = "Sun May 02 02:00:00 CEST 2021", value = "")

    @Valid

    public LocalDate getActiveEffectiveDate() {
        return activeEffectiveDate;
    }

    public void setActiveEffectiveDate(LocalDate activeEffectiveDate) {
        this.activeEffectiveDate = activeEffectiveDate;
    }

    public CustomResponseWork directReports(BigDecimal directReports) {
        this.directReports = directReports;
        return this;
    }

    /**
     * Get directReports
     *
     * @return directReports
     */
    @ApiModelProperty(example = "1", value = "")

    @Valid

    public BigDecimal getDirectReports() {
        return directReports;
    }

    public void setDirectReports(BigDecimal directReports) {
        this.directReports = directReports;
    }

    public CustomResponseWork secondLevelManager(String secondLevelManager) {
        this.secondLevelManager = secondLevelManager;
        return this;
    }

    /**
     * Get secondLevelManager
     *
     * @return secondLevelManager
     */
    @ApiModelProperty(value = "")


    public String getSecondLevelManager() {
        return secondLevelManager;
    }

    public void setSecondLevelManager(String secondLevelManager) {
        this.secondLevelManager = secondLevelManager;
    }

    public CustomResponseWork daysOfPreviousService(BigDecimal daysOfPreviousService) {
        this.daysOfPreviousService = daysOfPreviousService;
        return this;
    }

    /**
     * Get daysOfPreviousService
     *
     * @return daysOfPreviousService
     */
    @ApiModelProperty(example = "0", value = "")

    @Valid

    public BigDecimal getDaysOfPreviousService() {
        return daysOfPreviousService;
    }

    public void setDaysOfPreviousService(BigDecimal daysOfPreviousService) {
        this.daysOfPreviousService = daysOfPreviousService;
    }

    public CustomResponseWork yearsOfService(BigDecimal yearsOfService) {
        this.yearsOfService = yearsOfService;
        return this;
    }

    /**
     * Get yearsOfService
     *
     * @return yearsOfService
     */
    @ApiModelProperty(example = "0.416", value = "")

    @Valid

    public BigDecimal getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(BigDecimal yearsOfService) {
        this.yearsOfService = yearsOfService;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomResponseWork customResponseWork = (CustomResponseWork) o;
        return Objects.equals(this.shortStartDate, customResponseWork.shortStartDate) &&
                Objects.equals(this.startDate, customResponseWork.startDate) &&
                Objects.equals(this.manager, customResponseWork.manager) &&
                Objects.equals(this.workPhone, customResponseWork.workPhone) &&
                Objects.equals(this.tenureDuration, customResponseWork.tenureDuration) &&
                Objects.equals(this.durationOfEmployment, customResponseWork.durationOfEmployment) &&
                Objects.equals(this.reportsToIdInCompany, customResponseWork.reportsToIdInCompany) &&
                Objects.equals(this.employeeIdInCompany, customResponseWork.employeeIdInCompany) &&
                Objects.equals(this.reportsTo, customResponseWork.reportsTo) &&
                Objects.equals(this.workMobile, customResponseWork.workMobile) &&
                Objects.equals(this.indirectReports, customResponseWork.indirectReports) &&
                Objects.equals(this.siteId, customResponseWork.siteId) &&
                Objects.equals(this.department, customResponseWork.department) &&
                Objects.equals(this.tenureYears, customResponseWork.tenureYears) &&
                Objects.equals(this.businessUnitId, customResponseWork.businessUnitId) &&
                Objects.equals(this.note, customResponseWork.note) &&
                Objects.equals(this.reason, customResponseWork.reason) &&
                Objects.equals(this.budgetId, customResponseWork.budgetId) &&
                Objects.equals(this.profitAndCostCenterId, customResponseWork.profitAndCostCenterId) &&
                Objects.equals(this.legalEntity, customResponseWork.legalEntity) &&
                Objects.equals(this.costCenterCost, customResponseWork.costCenterCost) &&
                Objects.equals(this.adRole, customResponseWork.adRole) &&
                Objects.equals(this.dottedLineManager, customResponseWork.dottedLineManager) &&
                Objects.equals(this.hrBusinessPartner, customResponseWork.hrBusinessPartner) &&
                Objects.equals(this.businessUnitOrFunction, customResponseWork.businessUnitOrFunction) &&
                Objects.equals(this.hrGeneralist, customResponseWork.hrGeneralist) &&
                Objects.equals(this.customSecondLevelManager, customResponseWork.customSecondLevelManager) &&
                Objects.equals(this.payrollSpecialist, customResponseWork.payrollSpecialist) &&
                Objects.equals(this.isManager, customResponseWork.isManager) &&
                Objects.equals(this.title, customResponseWork.title) &&
                Objects.equals(this.site, customResponseWork.site) &&
                Objects.equals(this.activeEffectiveDate, customResponseWork.activeEffectiveDate) &&
                Objects.equals(this.directReports, customResponseWork.directReports) &&
                Objects.equals(this.secondLevelManager, customResponseWork.secondLevelManager) &&
                Objects.equals(this.daysOfPreviousService, customResponseWork.daysOfPreviousService) &&
                Objects.equals(this.yearsOfService, customResponseWork.yearsOfService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortStartDate,
                startDate,
                manager,
                workPhone,
                tenureDuration,
                durationOfEmployment,
                reportsToIdInCompany,
                employeeIdInCompany,
                reportsTo,
                workMobile,
                indirectReports,
                siteId,
                department,
                tenureYears,
                businessUnitId,
                note,
                reason,
                budgetId,
                profitAndCostCenterId,
                legalEntity,
                costCenterCost,
                adRole,
                dottedLineManager,
                hrBusinessPartner,
                businessUnitOrFunction,
                hrGeneralist,
                customSecondLevelManager,
                payrollSpecialist,
                isManager,
                title,
                site,
                activeEffectiveDate,
                directReports,
                secondLevelManager,
                daysOfPreviousService,
                yearsOfService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomResponseWork {\n");

        sb.append("    shortStartDate: ").append(toIndentedString(shortStartDate)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
        sb.append("    workPhone: ").append(toIndentedString(workPhone)).append("\n");
        sb.append("    tenureDuration: ").append(toIndentedString(tenureDuration)).append("\n");
        sb.append("    durationOfEmployment: ").append(toIndentedString(durationOfEmployment)).append("\n");
        sb.append("    reportsToIdInCompany: ").append(toIndentedString(reportsToIdInCompany)).append("\n");
        sb.append("    employeeIdInCompany: ").append(toIndentedString(employeeIdInCompany)).append("\n");
        sb.append("    reportsTo: ").append(toIndentedString(reportsTo)).append("\n");
        sb.append("    workMobile: ").append(toIndentedString(workMobile)).append("\n");
        sb.append("    indirectReports: ").append(toIndentedString(indirectReports)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    tenureYears: ").append(toIndentedString(tenureYears)).append("\n");
        sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    budgetId: ").append(toIndentedString(budgetId)).append("\n");
        sb.append("    profitAndCostCenterId: ").append(toIndentedString(profitAndCostCenterId)).append("\n");
        sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
        sb.append("    costCenterCost: ").append(toIndentedString(costCenterCost)).append("\n");
        sb.append("    adRole: ").append(toIndentedString(adRole)).append("\n");
        sb.append("    dottedLineManager: ").append(toIndentedString(dottedLineManager)).append("\n");
        sb.append("    hrBusinessPartner: ").append(toIndentedString(hrBusinessPartner)).append("\n");
        sb.append("    businessUnitOrFunction: ").append(toIndentedString(businessUnitOrFunction)).append("\n");
        sb.append("    hrGeneralist: ").append(toIndentedString(hrGeneralist)).append("\n");
        sb.append("    customSecondLevelManager: ").append(toIndentedString(customSecondLevelManager)).append("\n");
        sb.append("    payrollSpecialist: ").append(toIndentedString(payrollSpecialist)).append("\n");
        sb.append("    isManager: ").append(toIndentedString(isManager)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    activeEffectiveDate: ").append(toIndentedString(activeEffectiveDate)).append("\n");
        sb.append("    directReports: ").append(toIndentedString(directReports)).append("\n");
        sb.append("    secondLevelManager: ").append(toIndentedString(secondLevelManager)).append("\n");
        sb.append("    daysOfPreviousService: ").append(toIndentedString(daysOfPreviousService)).append("\n");
        sb.append("    yearsOfService: ").append(toIndentedString(yearsOfService)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

