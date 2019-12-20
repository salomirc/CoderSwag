package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslpes Graphic Beanie", "$18", "hat1"),
        Product("Devslpes Hat Black", "$20", "hat2"),
        Product("Devslpes Hat White", "$18", "hat3"),
        Product("Devslpes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopers Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopers Hoodie Red", "$32", "hoodie2"),
        Product("Devslopers Gray Hoodie", "$28", "hoodie3"),
        Product("Devslopers Black Hoodie", "$32", "hoodie4")
    )

    val shorts = listOf(
        Product("Devslopers Shirt Gray", "$28", "shirt1"),
        Product("Devslopers Badge Light Gray", "$32", "shirt2"),
        Product("Devslopers Logo Shirt Red", "$28", "shirt3"),
        Product("Devslopers Hustle", "$32", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

}