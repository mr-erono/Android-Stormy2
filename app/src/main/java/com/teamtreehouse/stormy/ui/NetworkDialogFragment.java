package com.teamtreehouse.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.teamtreehouse.stormy.R;

public class NetworkDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.network_connection)
                .setMessage(R.string.network_unavailable_message)
                .setPositiveButton(R.string.error_ok_button_text, null);

        return builder.create();
    }
}

