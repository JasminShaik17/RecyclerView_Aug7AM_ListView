package cubex.mahesh.recyclerview_aug7am

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class MyAdapter:RecyclerView.Adapter<MyHolder>( )
{
    var mActivity:MainActivity? = null
    constructor(mActivity:MainActivity){
            this.mActivity = mActivity
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyHolder {

    }

    override fun getItemCount(): Int {

      }

    override fun onBindViewHolder(p0: MyHolder, p1: Int) {

      }

}