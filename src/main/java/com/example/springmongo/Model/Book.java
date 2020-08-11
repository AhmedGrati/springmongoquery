package com.example.springmongo.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Document(collection = "Book")
public class Book {


    @Id
    private String id;


    private String bookName;

    private User author;
    private List<Review> reviewList;

    private float price;

}
