package `fun`.yeshu.demo


import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.usecase.SyncModelDataFromDeviceUseCase
import `fun`.yeshu.ui.ModelAdapter
import `fun`.yeshu.ui.ModelListViewModel
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import org.koin.android.viewmodel.ext.android.viewModel
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_sync.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.getKoin

class SyncDataActivity : AppCompatActivity() {
    private val viewModel: ModelListViewModel by viewModel()
    private val listAdapter by lazy { ModelAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_sync)
        initView()
        viewModel.data.observe(this, Observer {
            showModelList(it)
        })

    }

    private fun showModelList(data: List<Model>) {
        pb_sync.visibility = View.GONE
        tv_message.visibility = View.VISIBLE
        listAdapter.setData(data)
    }

    private fun initView() {
        val manager = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.VERTICAL
        rv_list.layoutManager = manager
        rv_list.adapter = listAdapter
    }

    fun onClickSyncDeviceData(view: View) {
        btn_sync.visibility = View.GONE
        pb_sync.visibility = View.VISIBLE
        pb_sync.postDelayed({
            GlobalScope.launch {
                /**
                 * 同步数据成功
                 */
                val useCase = getKoin().get<SyncModelDataFromDeviceUseCase>()
                useCase.execute(System.currentTimeMillis())
                viewModel.loadData()
            }
        }, 1000)

    }
}