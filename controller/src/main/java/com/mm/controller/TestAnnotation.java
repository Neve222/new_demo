package com.mm.controller;

import com.mm.dao.po.Person;
import com.mm.dao.util.PersonInfoUtil;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author mmn
 * @date 2020/4/26
 */
public class TestAnnotation {
    public static void main(String[] args) {
//        PersonInfoUtil.getPersonInfo(Person.class);

        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version", 6.19));
        pairArrayList.add(new Pair<>("version", 10.24));
        pairArrayList.add(new Pair<>("version", 13.14));
        Map<String, Double> map = pairArrayList.stream().collect(
                // 生成的 map 集合中只有一个键值对：{version=13.14}
                Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v2));
        System.out.println(map);

        String[] departments = new String[] {"iERP", "iERP", "EIBU"};
        // 抛出 IllegalStateException 异常
        Map<Integer, String> map1 = Arrays.stream(departments)
                .collect(Collectors.toMap(String::hashCode, str -> str));
        System.out.println(map1);
    }
}
