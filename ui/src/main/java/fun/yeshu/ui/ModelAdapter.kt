package `fun`.yeshu.ui

import `fun`.yeshu.domain.entity.model.Model
import `fun`.yeshu.ui.uitls.TimeFormatUtils
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_model_item.view.*

class ModelAdapter: RecyclerView.Adapter<ModelViewHolder>() {
    private val dataList = mutableListOf<Model>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        return ModelViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

     fun setData(newDataList: List<Model>) {
        dataList.apply {
            clear()
            addAll(newDataList)
        }
        notifyDataSetChanged()
    }
}

class ModelViewHolder(parent: ViewGroup)
    : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_model_item, parent, false)) {

    fun bind(item: Model) {
        itemView.apply {
            model_item_value.text = "value:" + item.value
            model_item_time.text = TimeFormatUtils.formatTime(item.time)
        }
    }

}