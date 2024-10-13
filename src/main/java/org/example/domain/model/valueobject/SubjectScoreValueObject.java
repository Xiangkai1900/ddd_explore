package org.example.domain.model.valueobject;

/**
 * 学科分数值对象
 */
public class SubjectScoreValueObject {
    /**
     * 分数
     */
    public Integer score;


    public SubjectScoreValueObject(Integer score) {
        if (score == null) {
            throw new RuntimeException("分数不能为空！");
        }
        // 假设分数都是0-100分，此处可以统一校验
        if (score > 100 || score < 0) {
            throw new RuntimeException("分数有误！");
        }
        this.score = score;
    }
}
