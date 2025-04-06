package br.micucci.taskboard.dto;


import br.micucci.taskboard.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}