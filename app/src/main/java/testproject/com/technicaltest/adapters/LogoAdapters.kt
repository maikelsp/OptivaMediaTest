package testproject.com.technicaltest.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import testproject.com.technicaltest.R
import testproject.com.technicaltest.model.Attachments
import testproject.com.technicaltest.model.Channel
import java.io.IOException
import java.io.InputStream

class LogoAdapters (var context: Context, var channelList: List<Channel>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Get views
        var view:View = View.inflate(context, R.layout.card_view_item_grid, null)
        var icons:ImageView = view.findViewById(R.id.icons)
        var names:TextView = view.findViewById(R.id.name_text_view)

        // Current channel
        var listItem:Channel = channelList.get(position)

        // Find logo url
        var iconUrl:Attachments? = listItem.getAttachments().find { it.getName() == "LOGO" }

        // Load image from url
        if (iconUrl != null) {
            Picasso.get().isLoggingEnabled = true
            Picasso.get().load("https://orangetv.orange.es/stv/api/rtv/v1/images" + iconUrl.getValue()).into(icons, object: com.squareup.picasso.Callback {
                override fun onSuccess() {
                    // set animations here
                }

                override fun onError(e: java.lang.Exception?) {
                    // In case picasso can't load the image (url not working)
                    setDefaultImage(icons)
                }
            })
        }
        else{
            // Load image when url not found
            setDefaultImage(icons)
        }

        // Set channel name
        names.text = listItem.getName()

        return view
    }

    override fun getItem(position: Int): Any {
        return channelList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return channelList.size
    }

    fun setDefaultImage(icons: ImageView) {
        // placeholder image
        try {
            // get input stream
            val ims: InputStream = context.assets.open("placeholder.png")
            // load image as Drawable
            val d = Drawable.createFromStream(ims, null)
            // set image to ImageView
            icons.setImageDrawable(d)
        } catch (ex: IOException) {
            Log.d("Error:", "No se ha podido cargar la imagen")
        }
    }
}