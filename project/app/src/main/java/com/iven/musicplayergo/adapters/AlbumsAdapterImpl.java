package com.iven.musicplayergo.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.iven.musicplayergo.models.Album;
import com.iven.musicplayergo.playback.PlayerAdapter;

import java.util.List;

class AlbumsAdapterImpl extends AlbumsAdapter {
    public AlbumsAdapterImpl(@NonNull Activity activity, List<Album> albums, PlayerAdapter playerAdapter, int accent) {
        super(activity, albums, playerAdapter, accent);
    }
}
