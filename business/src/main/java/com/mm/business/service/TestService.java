package com.mm.business.service;

import com.mm.dao.po.TestPO;

/**
 * @author mmn
 * @date 2020/4/26
 */
public interface TestService {
    /**
     * test
     * @return
     */
    String test1();

    /**
     *
     * @return
     */
    TestPO saveAndGet();
}
