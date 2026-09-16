package pt.ul.fc.css.example.demo.dtos;

import java.util.List;

public record AuthorDTO(Long id, String name, String surname, List<Long> bookIDs) {}