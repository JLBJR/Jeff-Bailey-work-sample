package com.example.jeff_work_sample

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ProductParserTest {

    private lateinit var productParser: ProductParser

    @Before
    fun setUp() {
        productParser = ProductParser()
    }

    @Test
    fun `Given invalid file, When generateReportFromFile called, Then reportGenerated is false`() {
        // Given
        val invalidFileName = "data.tx"

        // When
        val reportGenerated = productParser.generateReportFromFile(invalidFileName)

        // Then
        Assert.assertFalse(reportGenerated)
    }

    @Test
    fun `Given valid file, When generateReportFromFile called, Then reportGenerated is true`() {
        // Given
        val validFileName = "src/test/assets/data.txt"

        // When
        val reportGenerated = productParser.generateReportFromFile(validFileName)

        // Then
        Assert.assertTrue(reportGenerated)
    }
}