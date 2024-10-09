package kadyshev.dmitry.composition.presentation.di

import kadyshev.dmitry.composition.data.GameRepositoryImpl
import kadyshev.dmitry.composition.domain.repository.GameRepository
import org.koin.dsl.module

val dataModule = module {
    single<GameRepository> {
        GameRepositoryImpl
    }
}