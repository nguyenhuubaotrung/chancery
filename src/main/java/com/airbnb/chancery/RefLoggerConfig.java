package com.airbnb.chancery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import lombok.Getter;
import org.hibernate.validator.constraints.NotEmpty;

public class RefLoggerConfig extends Configuration {
    @NotEmpty
    @JsonProperty
    @Getter
    private String refFilter;
    @NotEmpty
    @JsonProperty
    @Getter
    private String refTemplate;
}