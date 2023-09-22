package io.RCCPM.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class Data {
  @SerializedName("score")
  private Score score = null;
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("folioConsulta")
  private String folioConsulta = null;

  public Data folioOtorgante(Score score) {
    this.score = score;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Score getScore() {
    return score;
  }
  public void setScore(Score score) {
    this.score = score;
  }

  public String getFolioOtorgante() {
    return folioOtorgante;
  }

  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }

  public String getFolioConsulta() {
    return folioConsulta;
  }

  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data data = (Data) o;
    return Objects.equals(this.score, data.score);
  }
  @Override
  public int hashCode() {
    return Objects.hash(score);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");

    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
