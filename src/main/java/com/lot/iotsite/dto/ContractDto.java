package com.lot.iotsite.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ContractDto {
    @ApiModelProperty("合同id")
    private Long id;

    @ApiModelProperty("委托人名称")
    private String clientName;

    @ApiModelProperty("委托人类型")
    private String clientType;

    @ApiModelProperty("合同描述")
    private String description;

    @ApiModelProperty("服务方案")
    private String service;

    @ApiModelProperty("委托方意向")
    private String clientIntention;

    @ApiModelProperty("创建者")
    private String creater;

    @ApiModelProperty("合同创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("合同进度")
    private String progress;
}
