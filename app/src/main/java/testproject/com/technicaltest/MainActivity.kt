package testproject.com.technicaltest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridView
import android.widget.Switch
import com.google.gson.Gson
import testproject.com.technicaltest.adapters.LogoAdapters
import testproject.com.technicaltest.model.ChannelList
import java.io.IOException

class MainActivity : AppCompatActivity() {
    private var gridView:GridView ? = null
    private var logoAdapters:LogoAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Read json file as string
        val json = loadJson("GetChannelList.json")

        // Use gson library
        val gson = Gson()

        // Parse json file into class ChannelList
        val channelList:ChannelList = gson.fromJson(json, ChannelList::class.java)

        // Find app grid
        gridView = findViewById<GridView>(R.id.grid_view)

        // Set channel logos
        logoAdapters = LogoAdapters(applicationContext, channelList.getResponse())
        gridView?.adapter = logoAdapters

        // Movie channel filter
        val filter:Switch = findViewById(R.id.filter)
        // Filtered response list
        val filteredList = channelList.getResponse().filter { it.getCategory() == "Cine" }
        // Filtered channel list
        val filteredChannelList:ChannelList = ChannelList(channelList.getMetadata(), filteredList)
        // Filtered adapter
        val filteredLogoAdapter = LogoAdapters(applicationContext, filteredChannelList.getResponse())

        // Filter activity
        filter.setOnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked) {
                gridView?.adapter = filteredLogoAdapter
            }
            else{
                gridView?.adapter = logoAdapters
            }
        }
    }

    // Load json file from assets folder
    fun loadJson(inFile:String):String{
        var jsonString = ""

        try{
            val stream = assets.open(inFile)
            val size = stream.available()
            val buffer = ByteArray(size)

            stream.read(buffer)
            stream.close()

            jsonString = String(buffer)
        } catch (e: IOException){
            Log.d("Error", "while reading file")
        }
        return jsonString
    }
}