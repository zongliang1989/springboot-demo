package com.test.demo.service;

import com.test.demo.entity.AreaInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface AreaService {

    List<AreaInfo> getAreaList();

    List<Map<String,Object>> getAreas();
}
