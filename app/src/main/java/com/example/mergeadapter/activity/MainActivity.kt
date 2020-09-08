package com.example.mergeadapter.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.MergeAdapter
import com.example.mergeadapter.R
import com.example.mergeadapter.adapter.mexlogicadapter.MexLogicAdapter
import com.example.mergeadapter.adapter.mayadapter.MayAdapter
import com.example.mergeadapter.model.getMayList
import com.example.mergeadapter.model.getMexLogicList
import kotlinx.android.synthetic.main.activity_main.recyclerview

class MainActivity : AppCompatActivity() {

    private lateinit var mayAdapter: MayAdapter
    private lateinit var mexLogicAdapter: MexLogicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAdapter() //Se inicializan los adaptadores
        initRecyclerView() // se inicializa el recyclerview (se hace con MergeAdapter)
        initListener() // Este metodo nos permite "saber" que item se le hizo click y retorna su informacion
        loadMayData() // aqui simplemente se cargan los datos del primer adapter
        loadMexLogicData() // aqio se cargan los datos del segundo adapter
    }

    private fun initAdapter() {
        mayAdapter = MayAdapter()
        mexLogicAdapter = MexLogicAdapter()
    }

    private fun initRecyclerView() {
        recyclerview.adapter = MergeAdapter(mayAdapter, mexLogicAdapter)
    }

    private fun initListener() {
        mayAdapter.onMayItemListener = {
            Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
        }

        mexLogicAdapter.onMexLogicItemListener = {
            Toast.makeText(this, it.instagram, Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadMayData() {
        val mayList = getMayList() // la funcion getMayList simplemente regresa una lista de items

        mayAdapter.mayItemList = mayList // le indicamos al adapter, esta es la lista que deben dibujar
        mayAdapter.notifyItemRangeInserted(0, mayList.size) // le indicamos al adaptador, que haga un F5 :p sobre los elementos agregados, esto es para que los muestre en pantalla
        recyclerview.scrollToPosition(0) // le decimos al scroll que se mueva al primer item
    }

    //Es exactamente lo mismo de arriba
    private fun loadMexLogicData() {
        val mexLogicList = getMexLogicList()
        mexLogicAdapter.mexLogicItems = mexLogicList
        mexLogicAdapter.notifyItemRangeInserted(0, mexLogicList.size)
        recyclerview.scrollToPosition(0)
    }
}