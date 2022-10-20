package com.example.wondriumchallenge.domain.model

import com.example.wondriumcodingchallenge.data.remote.dto.Lecture

data class CourseDetail(
    val id: Int,
    val name: String,
    val lectures: List<Lecture>
)
