package com.backline.test.serviceb;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class FileService {

    private static final JsonFactory JSON_FACTORY = new JsonFactory();

    public String readFile(File file) throws Exception {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }

    public JsonParser parseJson(String json) throws Exception {
        return JSON_FACTORY.createParser(json);
    }

    public static void main(String[] args) {
        System.out.println("FileService ready");
    }
}
