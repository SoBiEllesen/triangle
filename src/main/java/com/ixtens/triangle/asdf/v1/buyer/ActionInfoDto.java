package com.ixtens.triangle.asdf.v1.buyer;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("ActionInfo")
public class ActionInfoDto {
    @ApiModelProperty(value = "Action ID", required = true)
    private long actionId;

    @ApiModelProperty(value = "Internal User ID", required = true)
    private String userId;

    @ApiModelProperty(value = "Action type", required = true)
    private String type;

    @ApiModelProperty(value = "Action state", allowableValues = "init,in_progress,complete,failed,complete_with_error,aborting,aborted", required = true)
    private String state;

    @ApiModelProperty("Action start date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long startDate;

    @ApiModelProperty("Action end date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long endDate;

    @ApiModelProperty(value = "Processed item count", required = true)
    private int processedItemCount;

    @ApiModelProperty(value = "Error item count", required = true)
    private int errorItemCount;

    @ApiModelProperty(value = "Warning item count", required = true)
    private int warningItemCount;

    @ApiModelProperty(value = "Success item count", required = true)
    private int successItemCount;

    @ApiModelProperty("Total item count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer totalItemCount;

    public ActionInfoDto() {
    }

    public ActionInfoDto(long actionId, String userId, String type) {
        this.actionId = actionId;
        this.userId = userId;
        this.type = type;
    }

    public long getActionId() {
        return actionId;
    }

    public void setActionId(long actionId) {
        this.actionId = actionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public int getProcessedItemCount() {
        return processedItemCount;
    }

    public void setProcessedItemCount(int processedItemCount) {
        this.processedItemCount = processedItemCount;
    }

    public int getErrorItemCount() {
        return errorItemCount;
    }

    public void setErrorItemCount(int errorItemCount) {
        this.errorItemCount = errorItemCount;
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
