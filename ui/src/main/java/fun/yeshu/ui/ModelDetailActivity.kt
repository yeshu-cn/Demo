package `fun`.yeshu.ui

import `fun`.yeshu.domain.entity.model.Model
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_model_detail.*
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * 显示单个业务数据详情页面
 */
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