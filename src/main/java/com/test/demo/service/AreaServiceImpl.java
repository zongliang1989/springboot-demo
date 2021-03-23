package com.test.demo.service;

import com.test.demo.dao.AreaDao;
import com.test.demo.entity.AreaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AreaServiceImpl implements  AreaService{

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<AreaInfo> getAreaList() {
        return areaDao.getAreasList();
    }

    @Override
    public List<Map<String, Object>> getAreas() {
        return areaDao.getAreas();
    }
}
