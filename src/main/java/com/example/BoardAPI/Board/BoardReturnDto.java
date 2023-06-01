package com.example.BoardAPI.Board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BoardReturnDto {

    private Long id;
    private String title;
    private String content;
    private Level level;

    public BoardReturnDto(Board board){
        this.id= board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.level = board.getLevel();
    }
}
