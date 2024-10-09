package kadyshev.dmitry.composition.presentation.di

import kadyshev.dmitry.composition.presentation.AndroidResourceProvider
import kadyshev.dmitry.composition.presentation.ResourceProvider
import org.koin.android.ext.koin.androidContext
import kadyshev.dmitry.composition.presentation.fragments.GameViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single<ResourceProvider> { AndroidResourceProvider(androidContext()) }

    viewModel<GameViewModel> {
        GameViewModel(
            generateQuestionUseCase = get(),
            getGameSettingsUseCase = get(),
             resourceProvider = get()
        )
    }
}