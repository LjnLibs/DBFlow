package com.raizlabs.dbflow5.models

import com.raizlabs.dbflow5.TestDatabase
import com.raizlabs.dbflow5.annotation.Column
import com.raizlabs.dbflow5.annotation.ManyToMany
import com.raizlabs.dbflow5.annotation.PrimaryKey
import com.raizlabs.dbflow5.annotation.Table

@ManyToMany(referencedTable = Song::class)
@Table(database = TestDatabase::class)
class Artist(@PrimaryKey(autoincrement = true) var id: Int = 0,
             @Column var name: String = "")

@Table(database = TestDatabase::class)
class Song(@PrimaryKey(autoincrement = true) var id: Int = 0,
           @Column var name: String = "")