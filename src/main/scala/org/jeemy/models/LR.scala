package org.jeemy.models

import org.apache.spark.sql.DataFrame

/**
 * @User: zhanghuayan
 * @Date: 2020/4/29 5:45 下午
 * @DESC: Spark LR CTR预测模型实现
 */
class LR extends BaseModel {
  /**
   * 预测函数接口
   */
  def predict(feature: Array[Double]): Double = {
    val score = 0.0
    // TODO
    score
  }

  /**
   * 训练函数接口
   */
  def fit(trainData: DataFrame): BaseModel = {
    val lr: LR = null
    // TODO
    lr
  }

  /**
   * 模型保存
   */
  def saveModel(): Unit = {
    // TODO
  }

  /**
   * 模型加载
   */
  def loadModel(modelPath: String): BaseModel = {
    val lr: LR = null;
    // TODO
    lr
  }
}
