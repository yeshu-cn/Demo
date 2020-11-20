package `fun`.yeshu.ui

import `fun`.yeshu.domain.model.Model
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_model_list.rv_list
import org.koin.android.viewmodel.ext.android.viewModel


class ModelListActivity : AppCompatActivity() {
    private val viewModel: ModelListViewModel by viewModel()
    private val listAdapter by lazy { ModelAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model_list)
        initView()
        viewModel.data.observe(this, Observer {
            it == null
            showModelList(it)
        })

        viewModel.loadData()
    }

    private fun showModelList(data: List<Model>) {
        listAdapter.setData(data)
    }

    private fun initView() {
        val manager = LinearLayoutManager(this)
        val dividerItemDecoration = DividerItemDecoration(this, manager.orientation)
        manager.orientation = LinearLayoutManager.VERTICAL
        rv_list.layoutManager = manager
        rv_list.adapter = listAdapter
        rv_list.addItemDecoration(dividerItemDecoration)
    }

}