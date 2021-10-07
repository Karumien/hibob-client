package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomRequestAbout
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomRequestAbout implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("foodPreferences")
    @Valid
    private List<String> foodPreferences = null;

    @JsonProperty("custom")
    private CustomRequestAboutCustom custom;

    @JsonProperty("socialData")
    private CustomRequestAboutSocialData socialData;

    @JsonProperty("superpowers")
    @Valid
    private List<String> superpowers = null;

    @JsonProperty("hobbies")
    @Valid
    private List<String> hobbies = null;

    @JsonProperty("about")
    private String about;

    @JsonProperty("avatar")
    private String avatar;

    public CustomRequestAbout foodPreferences(List<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
        return this;
    }

    public CustomRequestAbout addFoodPreferencesItem(String foodPreferencesItem) {
        if (this.foodPreferences == null) {
            this.foodPreferences = new ArrayList<>();
        }
        this.foodPreferences.add(foodPreferencesItem);
        return this;
    }

    /**
     * Get foodPreferences
     *
     * @return foodPreferences
     */
    @ApiModelProperty(value = "")


    public List<String> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(List<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public CustomRequestAbout custom(CustomRequestAboutCustom custom) {
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

    public CustomRequestAboutCustom getCustom() {
        return custom;
    }

    public void setCustom(CustomRequestAboutCustom custom) {
        this.custom = custom;
    }

    public CustomRequestAbout socialData(CustomRequestAboutSocialData socialData) {
        this.socialData = socialData;
        return this;
    }

    /**
     * Get socialData
     *
     * @return socialData
     */
    @ApiModelProperty(value = "")

    @Valid

    public CustomRequestAboutSocialData getSocialData() {
        return socialData;
    }

    public void setSocialData(CustomRequestAboutSocialData socialData) {
        this.socialData = socialData;
    }

    public CustomRequestAbout superpowers(List<String> superpowers) {
        this.superpowers = superpowers;
        return this;
    }

    public CustomRequestAbout addSuperpowersItem(String superpowersItem) {
        if (this.superpowers == null) {
            this.superpowers = new ArrayList<>();
        }
        this.superpowers.add(superpowersItem);
        return this;
    }

    /**
     * Get superpowers
     *
     * @return superpowers
     */
    @ApiModelProperty(value = "")


    public List<String> getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(List<String> superpowers) {
        this.superpowers = superpowers;
    }

    public CustomRequestAbout hobbies(List<String> hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public CustomRequestAbout addHobbiesItem(String hobbiesItem) {
        if (this.hobbies == null) {
            this.hobbies = new ArrayList<>();
        }
        this.hobbies.add(hobbiesItem);
        return this;
    }

    /**
     * Get hobbies
     *
     * @return hobbies
     */
    @ApiModelProperty(value = "")


    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public CustomRequestAbout about(String about) {
        this.about = about;
        return this;
    }

    /**
     * Get about
     *
     * @return about
     */
    @ApiModelProperty(value = "")


    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public CustomRequestAbout avatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    /**
     * Get avatar
     *
     * @return avatar
     */
    @ApiModelProperty(example = "https://cdn.filestackcontent"
            + ".com/ZyBWbFNPR5GVBVULggFB?policy"
            + "=eyJoYW5kbGUiOiJaeUJXYkZOUFI1R1ZCVlVMZ2dGQiIsImV4cGlyeSI6NDYzNTkxODcwNCwiY2FsbCI6WyJyZWFkIiwgImNvbnZlcnQiXX0=&signature"
            + "=b96b1f5caae283ec9d7ac9ea74a66b2752b372128690017ba586483fd1f0acc5", value = "")


    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomRequestAbout customRequestAbout = (CustomRequestAbout) o;
        return Objects.equals(this.foodPreferences, customRequestAbout.foodPreferences) &&
                Objects.equals(this.custom, customRequestAbout.custom) &&
                Objects.equals(this.socialData, customRequestAbout.socialData) &&
                Objects.equals(this.superpowers, customRequestAbout.superpowers) &&
                Objects.equals(this.hobbies, customRequestAbout.hobbies) &&
                Objects.equals(this.about, customRequestAbout.about) &&
                Objects.equals(this.avatar, customRequestAbout.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodPreferences, custom, socialData, superpowers, hobbies, about, avatar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRequestAbout {\n");

        sb.append("    foodPreferences: ").append(toIndentedString(foodPreferences)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    socialData: ").append(toIndentedString(socialData)).append("\n");
        sb.append("    superpowers: ").append(toIndentedString(superpowers)).append("\n");
        sb.append("    hobbies: ").append(toIndentedString(hobbies)).append("\n");
        sb.append("    about: ").append(toIndentedString(about)).append("\n");
        sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
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

