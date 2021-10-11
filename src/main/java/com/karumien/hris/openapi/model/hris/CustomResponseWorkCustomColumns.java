package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomResponseWorkCustomColumns
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomResponseWorkCustomColumns implements Serializable {
    private static final long serialVersionUID = 1L;

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

    @JsonProperty("secondLevelManager")
    private String secondLevelManager;

    @JsonProperty("payrollSpecialist")
    private String payrollSpecialist;

    public CustomResponseWorkCustomColumns businessUnitId(String businessUnitId) {
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

    public CustomResponseWorkCustomColumns note(String note) {
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

    public CustomResponseWorkCustomColumns reason(String reason) {
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

    public CustomResponseWorkCustomColumns budgetId(String budgetId) {
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

    public CustomResponseWorkCustomColumns profitAndCostCenterId(String profitAndCostCenterId) {
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

    public CustomResponseWorkCustomColumns legalEntity(String legalEntity) {
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

    public CustomResponseWorkCustomColumns costCenterCost(String costCenterCost) {
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

    public CustomResponseWorkCustomColumns adRole(List<String> adRole) {
        this.adRole = adRole;
        return this;
    }

    public CustomResponseWorkCustomColumns addAdRoleItem(String adRoleItem) {
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

    public CustomResponseWorkCustomColumns dottedLineManager(String dottedLineManager) {
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

    public CustomResponseWorkCustomColumns hrBusinessPartner(String hrBusinessPartner) {
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

    public CustomResponseWorkCustomColumns businessUnitOrFunction(String businessUnitOrFunction) {
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

    public CustomResponseWorkCustomColumns hrGeneralist(String hrGeneralist) {
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

    public CustomResponseWorkCustomColumns secondLevelManager(String secondLevelManager) {
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

    public CustomResponseWorkCustomColumns payrollSpecialist(String payrollSpecialist) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomResponseWorkCustomColumns customResponseWorkCustomColumns = (CustomResponseWorkCustomColumns) o;
        return Objects.equals(this.businessUnitId, customResponseWorkCustomColumns.businessUnitId) &&
                Objects.equals(this.note, customResponseWorkCustomColumns.note) &&
                Objects.equals(this.reason, customResponseWorkCustomColumns.reason) &&
                Objects.equals(this.budgetId, customResponseWorkCustomColumns.budgetId) &&
                Objects.equals(this.profitAndCostCenterId, customResponseWorkCustomColumns.profitAndCostCenterId) &&
                Objects.equals(this.legalEntity, customResponseWorkCustomColumns.legalEntity) &&
                Objects.equals(this.costCenterCost, customResponseWorkCustomColumns.costCenterCost) &&
                Objects.equals(this.adRole, customResponseWorkCustomColumns.adRole) &&
                Objects.equals(this.dottedLineManager, customResponseWorkCustomColumns.dottedLineManager) &&
                Objects.equals(this.hrBusinessPartner, customResponseWorkCustomColumns.hrBusinessPartner) &&
                Objects.equals(this.businessUnitOrFunction, customResponseWorkCustomColumns.businessUnitOrFunction) &&
                Objects.equals(this.hrGeneralist, customResponseWorkCustomColumns.hrGeneralist) &&
                Objects.equals(this.secondLevelManager, customResponseWorkCustomColumns.secondLevelManager) &&
                Objects.equals(this.payrollSpecialist, customResponseWorkCustomColumns.payrollSpecialist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessUnitId,
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
                secondLevelManager,
                payrollSpecialist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomResponseWorkCustomColumns {\n");

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
        sb.append("    secondLevelManager: ").append(toIndentedString(secondLevelManager)).append("\n");
        sb.append("    payrollSpecialist: ").append(toIndentedString(payrollSpecialist)).append("\n");
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

