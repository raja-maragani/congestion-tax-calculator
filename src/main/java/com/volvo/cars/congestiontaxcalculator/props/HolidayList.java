package com.volvo.cars.congestiontaxcalculator.props;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "holidays")
@Getter
@Setter
public class HolidayList {

    private List<HYear> years;
}
