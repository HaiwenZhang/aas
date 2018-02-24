package ch02

import org.apache.spark.sql.SparkSession

class Recommender {

}

object Recommender {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().getOrCreate();

    val rawUserArtistData = spark.read.textFile("/Users/haiwen/data/aas/ch02/user_artist_data.txt")

    rawUserArtistData.take(5).foreach(println)
  }
}