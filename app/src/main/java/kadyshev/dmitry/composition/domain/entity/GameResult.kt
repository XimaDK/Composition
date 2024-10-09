package kadyshev.dmitry.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOfRightQuestions: Int,
    val gameSettings: GameSettings
) : Parcelable