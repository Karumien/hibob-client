package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomRequestPersonalCustom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomRequestPersonalCustom implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("field_1620721757321")
    @Valid
    private List<String> field1620721757321 = null;

    @JsonProperty("field_1620656620397")
    private String field1620656620397;

    @JsonProperty("field_1620656651374")
    private String field1620656651374;

    @JsonProperty("field_1620656641418")
    private String field1620656641418;

    @JsonProperty("field_1620656719091")
    private String field1620656719091;

    public CustomRequestPersonalCustom field1620721757321(List<String> field1620721757321) {
        this.field1620721757321 = field1620721757321;
        return this;
    }

    public CustomRequestPersonalCustom addField1620721757321Item(String field1620721757321Item) {
        if (this.field1620721757321 == null) {
            this.field1620721757321 = new ArrayList<>();
        }
        this.field1620721757321.add(field1620721757321Item);
        return this;
    }

    /**
     * Get field1620721757321
     *
     * @return field1620721757321
     */
    @ApiModelProperty(value = "")


    public List<String> getField1620721757321() {
        return field1620721757321;
    }

    public void setField1620721757321(List<String> field1620721757321) {
        this.field1620721757321 = field1620721757321;
    }

    public CustomRequestPersonalCustom field1620656620397(String field1620656620397) {
        this.field1620656620397 = field1620656620397;
        return this;
    }

    /**
     * Get field1620656620397
     *
     * @return field1620656620397
     */
    @ApiModelProperty(value = "")


    public String getField1620656620397() {
        return field1620656620397;
    }

    public void setField1620656620397(String field1620656620397) {
        this.field1620656620397 = field1620656620397;
    }

    public CustomRequestPersonalCustom field1620656651374(String field1620656651374) {
        this.field1620656651374 = field1620656651374;
        return this;
    }

    /**
     * Get field1620656651374
     *
     * @return field1620656651374
     */
    @ApiModelProperty(value = "")


    public String getField1620656651374() {
        return field1620656651374;
    }

    public void setField1620656651374(String field1620656651374) {
        this.field1620656651374 = field1620656651374;
    }

    public CustomRequestPersonalCustom field1620656641418(String field1620656641418) {
        this.field1620656641418 = field1620656641418;
        return this;
    }

    /**
     * Get field1620656641418
     *
     * @return field1620656641418
     */
    @ApiModelProperty(value = "")


    public String getField1620656641418() {
        return field1620656641418;
    }

    public void setField1620656641418(String field1620656641418) {
        this.field1620656641418 = field1620656641418;
    }

    public CustomRequestPersonalCustom field1620656719091(String field1620656719091) {
        this.field1620656719091 = field1620656719091;
        return this;
    }

    /**
     * Get field1620656719091
     *
     * @return field1620656719091
     */
    @ApiModelProperty(value = "")


    public String getField1620656719091() {
        return field1620656719091;
    }

    public void setField1620656719091(String field1620656719091) {
        this.field1620656719091 = field1620656719091;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomRequestPersonalCustom customRequestPersonalCustom = (CustomRequestPersonalCustom) o;
        return Objects.equals(this.field1620721757321, customRequestPersonalCustom.field1620721757321) &&
                Objects.equals(this.field1620656620397, customRequestPersonalCustom.field1620656620397) &&
                Objects.equals(this.field1620656651374, customRequestPersonalCustom.field1620656651374) &&
                Objects.equals(this.field1620656641418, customRequestPersonalCustom.field1620656641418) &&
                Objects.equals(this.field1620656719091, customRequestPersonalCustom.field1620656719091);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1620721757321, field1620656620397, field1620656651374, field1620656641418, field1620656719091);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRequestPersonalCustom {\n");

        sb.append("    field1620721757321: ").append(toIndentedString(field1620721757321)).append("\n");
        sb.append("    field1620656620397: ").append(toIndentedString(field1620656620397)).append("\n");
        sb.append("    field1620656651374: ").append(toIndentedString(field1620656651374)).append("\n");
        sb.append("    field1620656641418: ").append(toIndentedString(field1620656641418)).append("\n");
        sb.append("    field1620656719091: ").append(toIndentedString(field1620656719091)).append("\n");
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

