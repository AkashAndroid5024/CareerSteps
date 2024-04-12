package com.example.careersteps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.careersteps.databinding.FragmentQuestionnaireBinding


/* class QuestionnaireFragment : Fragment() {
   // Declare a variable to hold the binding object
   private var _binding: FragmentQuestionnaireBinding? = null
   // Create a binding object only if the fragment is attached to its host
   private val binding get() = _binding!!

   override fun onCreateView(
       inflater: LayoutInflater, container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View? {
       // Inflate the layout using the binding object
       _binding = FragmentQuestionnaireBinding.inflate(inflater, container, false)
       return binding.root
   }

    /*override fun onCreateView(
       inflater: LayoutInflater, container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View? {
       // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_questionnaire, container, false)
   }


     */
   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)

       // Access and display Question 1 and its options

        binding.textViewQuestion.text = QuestionData.QUESTION_1
        binding.radioButtonOption1.text = QuestionData.OPTIONS_1[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_1[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_1[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_1[3]

       // Access and display Question 2 and its options
       // Similarly, access and display other questions and options
        // Access and display Question 2 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_2
        binding.radioButtonOption1.text = QuestionData.OPTIONS_2[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_2[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_2[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_2[3]

// Access and display Question 3 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_3
        binding.radioButtonOption1.text = QuestionData.OPTIONS_3[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_3[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_3[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_3[3]

// Access and display Question 4 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_4
        binding.radioButtonOption1.text = QuestionData.OPTIONS_4[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_4[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_4[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_4[3]


// Access and display Question 5 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_5
        binding.radioButtonOption1.text = QuestionData.OPTIONS_5[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_5[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_5[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_5[3]

// Access and display Question 6 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_6
        binding.radioButtonOption1.text = QuestionData.OPTIONS_6[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_6[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_6[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_6[3]

// Access and display Question 7 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_7
        binding.radioButtonOption1.text = QuestionData.OPTIONS_7[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_7[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_7[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_7[3]

// Access and display Question 8 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_8
        binding.radioButtonOption1.text = QuestionData.OPTIONS_8[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_8[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_8[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_8[3]


// Access and display Question 9 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_9
        binding.radioButtonOption1.text = QuestionData.OPTIONS_9[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_9[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_9[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_9[3]

// Access and display Question 10 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_10
        binding.radioButtonOption1.text = QuestionData.OPTIONS_10[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_10[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_10[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_10[3]

/// Access and display Question 11 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_11
        binding.radioButtonOption1.text = QuestionData.OPTIONS_11[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_11[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_11[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_11[3]

// Access and display Question 12 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_12
        binding.radioButtonOption1.text = QuestionData.OPTIONS_12[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_12[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_12[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_12[3]

// Access and display Question 13 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_13
        binding.radioButtonOption1.text = QuestionData.OPTIONS_13[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_13[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_13[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_13[3]

// Access and display Question 14 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_14
        binding.radioButtonOption1.text = QuestionData.OPTIONS_14[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_14[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_14[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_14[3]

// Access and display Question 15 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_15
        binding.radioButtonOption1.text = QuestionData.OPTIONS_15[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_15[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_15[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_15[3]

// Access and display Question 16 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_16
        binding.radioButtonOption1.text = QuestionData.OPTIONS_16[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_16[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_16[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_16[3]

// Access and display Question 17 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_17
        binding.radioButtonOption1.text = QuestionData.OPTIONS_17[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_17[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_17[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_17[3]

// Access and display Question 18 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_18
        binding.radioButtonOption1.text = QuestionData.OPTIONS_18[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_18[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_18[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_18[3]

// Access and display Question 19 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_19
        binding.radioButtonOption1.text = QuestionData.OPTIONS_19[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_19[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_19[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_19[3]

// Access and display Question 20 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_20
        binding.radioButtonOption1.text = QuestionData.OPTIONS_20[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_20[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_20[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_20[3]

// Access and display Question 21 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_21
        binding.radioButtonOption1.text = QuestionData.OPTIONS_21[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_21[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_21[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_21[3]

// Access and display Question 22 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_22
        binding.radioButtonOption1.text = QuestionData.OPTIONS_22[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_22[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_22[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_22[3]

// Access and display Question 23 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_23
        binding.radioButtonOption1.text = QuestionData.OPTIONS_23[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_23[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_23[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_23[3]

// Access and display Question 24 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_24
        binding.radioButtonOption1.text = QuestionData.OPTIONS_24[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_24[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_24[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_24[3]

// Access and display Question 25 and its options
        binding.textViewQuestion.text = QuestionData.QUESTION_25
        binding.radioButtonOption1.text = QuestionData.OPTIONS_25[0]
        binding.radioButtonOption2.text = QuestionData.OPTIONS_25[1]
        binding.radioButtonOption3.text = QuestionData.OPTIONS_25[2]
        binding.radioButtonOption4.text = QuestionData.OPTIONS_25[3]


   }
   override fun onDestroyView() {
       super.onDestroyView()
       // Clear the binding object when the view is destroyed to avoid memory leaks
       _binding = null
   }
}
*/
 class QuestionnaireFragment : Fragment() {

  private var currentQuestionIndex = 0
  private var _binding: FragmentQuestionnaireBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
   inflater: LayoutInflater, container: ViewGroup?,
   savedInstanceState: Bundle?
  ): View? {
   _binding = FragmentQuestionnaireBinding.inflate(inflater, container, false)
   return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
   super.onViewCreated(view, savedInstanceState)

   displayQuestionAndOptions()

   binding.buttonPrevious.setOnClickListener {
    if (currentQuestionIndex > 0) {
     currentQuestionIndex--
     displayQuestionAndOptions()
    }
   }

   binding.buttonNext.setOnClickListener {
    if (currentQuestionIndex < QuestionData.questions.size - 1) {
     currentQuestionIndex++
     displayQuestionAndOptions()
    }
   }
  }

  private fun displayQuestionAndOptions() {
   val currentQuestion = QuestionData.questions[currentQuestionIndex]
   binding.textViewQuestion.text = currentQuestion.questionText
   binding.radioButtonOption1.text = currentQuestion.options[0]
   binding.radioButtonOption2.text = currentQuestion.options[1]
   binding.radioButtonOption3.text = currentQuestion.options[2]
   binding.radioButtonOption4.text = currentQuestion.options[3]
  }

  override fun onDestroyView() {
   super.onDestroyView()
   _binding = null
  }
 }



