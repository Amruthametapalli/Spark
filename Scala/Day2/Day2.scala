// Reading json data from path
val flightDF = spark.read.json("/databricks-datasets/definitive-guide/data/flight-data/json/")

// Converting json to parquet and storing it in path
flightDF.write.parquet("/mnt/Amrutha/day2/json_to_parquet_conversion")

// Reading the stored parquet data
val resultDF = spark.read.parquet("/mnt/Amrutha/day2/json_to_parquet_conversion")

// Validating source and target data
val diff = flightDF.except(resultDF)
display(diff)

// Reading and checking the number of columns
val resultColNum = resultDF.columns.size
assert (resultColNum == 3, "Target Column size != 3")

// Validating if type of count column is long
val colType = resultDF.schema("count").dataType
assert(colType == org.apache.spark.sql.types.DataTypes.LongType, "Column type is not Long")
