package kadyshev.dmitry.composition.domain.usecases

import kadyshev.dmitry.composition.domain.entity.GameSettings
import kadyshev.dmitry.composition.domain.entity.Question
import kadyshev.dmitry.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(
            maxSumValue = maxSumValue,
            countOfOption = COUNT_OF_OPTIONS
        )
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}