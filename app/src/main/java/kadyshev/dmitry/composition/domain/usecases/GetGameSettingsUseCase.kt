package kadyshev.dmitry.composition.domain.usecases

import kadyshev.dmitry.composition.domain.entity.GameSettings
import kadyshev.dmitry.composition.domain.entity.Level
import kadyshev.dmitry.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level = level)
    }
}