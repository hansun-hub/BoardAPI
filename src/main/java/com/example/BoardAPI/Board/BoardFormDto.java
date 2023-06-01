package com.example.BoardAPI.Board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@NoArgsConstructor
public class BoardFormDto {

    private String title;
    private String content;

}
