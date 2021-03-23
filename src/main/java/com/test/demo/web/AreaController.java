package com.test.demo.web;

import com.test.demo.entity.AreaInfo;
import com.test.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/getAreas", method = RequestMethod.GET)
    public List<AreaInfo> getAreas() {
        List<AreaInfo> result = areaService.getAreaList();
        return result;
    }

    @RequestMapping(value = "/getAreasMap")
    public List<Map<String, Object>> getAres() {
        List<Map<String, Object>> result = areaService.getAreas();
        return result;
    }
}
