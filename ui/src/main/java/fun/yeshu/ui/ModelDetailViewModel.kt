package `fun`.yeshu.ui

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.usecase.QueryModelUseCase
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ModelDetailViewModel (
    private val useCase: QueryModelUseCase
) : ViewModel() {
    val data = MutableLiveData<Model?>()

    fun loadData() {
        viewModelScope.launch {
            data.value = useCase.execute(1)
        }
    }
}