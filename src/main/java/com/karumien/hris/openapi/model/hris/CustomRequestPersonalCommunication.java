package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomRequestPersonalCommunication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomRequestPersonalCommunication implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("skypeUsername")
    private String skypeUsername;

    @JsonProperty("slackUsername")
    private String slackUsername;

    public CustomRequestPersonalCommunication skypeUsername(String skypeUsername) {
        this.skypeUsername = skypeUsername;
        return this;
    }

    /**
     * Get skypeUsername
     *
     * @return skypeUsername
     */
    @ApiModelProperty(value = "")


    public String getSkypeUsername() {
        return skypeUsername;
    }

    public void setSkypeUsername(String skypeUsername) {
        this.skypeUsername = skypeUsername;
    }

    public CustomRequestPersonalCommunication slackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
        return this;
    }

    /**
     * Get slackUsername
     *
     * @return slackUsername
     */
    @ApiModelProperty(value = "")


    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomRequestPersonalCommunication customRequestPersonalCommunication = (CustomRequestPersonalCommunication) o;
        return Objects.equals(this.skypeUsername, customRequestPersonalCommunication.skypeUsername) &&
                Objects.equals(this.slackUsername, customRequestPersonalCommunication.slackUsername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skypeUsername, slackUsername);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRequestPersonalCommunication {\n");

        sb.append("    skypeUsername: ").append(toIndentedString(skypeUsername)).append("\n");
        sb.append("    slackUsername: ").append(toIndentedString(slackUsername)).append("\n");
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

