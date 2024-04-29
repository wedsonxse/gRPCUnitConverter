package com.wedsonxse.valueEmitter.domain;

import java.security.spec.InvalidParameterSpecException;

public class TemperatureValue {
    private float value;
    private TemperatureEnum currentMetricUnit;
    private TemperatureEnum destinyMetricUnit;

    public TemperatureValue(float value, TemperatureEnum currentMetricUnit, TemperatureEnum destinyMetricUnit) throws InvalidParameterSpecException {
        try {
            if (currentMetricUnit == destinyMetricUnit) {
                throw new Exception("Current and Destiny metric unit must be different");
            }

            this.value = value;
            this.currentMetricUnit = currentMetricUnit;
            this.destinyMetricUnit = destinyMetricUnit;
        } catch (Exception e) {
            throw new InvalidParameterSpecException(e.getMessage());
        }
    }
}
