package com.example.asterixapi;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Character")
public record Character(String id, String name, int age, String profession) {
}
