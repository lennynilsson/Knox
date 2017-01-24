package se.bylenny.skeleton

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.list

class MainActivity : Activity() {

    private lateinit var adapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = KnowAdapter()
        adapter.setBinder()
        list.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }
}

class KnowAdapter : RecyclerView.Adapter<KnoxViewHolder>() {

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: KnoxViewHolder?, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): KnoxViewHolder {

    }
}

class KnoxViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

interface Binder {
    
}
