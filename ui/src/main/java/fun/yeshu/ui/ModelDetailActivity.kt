package `fun`.yeshu.ui

import `fun`.yeshu.domain.model.Model
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

    private fun showModelDetail(model: Model) {

    }
}