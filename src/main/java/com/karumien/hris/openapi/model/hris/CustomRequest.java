package com.karumien.hris.openapi.model.hris;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CustomRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("personal")
  private CustomRequestPersonal personal;

  @JsonProperty("creationDateTime")
  private String creationDateTime;

  @JsonProperty("work")
  private CustomRequestWork work;

  @JsonProperty("avatarUrl")
  private String avatarUrl;

  @JsonProperty("secondName")
  private String secondName;

  @JsonProperty("about")
  private CustomRequestAbout about;

  @JsonProperty("companyId")
  private BigDecimal companyId;

  @JsonProperty("email")
  private String email;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("id")
  private String id;

  @JsonProperty("firstName")
  private String firstName;

  public CustomRequest fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   *
   * @return fullName
   */
  @ApiModelProperty(example = "Ivo Šmajstrla", value = "")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CustomRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   *
   * @return displayName
   */
  @ApiModelProperty(example = "Ivo Šmajstrla", value = "")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CustomRequest personal(CustomRequestPersonal personal) {
    this.personal = personal;
    return this;
  }

  /**
   * Get personal
   *
   * @return personal
   */
  @ApiModelProperty(value = "")

  @Valid

  public CustomRequestPersonal getPersonal() {
    return personal;
  }

  public void setPersonal(CustomRequestPersonal personal) {
    this.personal = personal;
  }

  public CustomRequest creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   *
   * @return creationDateTime
   */
  @ApiModelProperty(example = "2021-05-10T09:29:06.358057", value = "")


  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public CustomRequest work(CustomRequestWork work) {
    this.work = work;
    return this;
  }

  /**
   * Get work
   *
   * @return work
   */
  @ApiModelProperty(value = "")

  @Valid

  public CustomRequestWork getWork() {
    return work;
  }

  public void setWork(CustomRequestWork work) {
    this.work = work;
  }

  public CustomRequest avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   *
   * @return avatarUrl
   */
  @ApiModelProperty(example = "https://cdn.filestackcontent"
          + ".com/ZyBWbFNPR5GVBVULggFB?policy"
          + "=eyJoYW5kbGUiOiJaeUJXYkZOUFI1R1ZCVlVMZ2dGQiIsImV4cGlyeSI6NDYzNTkxODcwNCwiY2FsbCI6WyJyZWFkIiwgImNvbnZlcnQiXX0=&signature"
          + "=b96b1f5caae283ec9d7ac9ea74a66b2752b372128690017ba586483fd1f0acc5", value = "")


  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public CustomRequest secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   *
   * @return secondName
   */
  @ApiModelProperty(value = "")


  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public CustomRequest about(CustomRequestAbout about) {
    this.about = about;
    return this;
  }

  /**
   * Get about
   *
   * @return about
   */
  @ApiModelProperty(value = "")

  @Valid

  public CustomRequestAbout getAbout() {
    return about;
  }

  public void setAbout(CustomRequestAbout about) {
    this.about = about;
  }

  public CustomRequest companyId(BigDecimal companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   *
   * @return companyId
   */
  @ApiModelProperty(example = "393237", value = "")

  @Valid

  public BigDecimal getCompanyId() {
    return companyId;
  }

  public void setCompanyId(BigDecimal companyId) {
    this.companyId = companyId;
  }

  public CustomRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   *
   * @return email
   */
  @ApiModelProperty(example = "ismajstrla@gmail.com", value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomRequest surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   *
   * @return surname
   */
  @ApiModelProperty(example = "Šmajstrla", value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public CustomRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(example = "2570428242561335380", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   *
   * @return firstName
   */
  @ApiModelProperty(example = "Ivo", value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRequest customRequest = (CustomRequest) o;
    return Objects.equals(this.fullName, customRequest.fullName) &&
            Objects.equals(this.displayName, customRequest.displayName) &&
            Objects.equals(this.personal, customRequest.personal) &&
            Objects.equals(this.creationDateTime, customRequest.creationDateTime) &&
            Objects.equals(this.work, customRequest.work) &&
            Objects.equals(this.avatarUrl, customRequest.avatarUrl) &&
            Objects.equals(this.secondName, customRequest.secondName) &&
            Objects.equals(this.about, customRequest.about) &&
            Objects.equals(this.companyId, customRequest.companyId) &&
            Objects.equals(this.email, customRequest.email) &&
            Objects.equals(this.surname, customRequest.surname) &&
            Objects.equals(this.id, customRequest.id) &&
            Objects.equals(this.firstName, customRequest.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName,
            displayName,
            personal,
            creationDateTime,
            work,
            avatarUrl,
            secondName,
            about,
            companyId,
            email,
            surname,
            id,
            firstName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRequest {\n");

    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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

