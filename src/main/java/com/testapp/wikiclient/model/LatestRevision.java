package com.testapp.wikiclient.model;

public class LatestRevision {
    private long id;

    private String timestamp;

    public LatestRevision() {
    }

    public LatestRevision(long id, String timestamp) {
        this.id = id;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
