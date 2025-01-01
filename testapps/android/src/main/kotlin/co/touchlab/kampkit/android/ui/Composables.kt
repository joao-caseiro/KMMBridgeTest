package co.touchlab.kampkit.android.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import co.touchlab.kampkit.android.R
import co.touchlab.kampkit.android.models.BreedViewModel
//import com.example.simpletest.moduleOne.SimpleTest2Class
import com.example.simpletest.moduleOne.SimpleTestClass
import com.example.simpletest.moduleOne.makeSimple
//import com.example.simpletest.moduleOne.makeSimple2

@Composable
fun MainScreen(
    viewModel: BreedViewModel,
) {
    val dataState1 by viewModel.dataState1.collectAsStateWithLifecycle()
//    val dataState2 by viewModel.dataState2.collectAsStateWithLifecycle()
    val scope = rememberCoroutineScope()

    MainScreenContent(
        dataState1 = dataState1,
//        dataState2 = dataState2,
    )
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainScreenContent(
    dataState1: SimpleTestClass,
//    dataState2: SimpleTest2Class,
) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = dataState1.simpleString)
//            Text(text = dataState2.simpleString)
        }
    }
}

@Composable
fun Empty() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.empty_breeds))
    }
}

@Composable
fun Error(error: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = error)
    }
}

@Preview
@Composable
fun MainScreenContentPreview_Success() {
    MainScreenContent(
        dataState1 = makeSimple(true, "Test1"),
//        dataState2 = makeSimple2(true, "Test2"),
    )
}
