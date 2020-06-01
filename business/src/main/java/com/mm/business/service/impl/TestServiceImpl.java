package com.mm.business.service.impl;

import com.mm.business.service.TestService;
import com.mm.dao.po.TestPO;
import javafx.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * test
 *
 * @author mmn
 * @date 2020/4/26
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test1() {
        return "Hello World";
    }

    @Override
    @Transactional
    public TestPO saveAndGet() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
         concurrentHashMap.put(1, 2);
        return null;
    }
}
