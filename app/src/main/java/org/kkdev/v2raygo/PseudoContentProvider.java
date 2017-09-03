package org.kkdev.v2raygo;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class PseudoContentProvider extends ContentProvider {

    /** Helper method to eliminate the nullness check. Be ware, never call it in the constructor! */
    protected Context context() { return getContext(); }

	/* PseudoContentProvider does not provide resolver actions */

    @Nullable
    @Override public String getType(final @NonNull Uri uri) { return null; }
    @Override public @Nullable
    Uri insert(final @NonNull Uri uri, final @Nullable ContentValues contentValues) { return null; }
    @Override public int delete(final @NonNull Uri uri, final @Nullable String s, final @Nullable String[] strings) { return 0; }
    @Override public int update(final @NonNull Uri uri, final @Nullable ContentValues contentValues, final @Nullable String s,
                                final @Nullable String[] strings) { return 0; }
    @Nullable @Override public Cursor query(final @NonNull Uri uri, final @Nullable String[] projection, final @Nullable String selection,
                                            final @Nullable String[] selection_args, final @Nullable String sort) { return null; }

    /** PseudoContentProvider never register itself. */
    @Override public boolean onCreate() { return false; }
}
