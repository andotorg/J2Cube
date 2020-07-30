package org.andot.data.j2cube.util;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLParser;
import com.google.common.base.Optional;
import com.google.common.io.Resources;
import org.andot.data.j2cube.cube.J2Cube;
import org.andot.data.j2cube.cube.imple.PostgresCube;
import org.andot.data.j2cube.dto.ConnectionInfoDTO;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 读取 yml的配置类
 */
public final class YmlUtil extends Yaml {
    private String active;
    private String prefix;

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        YmlUtil ymlUtil = new YmlUtil();
        Iterable<Object> linkedHashMap = ymlUtil.loadAll("config.yml");
        ymlUtil.loadAs("config.yml");
    }

    private Map<String, Object> loadAs(String path) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        YAMLFactory yamlFactory = new YAMLFactory();
        YAMLParser yamlParser = yamlFactory.createParser(this.getClass().getClassLoader().getResourceAsStream(path));
        List<String> keys = new LinkedList<>();
        Map<String, Object> map = new LinkedHashMap(32);
        JsonToken jsonToken = yamlParser.nextToken();

        Class<?> clazz = Class.forName("org.andot.data.j2cube.dto.ConnectionInfoDTO");
        Object object = clazz.newInstance();

        while (jsonToken != null){
            if(jsonToken.isStructStart()){
                keys.add(yamlParser.nextFieldName());
            }else{
                if(!jsonToken.isStructEnd()) {
                    map.put(keys.stream().collect(Collectors.joining(".")), yamlParser.getText());
                    Field[] fields = clazz.getDeclaredFields();
                    for (int i = 0; i < fields.length; i++) {
                        if(keys.get(keys.size()-1).equalsIgnoreCase(fields[i].getName())){
                            fields[i].setAccessible(true);
                            fields[i].set(object, yamlParser.getText());
                        }
                    }
                    keys.remove(keys.size() - 1);
                    keys.add(yamlParser.nextFieldName());
                }else{
                    keys = null;
                }
            }
            jsonToken = yamlParser.nextToken();
        }
        return map;
    }
}
