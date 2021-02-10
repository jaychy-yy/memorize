package com.dsm.memorization.domain

import javax.persistence.*

@Entity
@Table(name = "word")
class Word(

    @Column(name = "english_word")
    val english: String,

    @Column(name = "korean_word")
    val korean: String,

    @Column(name = "count")
    val count: Int,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null
}