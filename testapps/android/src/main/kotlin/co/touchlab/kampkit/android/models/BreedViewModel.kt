package co.touchlab.kampkit.android.models

import androidx.lifecycle.ViewModel
//import com.example.simpletest.moduleOne.SimpleTest2Class
import com.example.simpletest.moduleOne.SimpleTestClass
import com.example.simpletest.moduleOne.makeSimple
//import com.example.simpletest.moduleOne.makeSimple2
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class BreedViewModel(
//    private val breedRepository: BreedRepository,
) : ViewModel() {

    val dataState1: StateFlow<SimpleTestClass> = MutableStateFlow(makeSimple(isSimple = true, isSimpleName = "SimpleTestClass1"))
//    val dataState2: StateFlow<SimpleTest2Class> = MutableStateFlow(makeSimple2(isSimple = true, isSimpleName = "SimpleTestClass2"))
//
//    val breedListState: StateFlow<List<Breed>> = breedRepository.getBreeds()
//        .stateIn(
//            scope = viewModelScope,
//            initialValue = emptyList(),
//            started = SharingStarted.WhileSubscribed(5000L)
//        )
//
//    val dataEventState: StateFlow<BreedDataEvent> = breedRepository.dataEvents
//        .stateIn(
//            scope = viewModelScope,
//            initialValue = BreedDataEvent.Initial,
//            started = SharingStarted.WhileSubscribed(5000L)
//        )
//
//    fun refreshBreeds(): Job {
//        return viewModelScope.launch {
//            breedRepository.refreshBreeds()
//        }
//    }
//
//    fun updateBreedFavorite(breed: Breed): Job {
//        return viewModelScope.launch {
//            breedRepository.updateBreedFavorite(breed)
//        }
//    }
}