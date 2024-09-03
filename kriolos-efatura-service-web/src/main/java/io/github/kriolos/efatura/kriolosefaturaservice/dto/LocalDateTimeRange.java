package io.github.kriolos.efatura.kriolosefaturaservice.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeRange extends AbstractTemporalRange<LocalDateTime>{

    public LocalDateTimeRange(LocalDateTime startDate, LocalDateTime endDate){
        super(startDate, endDate);
    }
}
