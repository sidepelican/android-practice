package junktown.side.gmail.com.alarmclock

import android.support.v7.app.AlertDialog
import android.app.Dialog
import android.support.v4.app.DialogFragment
import android.os.Bundle
import org.jetbrains.anko.toast

class SimpleAlertDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val context = context
        if (context == null)
            return super.onCreateDialog(savedInstanceState)

        val builder = AlertDialog.Builder(context).apply {
            setMessage("時間になりました")
            setPositiveButton("起きる") { a, b ->
                context.toast("起きるを選択")
            }
            setNegativeButton("あと5分") { a, b ->
                context.toast("あと5分を選択")
            }
        }
        return builder.create()
    }
}