package cubex.mahesh.recyclerview_aug7am

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.ThumbnailUtils
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import java.io.File

class MyAdapter:RecyclerView.Adapter<MyHolder>
{
    var mActivity:MainActivity? = null
    var files:Array<File>? = null
    var file:File? = null
    constructor(mActivity:MainActivity){
            this.mActivity = mActivity
       var path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Images/"
         file = File(path)
        if(!file!!.exists()){
            path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Images/"
            file = File(path)
        }
        files = file!!.listFiles()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyHolder {

        var inflater = LayoutInflater.from(mActivity)
        var v = inflater.inflate(R.layout.indiview,p0,
                false)
        return  MyHolder(v)
    }

    override fun getItemCount(): Int {
        return  files!!.size
      }

    override fun onBindViewHolder(p0: MyHolder, p1: Int) {
            var f:File = files!![p1]
            p0.name!!.text = f.name
            p0.size!!.text = f.length().toString()
            p0.del!!.setOnClickListener {
                        f.delete()
                files = file!!.listFiles()
                this@MyAdapter.notifyDataSetChanged()
            }
            var bmp:Bitmap = BitmapFactory.decodeFile(f.path)
            if(bmp!=null) {
                var thumb_nail = ThumbnailUtils.extractThumbnail(bmp,
                        50, 50)
                p0.cView!!.setImageBitmap(thumb_nail)
            }
      }

}