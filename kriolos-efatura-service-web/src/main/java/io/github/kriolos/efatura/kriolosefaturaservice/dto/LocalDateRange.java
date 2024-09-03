package io.github.kriolos.efatura.kriolosefaturaservice.dto;

import java.time.LocalDate;

public class LocalDateRange extends AbstractTemporalRange<LocalDate>{

    public LocalDateRange(LocalDate startDate, LocalDate endDate){
        super(startDate, endDate);
    }
}
