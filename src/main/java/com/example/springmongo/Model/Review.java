package com.example.springmongo.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "Review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review {
    @Id
    private String id;

    private String comment;

    private Book book;
}
