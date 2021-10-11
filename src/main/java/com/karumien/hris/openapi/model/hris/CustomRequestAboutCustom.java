package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomRequestAboutCustom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomRequestAboutCustom implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("field_1620723273420")
    private String field1620723273420;

    public CustomRequestAboutCustom field1620723273420(String field1620723273420) {
        this.field1620723273420 = field1620723273420;
        return this;
    }

    /**
     * Get field1620723273420
     *
     * @return field1620723273420
     */
    @ApiModelProperty(value = "")


    public String getField1620723273420() {
        return field1620723273420;
    }

    public void setField1620723273420(String field1620723273420) {
        this.field1620723273420 = field1620723273420;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomRequestAboutCustom customRequestAboutCustom = (CustomRequestAboutCustom) o;
        return Objects.equals(this.field1620723273420, customRequestAboutCustom.field1620723273420);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1620723273420);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRequestAboutCustom {\n");

        sb.append("    field1620723273420: ").append(toIndentedString(field1620723273420)).append("\n");
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

