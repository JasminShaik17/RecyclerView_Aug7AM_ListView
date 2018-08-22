package cubex.mahesh.recyclerview_aug7am

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* var lManager = LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false)
        rview.layoutManager = lManager */
        var gManager = GridLayoutManager(this,2)
        rview.layoutManager =  gManager
        rview.adapter = MyAdapter(this@MainActivity)
        fab.setOnClickListener {
          //  System.exit(0)
            var sBar = Snackbar.make(it,"Are You Sure want to Exit?",
                    Snackbar.LENGTH_INDEFINITE)
            sBar.setAction("Yes",{
                System.exit(0)
            })
            sBar.setActionTextColor(Color.RED)
            sBar.show()
        }

    }
}
