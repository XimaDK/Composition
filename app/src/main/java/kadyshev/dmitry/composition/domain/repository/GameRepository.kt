package kadyshev.dmitry.composition.domain.repository

import kadyshev.dmitry.composition.domain.entity.GameSettings
import kadyshev.dmitry.composition.domain.entity.Level
import kadyshev.dmitry.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(maxSumValue: Int, countOfOption: Int): Question

    fun getGameSettings(level: Level): GameSettings
}