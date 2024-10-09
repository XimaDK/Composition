package kadyshev.dmitry.composition.presentation.di

import kadyshev.dmitry.composition.domain.usecases.GenerateQuestionUseCase
import kadyshev.dmitry.composition.domain.usecases.GetGameSettingsUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GenerateQuestionUseCase> {
        GenerateQuestionUseCase(repository = get())
    }

    factory<GetGameSettingsUseCase> {
        GetGameSettingsUseCase(repository = get())
    }
}