package com.ixtens.triangle.asdf.v0.buyer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;


@ApiModel("ActionInfo")
public class ActionInfoV0Dto {

    @ApiModelProperty(value = "Action ID", required = true)
    private long id;

    @ApiModelProperty(value = "Internal User ID", required = true)
    private String userId;

    @ApiModelProperty(value = "Action type", required = true)
    private String type;

    @ApiModelProperty(value = "Action state", allowableValues = "Init,InProgress,Complete,Failed,CompleteWithError,Aborting,Aborted", required = true)
    private String state;

    @ApiModelProperty("Action start date")
    private Long startDate;

    @ApiModelProperty("Action end date")
    private Long endDate;

    @ApiModelProperty("Processed item count")
    private int processedItemCount;

    @ApiModelProperty("Error item count")
    private int errorItemCount;

    @ApiModelProperty("Warning item count")
    private int warningItemCount;

    @ApiModelProperty("Success item count")
    private int successItemCount;

    @ApiModelProperty("Total item count")
    private Integer totalItemCount;


    public ActionInfoV0Dto() {
    }

    public ActionInfoV0Dto(long id, String type, String userId) {
        this.id = id;
        this.type = type;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate != null ? new Date(startDate) : null;
    }

    public void setStartDate(Date startDate) {
        this.startDate = (startDate != null) ? startDate.getTime() : null;
    }

    public Date getEndDate() {
        return endDate != null ? new Date(endDate) : null;
    }

    public void setEndDate(Date endDate) {
        this.endDate = (endDate != null) ? endDate.getTime() : null;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getErrorItemCount() {
        return errorItemCount;
    }

    public void setErrorItemCount(int errorItemCount) {
        this.errorItemCount = errorItemCount;
    }

    public int getProcessedItemCount() {
        return processedItemCount;
    }

    public void setProcessedItemCount(int processedItemCount) {
        this.processedItemCount = processedItemCount;
    }

    public int getWarningItemCount() {
        return warningItemCount;
    }

    public void setWarningItemCount(int warningItemCount) {
        this.warningItemCount = warningItemCount;
    }

    public int getSuccessItemCount() {
        return successItemCount;
    }

    public void setSuccessItemCount(int successItemCount) {
        this.successItemCount = successItemCount;
    }

    public Integer getTotalItemCount() {
        return totalItemCount;
    }

    public void setTotalItemCount(Integer totalItemCount) {
        this.totalItemCount = totalItemCount;
    }

}
