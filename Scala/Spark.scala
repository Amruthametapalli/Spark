val carsData = spark.read.option("headers",true).csv("/Users/amruthametapalli/downloads/cars_data.csv")
carsData.show
