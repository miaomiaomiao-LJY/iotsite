package com.lot.iotsite.dto;

import com.lot.iotsite.domain.Check;
import com.lot.iotsite.domain.CheckSystem;
import lombok.Data;

import java.util.List;

@Data
public class CheckItemDto {

    private Check check;

    private String checkSystemName;

    private String checkRisk;

    private List<String> pictureUrlList;

    private CheckSystem firstCheckSystem;

    private CheckSystem secondCheckSystem;
}
