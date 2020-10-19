package org.example.jobsearch;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class JobPosition {
    private String id;
    private String type;
    private String url;
    @SerializedName("created_at")
    private String created;
    private String company;
    @SerializedName("company_url")
    private String companyURL;
    private String location;
    private String tittle;
    private String description;
    @SerializedName("how_to_apply")
    private String howToApply;
    @SerializedName("company_logo")
    private String companyLogo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHowToApply() {
        return howToApply;
    }

    public void setHowToApply(String howToApply) {
        this.howToApply = howToApply;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(url, that.url) &&
                Objects.equals(created, that.created) &&
                Objects.equals(company, that.company) &&
                Objects.equals(companyURL, that.companyURL) &&
                Objects.equals(location, that.location) &&
                Objects.equals(tittle, that.tittle) &&
                Objects.equals(description, that.description) &&
                Objects.equals(howToApply, that.howToApply) &&
                Objects.equals(companyLogo, that.companyLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, url, created, company, companyURL, location, tittle, description, howToApply, companyLogo);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", company='" + company + '\'' +
                ", companyURL='" + companyURL + '\'' +
                ", location='" + location + '\'' +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", howToApply='" + howToApply + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                '}';
    }
}
