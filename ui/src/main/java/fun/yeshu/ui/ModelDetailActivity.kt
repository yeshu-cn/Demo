package `fun`.yeshu.ui

import `fun`.yeshu.domain.model.Model
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_model_detail.*
import kotlinx.android.synthetic.main.list_model_item.view.*
import org.koin.android.viewmodel.ext.android.viewModel
import java.util.*

class ModelDetailActivity : AppCompatActivity() {
    private val viewModel: ModelDetailViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model_detail)

        viewModel.data.observe(this, androidx.lifecycle.Observer {
            showModelDetail(it)
        })

        viewModel.loadData()
    }

    private fun showModelDetail(model: Model?) {
        model_detail_value.text = "value:" + model?.value
        model_detail_time.text = "time:" + model?.time

    }
}