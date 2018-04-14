package com.project.cloud.as.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Document(collection = "accounts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    @Id
    private String id;

    private String name;

    @Valid
    private List<PriceItem> incomes;

    @Valid
    private List<PriceItem> expenses;


    @Valid
    @NotNull
    private Saving saving;

    @Length(min = 0, max = 20_000)
    private String note;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PriceItem> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<PriceItem> incomes) {
        this.incomes = incomes;
    }

    public List<PriceItem> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<PriceItem> expenses) {
        this.expenses = expenses;
    }

    public Saving getSaving() {
        return saving;
    }

    public void setSaving(Saving saving) {
        this.saving = saving;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
