package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomResponsePersonal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomResponsePersonal implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("shortBirthDate")
    private String shortBirthDate;

    @JsonProperty("pronouns")
    private String pronouns;

    @JsonProperty("communication")
    private CustomRequestPersonalCommunication communication;

    @JsonProperty("custom")
    private CustomResponsePersonalCustom custom;

    @JsonProperty("honorific")
    private String honorific;

    @JsonProperty("nationality")
    @Valid
    private List<String> nationality = null;

    public CustomResponsePersonal shortBirthDate(String shortBirthDate) {
        this.shortBirthDate = shortBirthDate;
        return this;
    }

    /**
     * Get shortBirthDate
     *
     * @return shortBirthDate
     */
    @ApiModelProperty(example = "01-01", value = "")


    public String getShortBirthDate() {
        return shortBirthDate;
    }

    public void setShortBirthDate(String shortBirthDate) {
        this.shortBirthDate = shortBirthDate;
    }

    public CustomResponsePersonal pronouns(String pronouns) {
        this.pronouns = pronouns;
        return this;
    }

    /**
     * Get pronouns
     *
     * @return pronouns
     */
    @ApiModelProperty(example = "Xe / Xem", value = "")


    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public CustomResponsePersonal communication(CustomRequestPersonalCommunication communication) {
        this.communication = communication;
        return this;
    }

    /**
     * Get communication
     *
     * @return communication
     */
    @ApiModelProperty(value = "")

    @Valid

    public CustomRequestPersonalCommunication getCommunication() {
        return communication;
    }

    public void setCommunication(CustomRequestPersonalCommunication communication) {
        this.communication = communication;
    }

    public CustomResponsePersonal custom(CustomResponsePersonalCustom custom) {
        this.custom = custom;
        return this;
    }

    /**
     * Get custom
     *
     * @return custom
     */
    @ApiModelProperty(value = "")

    @Valid

    public CustomResponsePersonalCustom getCustom() {
        return custom;
    }

    public void setCustom(CustomResponsePersonalCustom custom) {
        this.custom = custom;
    }

    public CustomResponsePersonal honorific(String honorific) {
        this.honorific = honorific;
        return this;
    }

    /**
     * Get honorific
     *
     * @return honorific
     */
    @ApiModelProperty(value = "")


    public String getHonorific() {
        return honorific;
    }

    public void setHonorific(String honorific) {
        this.honorific = honorific;
    }

    public CustomResponsePersonal nationality(List<String> nationality) {
        this.nationality = nationality;
        return this;
    }

    public CustomResponsePersonal addNationalityItem(String nationalityItem) {
        if (this.nationality == null) {
            this.nationality = new ArrayList<>();
        }
        this.nationality.add(nationalityItem);
        return this;
    }

    /**
     * Get nationality
     *
     * @return nationality
     */
    @ApiModelProperty(value = "")


    public List<String> getNationality() {
        return nationality;
    }

    public void setNationality(List<String> nationality) {
        this.nationality = nationality;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomResponsePersonal customResponsePersonal = (CustomResponsePersonal) o;
        return Objects.equals(this.shortBirthDate, customResponsePersonal.shortBirthDate) &&
                Objects.equals(this.pronouns, customResponsePersonal.pronouns) &&
                Objects.equals(this.communication, customResponsePersonal.communication) &&
                Objects.equals(this.custom, customResponsePersonal.custom) &&
                Objects.equals(this.honorific, customResponsePersonal.honorific) &&
                Objects.equals(this.nationality, customResponsePersonal.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortBirthDate, pronouns, communication, custom, honorific, nationality);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomResponsePersonal {\n");

        sb.append("    shortBirthDate: ").append(toIndentedString(shortBirthDate)).append("\n");
        sb.append("    pronouns: ").append(toIndentedString(pronouns)).append("\n");
        sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    honorific: ").append(toIndentedString(honorific)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
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

