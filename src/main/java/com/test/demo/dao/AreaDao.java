package com.test.demo.dao;

import com.test.demo.entity.AreaInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface AreaDao {
    List<Map<String,Object>> getAreas();
    List<AreaInfo> getAreasList();
}
