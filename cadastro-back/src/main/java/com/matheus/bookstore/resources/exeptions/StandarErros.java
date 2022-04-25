package com.matheus.bookstore.resources.exeptions;

import javax.persistence.criteria.CriteriaBuilder;

public class StandarErros {
    private Long timestamp;
    private Integer status;
    private  String error;

    public StandarErros(){
        super();
    }

    public StandarErros(Long timestamp, Integer status, String error) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
