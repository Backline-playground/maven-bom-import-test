package com.backline.test.servicea;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class ConfigLoader {

    private final ObjectMapper mapper = new ObjectMapper();
    private final Yaml yaml = new Yaml();

    public Map<String, Object> loadYaml(InputStream input) {
        return yaml.load(input);
    }

    public String toJson(Object obj) throws Exception {
        return mapper.writeValueAsString(obj);
    }

    public static void main(String[] args) throws Exception {
        ConfigLoader loader = new ConfigLoader();
        System.out.println(loader.toJson(Map.of("status", "ok")));
    }
}
