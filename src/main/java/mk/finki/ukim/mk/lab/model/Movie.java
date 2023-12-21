package mk.finki.ukim.mk.lab.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String title;
    String summary;
    //fetch - decides whether to load all the relationships of a
    //particular object/table as soon as the object/table is initially fetched.
    @ManyToOne(fetch = FetchType.LAZY)
    private Production production;
    double rating;

    public Movie() {
    }

    public Movie(String title, String summary, double rating, Production production) {
        this.production = production;
        this.title = title;
        this.summary = summary;
        this.rating = rating;
    }
}
