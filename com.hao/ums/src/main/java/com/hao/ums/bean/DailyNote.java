package com.hao.ums.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper = true)
@TableName("daily_note")
public class DailyNote {

    private Integer id;

    private String weather;

    private Date date;

    private String content;
}
