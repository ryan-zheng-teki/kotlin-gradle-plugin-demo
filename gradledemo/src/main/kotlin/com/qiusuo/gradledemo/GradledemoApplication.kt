package com.qiusuo.gradledemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradledemoApplication

fun main(args: Array<String>) {
	runApplication<GradledemoApplication>(*args)
}
