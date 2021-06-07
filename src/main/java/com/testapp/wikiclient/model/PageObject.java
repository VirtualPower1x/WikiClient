package com.testapp.wikiclient.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageObject {

    private int id;

    private String key;

    private String title;

    private LatestRevision latest;

    @JsonProperty("content_model")
    private String contentModel;

    private Map<String, String> license;

    @JsonProperty("html_url")
    private String htmlUrl;

    private String html;

    private String source;

    public PageObject() {
    }

    public PageObject(int id, String key, String title, LatestRevision latest, String contentModel, Map<String, String> license, String htmlUrl, String html, String source) {
        this.id = id;
        this.key = key;
        this.title = title;
        this.latest = latest;
        this.contentModel = contentModel;
        this.license = license;
        this.htmlUrl = htmlUrl;
        this.html = html;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LatestRevision getLatest() {
        return latest;
    }

    public void setLatest(LatestRevision latest) {
        this.latest = latest;
    }

    public String getContentModel() {
        return contentModel;
    }

    public void setContentModel(String contentModel) {
        this.contentModel = contentModel;
    }

    public Map<String, String> getLicense() {
        return license;
    }

    public void setLicense(Map<String, String> license) {
        this.license = license;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
