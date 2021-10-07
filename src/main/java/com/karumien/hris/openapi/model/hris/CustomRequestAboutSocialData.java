package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomRequestAboutSocialData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomRequestAboutSocialData implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("linkedin")
    private String linkedin;

    @JsonProperty("twitter")
    private String twitter;

    @JsonProperty("facebook")
    private String facebook;

    public CustomRequestAboutSocialData linkedin(String linkedin) {
        this.linkedin = linkedin;
        return this;
    }

    /**
     * Get linkedin
     *
     * @return linkedin
     */
    @ApiModelProperty(value = "")


    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public CustomRequestAboutSocialData twitter(String twitter) {
        this.twitter = twitter;
        return this;
    }

    /**
     * Get twitter
     *
     * @return twitter
     */
    @ApiModelProperty(value = "")


    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public CustomRequestAboutSocialData facebook(String facebook) {
        this.facebook = facebook;
        return this;
    }

    /**
     * Get facebook
     *
     * @return facebook
     */
    @ApiModelProperty(value = "")


    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomRequestAboutSocialData customRequestAboutSocialData = (CustomRequestAboutSocialData) o;
        return Objects.equals(this.linkedin, customRequestAboutSocialData.linkedin) &&
                Objects.equals(this.twitter, customRequestAboutSocialData.twitter) &&
                Objects.equals(this.facebook, customRequestAboutSocialData.facebook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkedin, twitter, facebook);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRequestAboutSocialData {\n");

        sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
        sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
        sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
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

