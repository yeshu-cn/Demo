package `fun`.yeshu.ui

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.usecase.QueryModelListUseCase
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ModelListViewModel(
    private val useCase: QueryModelListUseCase
) : ViewModel() {
    val data = MutableLiveData<List<Model>>()

    fun loadData() {
        viewModelScope.launch {
            data.value = useCase.execute()
        }
    }
}