package io.github.kriolos.efatura.kriolosefaturaservice.dto;

public class AbstractTemporalRange<T> {
    private T startDate;
    private T endDate;

    public AbstractTemporalRange(T startDate, T endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public T getStartDate() {
        return startDate;
    }

    public void setStartDate(T startDate) {
        this.startDate = startDate;
    }

    public T getEndDate() {
        return endDate;
    }

    public void setEndDate(T endDate) {
        this.endDate = endDate;
    }
}
