package com.example.itunes

class ItunesData {
    lateinit var trackId: String

    lateinit var artistName: String
    lateinit var kind: String

    constructor(trackId: String, artistName: String, kind: String) {
        this.trackId = trackId
        this.artistName = artistName
        this.kind = kind
    }
}