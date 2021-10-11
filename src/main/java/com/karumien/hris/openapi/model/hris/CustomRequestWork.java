package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomRequestWork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomRequestWork implements Serializable {
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

  @JsonProperty("customColumns")
  private CustomRequestWorkCustomColumns customColumns;

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

  public CustomRequestWork shortStartDate(String shortStartDate) {
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

  public CustomRequestWork startDate(LocalDate startDate) {
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

  public CustomRequestWork manager(String manager) {
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

  public CustomRequestWork workPhone(String workPhone) {
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

  public CustomRequestWork tenureDuration(CustomRequestWorkTenureDuration tenureDuration) {
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

  public CustomRequestWork durationOfEmployment(CustomRequestWorkTenureDuration durationOfEmployment) {
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

  public CustomRequestWork reportsToIdInCompany(String reportsToIdInCompany) {
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

  public CustomRequestWork employeeIdInCompany(String employeeIdInCompany) {
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

  public CustomRequestWork reportsTo(String reportsTo) {
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

  public CustomRequestWork workMobile(String workMobile) {
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

  public CustomRequestWork indirectReports(BigDecimal indirectReports) {
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

  public CustomRequestWork siteId(BigDecimal siteId) {
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

  public CustomRequestWork department(String department) {
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

  public CustomRequestWork tenureYears(BigDecimal tenureYears) {
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

  public CustomRequestWork customColumns(CustomRequestWorkCustomColumns customColumns) {
    this.customColumns = customColumns;
    return this;
  }

  /**
   * Get customColumns
   *
   * @return customColumns
   */
  @ApiModelProperty(value = "")

  @Valid

  public CustomRequestWorkCustomColumns getCustomColumns() {
    return customColumns;
  }

  public void setCustomColumns(CustomRequestWorkCustomColumns customColumns) {
    this.customColumns = customColumns;
  }

  public CustomRequestWork isManager(Boolean isManager) {
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

  public CustomRequestWork title(String title) {
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

  public CustomRequestWork site(String site) {
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

  public CustomRequestWork activeEffectiveDate(LocalDate activeEffectiveDate) {
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

  public CustomRequestWork directReports(BigDecimal directReports) {
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

  public CustomRequestWork secondLevelManager(String secondLevelManager) {
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

  public CustomRequestWork daysOfPreviousService(BigDecimal daysOfPreviousService) {
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

  public CustomRequestWork yearsOfService(BigDecimal yearsOfService) {
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
    CustomRequestWork customRequestWork = (CustomRequestWork) o;
    return Objects.equals(this.shortStartDate, customRequestWork.shortStartDate) &&
            Objects.equals(this.startDate, customRequestWork.startDate) &&
            Objects.equals(this.manager, customRequestWork.manager) &&
            Objects.equals(this.workPhone, customRequestWork.workPhone) &&
            Objects.equals(this.tenureDuration, customRequestWork.tenureDuration) &&
            Objects.equals(this.durationOfEmployment, customRequestWork.durationOfEmployment) &&
            Objects.equals(this.reportsToIdInCompany, customRequestWork.reportsToIdInCompany) &&
            Objects.equals(this.employeeIdInCompany, customRequestWork.employeeIdInCompany) &&
            Objects.equals(this.reportsTo, customRequestWork.reportsTo) &&
            Objects.equals(this.workMobile, customRequestWork.workMobile) &&
            Objects.equals(this.indirectReports, customRequestWork.indirectReports) &&
            Objects.equals(this.siteId, customRequestWork.siteId) &&
            Objects.equals(this.department, customRequestWork.department) &&
            Objects.equals(this.tenureYears, customRequestWork.tenureYears) &&
            Objects.equals(this.customColumns, customRequestWork.customColumns) &&
            Objects.equals(this.isManager, customRequestWork.isManager) &&
            Objects.equals(this.title, customRequestWork.title) &&
            Objects.equals(this.site, customRequestWork.site) &&
            Objects.equals(this.activeEffectiveDate, customRequestWork.activeEffectiveDate) &&
            Objects.equals(this.directReports, customRequestWork.directReports) &&
            Objects.equals(this.secondLevelManager, customRequestWork.secondLevelManager) &&
            Objects.equals(this.daysOfPreviousService, customRequestWork.daysOfPreviousService) &&
            Objects.equals(this.yearsOfService, customRequestWork.yearsOfService);
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
            customColumns,
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
    sb.append("class CustomRequestWork {\n");

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
    sb.append("    customColumns: ").append(toIndentedString(customColumns)).append("\n");
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

