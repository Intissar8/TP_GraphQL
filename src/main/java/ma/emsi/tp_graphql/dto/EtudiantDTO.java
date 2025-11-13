package ma.emsi.tp_graphql.dto;

import ma.emsi.tp_graphql.enums.Genre;

public record EtudiantDTO (
        String nom,
        String prenom,
        Genre genre,
        Long centreId
){ }