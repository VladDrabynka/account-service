package com.project.cloud.as.model;

public enum  Currency {
    USD, EUR, RUB;

    public static Currency getDefault() {
        return USD;
    }
}
