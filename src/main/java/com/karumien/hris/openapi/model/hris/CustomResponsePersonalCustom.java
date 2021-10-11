package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomResponsePersonalCustom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomResponsePersonalCustom implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("citizenship")
    @Valid
    private List<String> citizenship = null;

    @JsonProperty("birthSurname")
    private String birthSurname;

    @JsonProperty("countryOfBirth")
    private String countryOfBirth;

    @JsonProperty("cityOfBirth")
    private String cityOfBirth;

    @JsonProperty("birthNumber")
    private String birthNumber;

    public CustomResponsePersonalCustom citizenship(List<String> citizenship) {
        this.citizenship = citizenship;
        return this;
    }

    public CustomResponsePersonalCustom addCitizenshipItem(String citizenshipItem) {
        if (this.citizenship == null) {
            this.citizenship = new ArrayList<>();
        }
        this.citizenship.add(citizenshipItem);
        return this;
    }

    /**
     * Get citizenship
     *
     * @return citizenship
     */
    @ApiModelProperty(value = "")


    public List<String> getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(List<String> citizenship) {
        this.citizenship = citizenship;
    }

    public CustomResponsePersonalCustom birthSurname(String birthSurname) {
        this.birthSurname = birthSurname;
        return this;
    }

    /**
     * Get birthSurname
     *
     * @return birthSurname
     */
    @ApiModelProperty(value = "")


    public String getBirthSurname() {
        return birthSurname;
    }

    public void setBirthSurname(String birthSurname) {
        this.birthSurname = birthSurname;
    }

    public CustomResponsePersonalCustom countryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
        return this;
    }

    /**
     * Get countryOfBirth
     *
     * @return countryOfBirth
     */
    @ApiModelProperty(value = "")


    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public CustomResponsePersonalCustom cityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
        return this;
    }

    /**
     * Get cityOfBirth
     *
     * @return cityOfBirth
     */
    @ApiModelProperty(value = "")


    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public CustomResponsePersonalCustom birthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
        return this;
    }

    /**
     * Get birthNumber
     *
     * @return birthNumber
     */
    @ApiModelProperty(value = "")


    public String getBirthNumber() {
        return birthNumber;
    }

    public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomResponsePersonalCustom customResponsePersonalCustom = (CustomResponsePersonalCustom) o;
        return Objects.equals(this.citizenship, customResponsePersonalCustom.citizenship) &&
                Objects.equals(this.birthSurname, customResponsePersonalCustom.birthSurname) &&
                Objects.equals(this.countryOfBirth, customResponsePersonalCustom.countryOfBirth) &&
                Objects.equals(this.cityOfBirth, customResponsePersonalCustom.cityOfBirth) &&
                Objects.equals(this.birthNumber, customResponsePersonalCustom.birthNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(citizenship, birthSurname, countryOfBirth, cityOfBirth, birthNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomResponsePersonalCustom {\n");

        sb.append("    citizenship: ").append(toIndentedString(citizenship)).append("\n");
        sb.append("    birthSurname: ").append(toIndentedString(birthSurname)).append("\n");
        sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
        sb.append("    cityOfBirth: ").append(toIndentedString(cityOfBirth)).append("\n");
        sb.append("    birthNumber: ").append(toIndentedString(birthNumber)).append("\n");
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

