package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomRequestWorkTenureDuration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomRequestWorkTenureDuration implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("periodISO")
    private String periodISO;

    @JsonProperty("sortFactor")
    private BigDecimal sortFactor;

    @JsonProperty("humanize")
    private String humanize;

    public CustomRequestWorkTenureDuration periodISO(String periodISO) {
        this.periodISO = periodISO;
        return this;
    }

    /**
     * Get periodISO
     *
     * @return periodISO
     */
    @ApiModelProperty(example = "P5M", value = "")


    public String getPeriodISO() {
        return periodISO;
    }

    public void setPeriodISO(String periodISO) {
        this.periodISO = periodISO;
    }

    public CustomRequestWorkTenureDuration sortFactor(BigDecimal sortFactor) {
        this.sortFactor = sortFactor;
        return this;
    }

    /**
     * Get sortFactor
     *
     * @return sortFactor
     */
    @ApiModelProperty(example = "150", value = "")

    @Valid

    public BigDecimal getSortFactor() {
        return sortFactor;
    }

    public void setSortFactor(BigDecimal sortFactor) {
        this.sortFactor = sortFactor;
    }

    public CustomRequestWorkTenureDuration humanize(String humanize) {
        this.humanize = humanize;
        return this;
    }

    /**
     * Get humanize
     *
     * @return humanize
     */
    @ApiModelProperty(example = "5 months", value = "")


    public String getHumanize() {
        return humanize;
    }

    public void setHumanize(String humanize) {
        this.humanize = humanize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomRequestWorkTenureDuration customRequestWorkTenureDuration = (CustomRequestWorkTenureDuration) o;
        return Objects.equals(this.periodISO, customRequestWorkTenureDuration.periodISO) &&
                Objects.equals(this.sortFactor, customRequestWorkTenureDuration.sortFactor) &&
                Objects.equals(this.humanize, customRequestWorkTenureDuration.humanize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodISO, sortFactor, humanize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRequestWorkTenureDuration {\n");

        sb.append("    periodISO: ").append(toIndentedString(periodISO)).append("\n");
        sb.append("    sortFactor: ").append(toIndentedString(sortFactor)).append("\n");
        sb.append("    humanize: ").append(toIndentedString(humanize)).append("\n");
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

