package org.example.infrastructure.model.po;

import lombok.Data;

@Data
public class StudentInfoPo {
    /**
     * 学生号
     */
    private Integer studentNumber;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 姓名
     */
    private String name;

}
