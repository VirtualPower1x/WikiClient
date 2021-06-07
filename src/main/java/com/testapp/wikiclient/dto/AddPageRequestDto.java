package com.testapp.wikiclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddPageRequestDto {

    private String source;

    private String title;

    private String comment;

    @JsonProperty("content_model")
    private String contentModel;

    private String token;

    public AddPageRequestDto() {

    }

    public AddPageRequestDto(String source, String title, String comment) {
        this.source = source;
        this.title = title;
        this.comment = comment;
    }

    public AddPageRequestDto(String source, String title, String comment, String contentModel, String token) {
        this.source = source;
        this.title = title;
        this.comment = comment;
        this.contentModel = contentModel;
        this.token = token;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getContentModel() {
        return contentModel;
    }

    public void setContentModel(String contentModel) {
        this.contentModel = contentModel;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
