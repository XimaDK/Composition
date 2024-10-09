package kadyshev.dmitry.composition.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kadyshev.dmitry.composition.databinding.FragmentChooseLevelBinding
import kadyshev.dmitry.composition.domain.entity.Level

class ChooseLevelFragment : Fragment() {

    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevelBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            buttonLevelTest.setOnClickListener {
                launchGameFragment(level = Level.TEST)
            }
            buttonLevelEasy.setOnClickListener {
                launchGameFragment(level = Level.EASY)
            }
            buttonLevelNormal.setOnClickListener {
                launchGameFragment(level = Level.NORMAL)
            }
            buttonLevelHard.setOnClickListener {
                launchGameFragment(level = Level.HARD)
            }
        }
    }

    private fun launchGameFragment(level: Level) {
        /*val args = Bundle().apply {
            putSerializable(KEY_LEVEL, level)
        }*/
        findNavController().navigate(
            ChooseLevelFragmentDirections.actionChooseLevelFragmentToGameFragment(
                level = level
            )
        )
        /*requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, GameFragment.newInstance(level))
            .addToBackStack(GameFragment.NAME)
            .commit()*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        const val NAME = "ChooseLeveFragment"

        fun newInstance(): ChooseLevelFragment {
            return ChooseLevelFragment()
        }
    }
}