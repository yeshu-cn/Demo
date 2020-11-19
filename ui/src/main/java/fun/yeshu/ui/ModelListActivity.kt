package `fun`.yeshu.ui

import `fun`.yeshu.domain.model.Model
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import org.koin.android.viewmodel.ext.android.viewModel

class ModelListActivity : AppCompatActivity() {
    private val viewModel: ModelListViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model_list)

        viewModel.data.observe(this, Observer {
            showModelList(it)
        })
    }

    private fun showModelList(data: List<Model>) {
        // todo 更新界面
    }

}