package com.example.googlemaps;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBuffer;

import java.util.Iterator;

public class AutocompletePredictionBuffer<E> implements Result, DataBuffer<E> {
    @NonNull
    @Override
    public Status getStatus() {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Nullable
    @Override
    public Bundle getMetadata() {
        return null;
    }

    @NonNull
    @Override
    public E get(int i) {
        return null;
    }

    @NonNull
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Iterator<E> singleRefIterator() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void release() {

    }

    @Override
    public boolean isClosed() {
        return false;
    }
}
