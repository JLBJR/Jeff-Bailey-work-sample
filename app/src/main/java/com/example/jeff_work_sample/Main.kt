package com.example.jeff_work_sample

fun main() {
    val filePath = "data.txt›"
    val productParser = ProductParser()
    productParser.generateReportFromFile(filePath)
}