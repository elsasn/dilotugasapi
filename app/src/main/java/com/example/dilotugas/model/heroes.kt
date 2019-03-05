package com.example.dilotugas.model

data class heroes(
        val attack_type: String,
        val id: Int,
        val legs: Int,
        val localized_name: String,
        val name: String,
        val primary_attr: String,
        val roles: List<String>
)