package com.houtianze.phcustomer.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class StatusConverter implements AttributeConverter<Status, String> {
    private Map<Status, String> toStringMap;
    private Map<String, Status> fromStringMap;
    public StatusConverter() {
        toStringMap = new HashMap<>();
        fromStringMap = new HashMap<>();
        toStringMap.put(Status.Prospective, "prospective");
        toStringMap.put(Status.Current, "current");
        toStringMap.put(Status.NonActive, "non-active");
        fromStringMap.put("prospective", Status.Prospective);
        fromStringMap.put("current", Status.Current);
        fromStringMap.put("non-active", Status.NonActive);
    }

    @Override
    public String convertToDatabaseColumn(Status attribute) {
        return toStringMap.get(attribute);
    }

    @Override
    public Status convertToEntityAttribute(String dbData) {
        return fromStringMap.get(dbData);
    }
}