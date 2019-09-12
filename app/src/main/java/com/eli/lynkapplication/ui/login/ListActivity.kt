package com.eli.lynkapplication.ui.login

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.eli.lynkapplication.R
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.content_list.*

class ListActivity : AppCompatActivity() {

    private val unique: Array<Int> get() = arrayOf(7, 40, 7, 91, 100, 24, 28, 103)

    private var adapter: NumberAdapter? = null
    private var numberList = ArrayList<UniqueNumberModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        setSupportActionBar(toolbar)

        //Initialize data to show on UI
        for ( i in unique.indices){
            Log.d("VALUE", unique[i].toString())
            numberList.add(UniqueNumberModel(unique[i]))
        }

        adapter = NumberAdapter(this, R.layout.number_layout, numberList)
        grid_view.adapter = adapter


    }

    class NumberAdapter(context: Context, resource: Int, uniqueNumbers: ArrayList<UniqueNumberModel>) : BaseAdapter() {
        private var context = context
        private var numbers = uniqueNumbers
        private var resource = resource

        override fun getCount(): Int {
            return numbers.size
        }

        override fun getItem(position: Int): Any {
            return numbers[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var convertView = convertView

            val holder: ItemHolder
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(resource, null)
                holder = ItemHolder()
                holder.number = convertView!!.findViewById(R.id.number)
                convertView.tag = holder
            } else {
                holder = convertView.tag as ItemHolder
            }

            holder.number!!.text = this.numbers[position].value.toString()

            return convertView
        }
    }

    internal class ItemHolder {
        var number: TextView? = null
    }

}
