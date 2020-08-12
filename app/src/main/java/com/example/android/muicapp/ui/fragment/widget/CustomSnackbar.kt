package com.example.android.muicapp.ui.fragment.widget

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.android.muicapp.R
import com.example.android.muicapp.utils.findSuitableParent
import com.google.android.material.snackbar.BaseTransientBottomBar
import kotlinx.android.synthetic.main.custom_snackbar.view.*

class CustomSnackbar(
    parent: ViewGroup,
    content: CustomSnackbarView
) : BaseTransientBottomBar<CustomSnackbar>(parent, content, content) {

    init {
        getView().setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                android.R.color.transparent
            )
        )
        getView().setPadding(0, 0, 0, 0)
    }

    companion object{

        fun makeCustomSnackbar(view: View): CustomSnackbar{

            val parent = view.findSuitableParent() ?: throw IllegalArgumentException(
                "No suitable parent found from the given view. Please provide a valid view."
            )
            val customView = LayoutInflater.from(view.context).inflate(
                R.layout.layout_custom_snackbar,
                parent,
                false
            ) as CustomSnackbarView
            customView.ivFace.setImageResource(R.drawable.ic_launcher_foreground)
            customView.tvLabel.text = view.resources.getString(R.string.success)
            customView.tvMessage.text = view.resources.getString(R.string.custom_snack_message)

            return CustomSnackbar(parent, customView)
        }
    }
}