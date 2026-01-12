package com.example.project0107.memo;

import lombok.*;

import java.util.Date;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Memo {
    private String username;
    private String content;
    private String title;
    private Date createAt;
    private Date updateAt;

    public void writeMemo() {


    }
}
