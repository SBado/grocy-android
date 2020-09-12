package xyz.zedler.patrick.grocy.model;

/*
    This file is part of Grocy Android.

    Grocy Android is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Grocy Android is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Grocy Android.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2020 by Patrick Zedler & Dominic Zedler
*/

import android.os.Bundle;

import androidx.annotation.Nullable;

public abstract class Event {

    public final static int SNACKBAR_MESSAGE = 0;
    public final static int PURCHASE_SUCCESS = 2;
    public final static int BARCODE_UNKNOWN = 4;

    abstract public int getType();

    @Nullable
    public Bundle getBundle() {
        return null;
    }
}