package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Instant;

public class Product {
    private long id;
    private float prices;
    private int quantitys;
    private Date dateCreated;
    private Instant dateUpdated;
    private String name;
    private String madeIn = "Empty";
    private String desinBy = "Empty";

    public Product() {
    }

    ;

    public Product(long id, String name, int quantitys, float prices, Date dateCreated, Instant dateUpdated) {
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.quantitys = quantitys;
        this.prices = prices;
    }

    public Product(long id, String name, int quantitys, float prices, Date dateCreated,
                   Instant dateUpdated, String madeIn, String desinBy) {
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.quantitys = quantitys;
        this.prices = prices;
        this.madeIn = madeIn;
        this.desinBy = desinBy;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public float getPrices() {
        return this.prices;
    }

    public int getQuantitys() {
        return quantitys;
    }

    public long getId() {
        return id;
    }

    public String getDesinBy() {
        return desinBy;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setDesinBy(String desinBy) {
        this.desinBy = desinBy;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public void setPrices(float prices) {
        this.prices = prices;
    }

    public void setQuantitys(int quantitys) {
        this.quantitys = quantitys;
    }

    @Override
    public String toString() {
        String dataTimeFormat = "hh:mm:ss E dd:MM:yyyy";
        DateFormat dataFormat = new SimpleDateFormat(dataTimeFormat);
        String dateCreatedFormatToString = dataFormat.format(this.dateCreated);
        String dateUpdatedFormatToString = dataFormat.format(Date.from((this.dateUpdated)));
        return String.format("15%s %15s %15s %15s %15s %15s %15s %15s", this.id, this.name, this.quantitys,
                this.prices, dateCreatedFormatToString, dateUpdatedFormatToString, this.madeIn, this.desinBy);
    }
}
