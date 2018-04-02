
package moviestore;

import java.time.*;

public class Movie {
    
    private String name;
    private String format;
    private LocalDate date;
    private Category category;

    public Movie(String name, String format, LocalDate date, Category category) {
        this.name = name;
        this.format = format;
        this.date = date;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public LocalDate getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
           
}
